// 계산기 클라이언트 만들기
package ch23.c;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {
  @SuppressWarnings({"unused", "resource"})
  public static void main (String []args) throws UnknownHostException, IOException {

    Scanner keyboard = new Scanner(System.in);
    
    Socket socket = new Socket("localhost",8888);
    
    System.out.println("서버와 연결되었음!");
   
    OutputStream out = socket.getOutputStream();
    Scanner in = new Scanner(System.in);

     int no1 = Integer.parseInt(in.nextLine());
     int no2 = Integer.parseInt(in.nextLine());
     
    out.write(no1 + no2);
    System.out.println("서버에 데이터를 보냈음!");


  
  }
}
