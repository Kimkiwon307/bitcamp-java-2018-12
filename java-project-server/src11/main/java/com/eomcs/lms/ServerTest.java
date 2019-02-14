package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import com.eomcs.lms.domain.Member;

public class ServerTest {

  static ObjectInputStream in ;
  static ObjectOutputStream out ;

  public static void main(String []args) {

    try(
        Socket socket = new Socket("localhost",8888);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ){

      System.out.println("서버와 연결되었음");
      ServerTest.in = in;
      ServerTest.out = out;

      new MemberTest(in, out).test();
      new LessonTest(in, out).test();
      new BoardTest(in, out).test();

      quit();


    }catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println("연결끊었음");
  }
  static void quit() throws Exception {
    out.writeUTF("quit");
    out.flush();
    System.out.println(in.readUTF());
  }

}
