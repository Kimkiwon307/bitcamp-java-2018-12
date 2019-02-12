// Stateless 응용 - 서버에서 계산 결과 유지하기
package ch23.test;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// Stateless는 응답을 받은 후에 연결을 끊는다.
// 다시 요청할 때는 서버와 연결을 다시 한다.
// 서버쪽에서는 어떡게 클라이언트를 구분하여 작업 결과를 유지할 것인가?
  

public class CalculatorClient {

   
  public static void main(String[] args) {
    
     long SessionId = 0;

    Scanner keyboard = new Scanner(System.in);

    while(true) {
     
      System.out.print("> ");
      String input = keyboard.nextLine();

      if(input.equalsIgnoreCase("q"))
        break;
      try (
          Socket socket = new Socket("localhost", 8888);
          PrintStream out = new PrintStream(socket.getOutputStream());
          BufferedReader in = new BufferedReader(
              new InputStreamReader(socket.getInputStream()))) {


        System.out.println("서버와 연결됨! 서버에게 계산작업을 요청함!");
          
        out.println(SessionId);
        out.println(input);
        out.flush();
        
        if(SessionId == 0) {
          SessionId = Long.parseLong(in.readLine());
          System.out.printf("발급받은 세션 ID: %d\n", SessionId);
        }
        
        
        String response = in.readLine();

        System.out.println(response);

       
      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println("서버와 연결 끊음!");
    } //while  
    keyboard.close();
  }
}



