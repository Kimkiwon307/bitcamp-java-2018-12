// Stateless Server만들
package ch23.test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class CalculatorServer {
  public static void main(String[] args) {
    
    HashMap<Long,Integer>map = new HashMap<>();
    
    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");

      int result = 0;
    
      while (true) {
        try (Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());) {

          System.out.println("클라이언트와 연결됨 ! 요청처리 중....");
            
           long sessionid = Long.parseLong(in.readLine());
           String[] input = in.readLine().split(" ");
           boolean isNewSessionId = false;

           if(sessionid == 0) {
             sessionid = System.currentTimeMillis();
             isNewSessionId = true;
           }else {
             // 클라이언트의 세션 ID로 기존에 저장된 결과 값을 가져온다.
             result = map.get(sessionid); // auto-unboxing => Integer.intValue()
           }
          int b = 0 ;
          String op = null;
          
          try {
            op = input[0];
            b = Integer.parseInt(input[1]);
            
          }catch (Exception e) {
            out.println("식의 형식이 바르지 않습니다.");
            out.flush();
            continue;
          }
          switch (op) {
            case "+": result += b; break;
            case "-": result -= b; break;
            case "*": result *= b; break;
            case "/": result /= b; break;
            case "%": result %= b; break;
            default:
              out.printf("%s 연산자를 지원하지 않습니다.\n", op);
              out.flush();
              continue;
          }
          map.put(sessionid, result);
          if (isNewSessionId) {
            out.println(sessionid);
            out.flush();
          }
          out.printf("결과는 %d 입니다.\n", result);
          out.flush();


        }catch (Exception e ) {
          //클라이언트 요청을 처리하다가 예외가 발생하면 무시한다
          System.out.println("클라이언트와 통신중 오류 발생!");
        }
        System.out.println("클라이언트와 연결 끊음!");

      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}