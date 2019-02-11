
package ch23.c;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

  public static void main(String [] args) throws Exception {

    ServerSocket serverSocket = new ServerSocket(8888);

    Socket socket = serverSocket.accept();
    InputStream in2 = socket.getInputStream();
    DataInputStream in = new DataInputStream(in2);
    
    while(true) {
      int no1 = in.read();
      String op = in.readUTF();
      int no2 = in.read();
      int result =0;
     
      switch (op) {
        case "+": result = no1 +no2 ; break;
        case "-": result = no1 -no2;break;
        case "*": result = no1 *no2;break;
        case "/":result = no1 /no2;break;
        default :
           System.out.println(op + "연산자를 지원하지 않습니다.");
           System.out.println("----------------------");
            continue;
      }
    
      
      System.out.println(" 계산기 서버에 오신 걸 환영합니다!");
      System.out.println(" 계산식을 입력하세요.");
      System.out.println(" 예) 23 + 7");
      System.out.println(" 결과는" + result + "입니다");
      System.out.println("----------------------");
    }
  }
}