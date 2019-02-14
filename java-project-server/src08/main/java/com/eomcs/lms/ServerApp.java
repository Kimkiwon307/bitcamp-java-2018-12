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

public class ServerApp {

  static ArrayList<Member> members = new ArrayList<>();
  static ArrayList<Lesson> lessons = new ArrayList<>();
  static ArrayList<Board> boards = new ArrayList<>();

  static ObjectInputStream in ;
  static ObjectOutputStream out;

  public static void main(String[] args) {


    System.out.println("서버 시작");
    while(true) {
      try(ServerSocket serversocket = new ServerSocket(8888);
          Socket socket = serversocket.accept();
          ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
          ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
          ){
        System.out.println("클라이언트와 연결 되었음");

        members.clear();
        lessons.clear();
        boards.clear();

        ServerApp.in = in;
        ServerApp.out = out;

        MemberService memberService = new MemberService(in,out);
        BoardService boardService = new BoardService(in,out);
        LessonService lessonService = new LessonService(in,out);
        MemberService.in = in;
        MemberService.out =out;
        LessonService.in = in;
        LessonService.out =out;
        BoardService.in = in;
        BoardService.out =out;

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
    out.writeUTF("종료함");
    out.flush();
  }

}
