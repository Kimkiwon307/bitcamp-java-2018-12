package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import com.eomcs.lms.domain.Member;

public class ServerTest {
  public static void main(String []args) {

    try(
        Socket socket = new Socket("localhost",8888);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());


        ){

      System.out.println("서버와 연결되었음");

      Member member = new Member();
      member.setNo(1);
      member.setName("홍길동");
      member.setEmail("hong@test.com");
      member.setPassword("111");
      member.setPhoto("hong.gif");
      member.setTel("11111-1111");

      //member 객체를 서버로 시리얼라이즈하라
      out.writeObject(member);
      out.flush();
      //또한 
      Member request = (Member)in.readObject();
      System.out.println("객체받음");

      System.out.println("서버와 연결끊었음");

    }catch(Exception e) {

    }
  }
}
