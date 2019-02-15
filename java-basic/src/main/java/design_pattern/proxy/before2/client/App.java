// 2단계 - Client / Server 계산기 애플리케이션 만들기

package design_pattern.proxy.before2.client;

import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner kb = new Scanner(System.in);

    CalculatorClient calcStub = new CalculatorClient();

    while(true) {
      
      System.out.print("계싼식> ");
      String input = kb.nextLine();
      if(input.equalsIgnoreCase("q")) {
        break;
      }
      String []  values =input.split(" ");
      try {
        System.out.println(calcStub.compute(
            Integer.parseInt(values[0]), Integer.parseInt(values[2]), values[1]));

      }catch(Exception e) {
        System.out.println("식 또는 계산 오류: " + e.getMessage());
      }
    }
  }

}
