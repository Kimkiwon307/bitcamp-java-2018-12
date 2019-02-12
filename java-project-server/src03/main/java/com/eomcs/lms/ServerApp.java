// 2단계 클라이언트의 연결을 승인한다.
package com.eomcs.lms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

  public static void main(String[] args) {
    while(true) {
    try(ServerSocket serversocket = new ServerSocket(8888);
        Socket socket = serversocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader (new InputStreamReader(socket.getInputStream()))){
        
          System.out.println("클라이언트와 연결 되었음");
          
          out.println("Hello");
          out.flush();
    }catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println("클라이언트와 연결 끊어짐");
    }
  }

}
