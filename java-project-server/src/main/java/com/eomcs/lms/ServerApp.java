// 2단계 클라이언트의 연결을 승인한다.
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import com.eomcs.lms.domain.Member;

public class ServerApp {

  public static void main(String[] args) {
    while(true) {
      try(ServerSocket serversocket = new ServerSocket(8888);
          Socket socket = serversocket.accept();
          ObjectInputStream in = new ObjectInputStream(socket.getInputStream());  
          ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
          ){

        System.out.println("클라이언트와 연결 되었음");

        Member request =(Member) in.readObject();
        out.writeObject(request);
        out.flush();
        System.out.println(request);

      }catch(Exception e) {
        e.printStackTrace();
      }
      System.out.println("클라이언트와 연결 끊어짐");
    }
  }

}
