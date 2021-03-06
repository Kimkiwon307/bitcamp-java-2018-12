// 2단계 클라이언트의 연결을 승인한다.
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.BoardService;
import com.eomcs.lms.service.LessonService;
import com.eomcs.lms.service.MemberService;

public class ServerApp {

 
  static ObjectInputStream in ;
  static ObjectOutputStream out;

  static MemberService memberService = null;
  static BoardService boardService = null;
  static LessonService lessonService = null;
  
  public static void main(String[] args) {

    System.out.println("서버 시작");
    try {
      boardService = new BoardService();
      boardService.loadData("board.bin");
    }catch (Exception e) {
      System.out.println("게시물 데이터 로딩중 오류발생");
    //e.printStackTrace(); 
    }

    try {
      memberService = new MemberService();
      memberService.loadData("member.bin");
    }catch (Exception e) {
      System.out.println("회원 데이터 로딩중 오류발생");
   //   e.printStackTrace(); 
    }

    try {
      lessonService = new LessonService();
      lessonService.loadData("lesson.bin");
    }catch (Exception e) {
      System.out.println("수업 데이터 로딩중 오류발생");
    //e.printStackTrace(); 
    }

    while(true) {
      try(ServerSocket serversocket = new ServerSocket(8888);
          Socket socket = serversocket.accept();
          ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
          ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
          )
      {
        
        boardService.init(in, out);
        memberService.init(in,out);
        lessonService.init(in, out);
        
        System.out.println("클라이언트와 연결 되었음");


        ServerApp.in = in;
        ServerApp.out = out;

        loop:while(true) {
          String request = in.readUTF();
          System.out.println(request);

          //스위치는 값 단순 비교 if는 복잡비교

          if(request.startsWith(("/member/"))){
            memberService.excute(request);
          }else if(request.startsWith("/lesson/")) {
            lessonService.excute(request);
          }else if(request.startsWith("/board/")) {
            boardService.excute(request);
          }else if (request.equals("quit")) {
            quit();
            break loop;
          }else {
            out.writeUTF("FAIL");
          }
          out.flush();
        }

      }catch(Exception e) {
        e.printStackTrace();
      }
      System.out.println("클라이언트와 연결 끊어짐");
    }
  }

  static void quit() throws Exception {
    try{
      boardService.saveData();
    }catch(Exception e) {
      System.out.println(e.getMessage());
      //e.printStackTrace();
    }
    try{
      lessonService.saveData();
    }catch(Exception e) {
      System.out.println(e.getMessage());
     // e.printStackTrace();
    }
    try{
      memberService.saveData();
    }catch(Exception e) {
      System.out.println(e.getMessage());
     // e.printStackTrace();
    }
    out.writeUTF("종료함");
    out.flush();
  }

}
