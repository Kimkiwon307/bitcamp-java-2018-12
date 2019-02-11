package ch23.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
  public static void main(String [] args) {

    try (Socket socket = new Socket("localhost",8888);
        Scanner kb = new Scanner (System.in); ){

      try(
          BufferedReader in2 = new BufferedReader(new InputStreamReader (socket.getInputStream()));
          PrintStream out = new PrintStream(socket.getOutputStream());
          ){
        System.out.print("> ");
        out.println(kb.nextLine());
        out.flush();
          
        String anser = in2.readLine();
      
        
        System.out.println(anser);
      }  catch(Exception e) {
        System.out.println("틀렷어요~");
      }
    } catch (IOException e) {
      
    }




  }
}
