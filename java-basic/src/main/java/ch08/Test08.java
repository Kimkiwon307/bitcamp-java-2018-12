// 패키지 용도 - 서로 관련된 일이나 유사한 일을 하는 클래스를 분류할 때 사용한다.
package ch08;

import java.util.Scanner;

public class Test08{

  public static void main(String[] args) {
    //Calculator 클래스를 향후 유지보수하기 쉽도록 별도의 패키지로 분류한다.
    //=>ch08.util 패키지를 만들어 분류한다
    Scanner kb = new Scanner(System.in);

    System.out.println("계산식?(예: 12 *2 ");
    int a = kb.nextInt();
    String op = kb.next();
    int b = kb.nextInt();
    int result = 0;
    kb.close();
    //다른 패키지로 분류한 클래스를 사용한다는 것을 보여주기위해
    // 일부러 임포트 를 하지 않고 클래스를 사용한다.
    // 이유? 메서드의 접근 허용이 같은 패키지만 가능하기 때문이다.
    // 해결책 ? 해당 클래스로 가서 메서드를 공개하라!
    switch(op) {
      case "+": result = ch08.util.Calculator2.plus(a, b); break;
      case "-": result = ch08.util.Calculator2.minus(a,b); break;
      case "*": result = ch08.util.Calculator2.multiple(a,b); break;
      case "/": result = ch08.util.Calculator2.divide(a,b); break;
      default:
        System.out.println("지원하지 안흔ㄴ 연산자 입니다.");
        return; //main()메서드를 그만 실행하고 나간다. 즉 jvm종료!
    }
    System.out.printf("%d %s %d =  %d\n", a,op,b,result);
  }
  

}
