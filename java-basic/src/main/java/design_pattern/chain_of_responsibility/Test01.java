package design_pattern.chain_of_responsibility;

import java.util.Scanner;

public class Test01 {

  public static void main (String [] args) {

    Scanner kb = new Scanner(System.in);
    TerminalHandler terminalHandler = new TerminalHandler();
    PlusHandler plusHandler = new PlusHandler();
    MinusHandler minusHandler = new MinusHandler();
    MultipleHandler multipleHandler = new MultipleHandler();
   
    plusHandler.setNext(multipleHandler);
    minusHandler.setNext(plusHandler);
    multipleHandler.setNext(terminalHandler);
    
    while(true) {
      
      System.out.print("a? : ");
      int a = kb.nextInt();
      
      System.out.print("b? : ");
      int b = kb.nextInt();
      
      System.out.print("op? : ");
      String op = kb.next();
        
      minusHandler.handle(a, b, op);
    }//while

  }
}
