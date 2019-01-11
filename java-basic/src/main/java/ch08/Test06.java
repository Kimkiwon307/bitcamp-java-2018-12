// 클래스 문법의 또 다른도 용
package ch08;

import java.util.Scanner;

public class Test06{

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.println("계산식?(예: 12 *2 ");
    int a = kb.nextInt();
    String op = kb.next();
    int b = kb.nextInt();
   
    kb.close();
    int result = 0;
    switch(op) {
      case "+": result = Calculator.plus(a, b); break;
      case "-": result = Calculator.minus(a,b); break;
      case "*": result = Calculator.multiple(a,b); break;
      case "/": result = Calculator.divide(a,b); break;
      default:
        System.out.println("지원하지 안흔ㄴ 연산자 입니다.");
        return; //main()메서드를 그만 실행하고 나간다. 즉 jvm종료!
    }
    System.out.printf("%d %s %d =  %d\n", a,op,b,result);
  }
  static int plus (int a, int b) {
    return a + b;
  }
  static int minus(int a, int b) {
    return a - b ;
  }
  static int multiple(int a, int b) {
    return a * b ;
  }
  static int divide(int a, int b) {
    return a / b ;
  }

}

