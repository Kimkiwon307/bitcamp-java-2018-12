// 11단계: 서비스 클래스의 일반화(상속)를 수행한다.
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.service.BoardService;
import com.eomcs.lms.service.LessonService;
import com.eomcs.lms.service.MemberService;
import com.eomcs.lms.service.Service;

public class ServerApp {


  static MemberDao memberDao= null;
  static LessonDao lessonDao = null;
  static BoardDao boardDao = null; 

  public static void main(String[] args) {

    try {
      boardDao = new BoardDao("board.bin");
      boardDao.loadData();
    } catch (Exception e) {
      System.out.println("게시물 데이터 로딩 중 오류 발생!");
    }

    try {
      lessonDao = new LessonDao("lesson.bin");
      lessonDao.loadData();
    } catch (Exception e) {
      System.out.println("게시물 데이터 로딩 중 오류 발생!");
    }


    try {
      memberDao = new MemberDao("member.bin");
      memberDao.loadData();
    } catch (Exception e) {
      System.out.println("게시물 데이터 로딩 중 오류 발생!");
    }

    HashMap<String,Service >servicemap = new HashMap<>();
    servicemap.put("/board/", new BoardService(boardDao));
    servicemap.put("/member/", new MemberService(memberDao));
    servicemap.put("/lesson/", new LessonService(lessonDao));

    Set<String> keySet = servicemap.keySet();

    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 시작!");

      while (true) {
        try (Socket socket = serverSocket.accept();
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {


          System.out.println("클라이언트와 연결되었음.");

          String request = in.readUTF();
          System.out.println(request);

          if(request.equals("quit")) {
            quit(in,out);
            out.flush();
            continue;
          }
          String serviceName = null;
          for(String key : keySet) {
            if(request.startsWith(key)) {
              serviceName = key;
              break;
            }
          }


          if (serviceName == null ) {
            out.writeUTF("FAIL");
          }else {
            Service service =servicemap.get(serviceName);
            service.execute(request, in, out);
          }
          out.flush();

        } catch (Exception e) {
          e.printStackTrace();
        }
        System.out.println("클라이언트와의 연결을 끊었음.");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static void quit(ObjectInputStream in,ObjectOutputStream out) throws Exception {
    try {
      boardDao.saveData();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      //e.printStackTrace();
    }

    try {
      memberDao.saveData();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      //e.printStackTrace();
    }

    try {
      lessonDao.saveData();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      //e.printStackTrace();
    }
    out.writeUTF("종료함!");
  }
}







