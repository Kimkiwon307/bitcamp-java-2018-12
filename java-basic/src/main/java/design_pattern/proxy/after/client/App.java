// 

package design_pattern.proxy.after.client;

import java.util.Scanner;
import design_pattern.proxy.after.server.Calculator;
import design_pattern.proxy.after.server.CalculatorStub;

public class App {
static  Scanner kb = new Scanner(System.in);

  public static void main(String[] args) throws Exception {

    Calculator calc = new CalculatorStub();

    while(true) {

      System.out.print("계싼식> ");
      String input = kb.nextLine();
      if(input.equalsIgnoreCase("q")) {
        break;
      }
      String []  values =input.split(" ");
      try {

        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[2]);
        String op = values[1];

        switch (op) {
          case "+" :
            System.out.println(calc.plus(a,b));
            break;
          case "-" :
            System.out.println(calc.minus(a, b));
            break;
          default:
            System.out.println("해당연산자 지원하지 않음");
        }

      }catch(Exception e) {
        System.out.println("식 또는 계산 오류: " + e.getMessage());
      }
    }//while
  }

}
