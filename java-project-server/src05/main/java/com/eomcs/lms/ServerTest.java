package com.eomcs.lms;

import java.io.IOException;
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

      add(new Member(1,"홍길동"));
      add(new Member(2,"임꺽정"));

      list();
      quit();
    
    
     
      out.writeUTF("okok");
      out.flush();
      System.out.println(in.readUTF());

    


      System.out.println("서버와 연결끊었음");

    }catch(Exception e) {

    }
  }
  static void add(Member member) throws Exception {
    out.writeUTF("add");
    out.writeObject(member);
    out.flush();
    System.out.println(in.readUTF());

  }
  
  static void list() throws Exception {
    out.writeUTF("list");
    out.flush();
    @SuppressWarnings("unchecked")
    List<Member> members = (List<Member>) in.readObject();
    for(Member m : members) {
      System.out.println(m);
    }
    
  }
  
  static void quit() throws Exception {
    out.writeUTF("quit");
    out.flush();
    System.out.println(in.readUTF());
  }
}
