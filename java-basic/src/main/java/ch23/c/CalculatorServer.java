
package ch23.c;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
  public static void main(String [] args) throws Exception {
    
    
    ServerSocket serverSocket = new ServerSocket(8888);
    
    Socket socket = serverSocket.accept();
    InputStream in = socket.getInputStream();

    System.out.println(" 계산기 서버에 오신 걸 환영합니다!");
    System.out.println(" 계산식을 입력하세요.");
    System.out.println(" 예) 23 + 7");
    System.out.println(in.read());
    
  }
}
