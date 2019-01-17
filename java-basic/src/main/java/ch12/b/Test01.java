// 캡슐화 (encapsulation) 적용 - 사례1

package ch12.b;

public class Test01 {

  public static void main(String[] args) {
    //의도
    Calculator c = new Calculator();
    c.plus(100);
    c.plus(15);
    c.minus(27);

    //result는 캡슐보호중
    System.out.println(c.getResult());

    //의도 x
    Calculator c2 = new Calculator();
    c2.plus(100);
    c2.plus(15);
    //임의로 result 변수의 값을 변경
    // c2.result = 100; 캡슐로 보호중

    c2.minus(27);

    System.out.println(c2.getResult());

  }

}
