// 2단계 클라이언트의 연결을 승인한다.
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import com.eomcs.lms.domain.Member;

public class ServerApp {

  static ArrayList<Member> members = new ArrayList<>();
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
        ServerApp.in = in;
        ServerApp.out = out;


        loop:   while(true) {
          String request = in.readUTF();
          System.out.println(request);

          switch(request) {
            case "quit" :
              quit();
              break loop;
            case "add" : 
              add();
              break;
            case "list" :
              list();
              break;
            default :
              out.writeUTF("이 명령어 처리를 못함");
              break;
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

  static void add() throws Exception {
    members.add((Member)in.readObject());
    out.writeUTF("OK");
  }
  static void list() throws Exception {
    out.writeObject(members);
  }

}
