// Connection-Oriented vs ConnectionLess
package ch23.f;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
  public static void main(String[]args) {

    // Connection-Oriented = Connectionful
    //  => 데이터를 주고 받으려면 항상 먼저 연결해야 한다.
    //  => Socket,ServerSocket을 사용하여 처리한다.
    try(
        ServerSocket serversocket = new ServerSocket(8888);
        ){
      while(true) {
        try(Socket socket = serversocket.accept();
            PrintStream out = new PrintStream(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream())){
          System.out.println("클라이언트와 연결됨");
          // 먼저 연결을 한 다음에 데이터를 보내고 받을 수 있따.
          
          String request = in.nextLine();
          System.out.println("데이터받음");
          
          out.println("ㅗㅗ" + request + " ㅗㅗ ");
          System.out.println("데이터보냄");



        }catch (Exception e) {
          e.printStackTrace();
        }
      }
    }catch (Exception e) {
      e.printStackTrace();
    }

  }
}