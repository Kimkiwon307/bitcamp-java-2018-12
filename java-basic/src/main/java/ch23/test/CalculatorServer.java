package ch23.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

  public static void main(String [] args ) {
      
    try(ServerSocket serversocket = new ServerSocket(8888);
        ) {
      while(true) {
        try( Socket socket = serversocket.accept();

            BufferedReader in2 = new BufferedReader(new InputStreamReader (socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());
            ){

          String[] b = in2.readLine().split(" ");

          int no1 = Integer.parseInt(b[0]);
          String op = b[1];
          int no2 = Integer.parseInt(b[2]);
          int result = 0;

          switch(op) {
            case "+" : result = no1 + no2 ; break;
            case "-" : result = no1 - no2 ; break;
            case "*" : result = no1 * no2 ; break;
            case "/" : result = no1 / no2 ; break;
            case "%" : result = no1 % no2 ; break;
            default : {out.printf("%s는 잘못된형식\n",op);
                       out.flush();
                       continue;
            }
          }
          out.println(result);
          out.flush();
        }catch(Exception e) {
              System.out.println("잘못된형식입니다.");
        };
      }
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
