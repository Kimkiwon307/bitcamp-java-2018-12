// 상수를 다른 값으로 분류한 후
package ch19.c;

public class Test01 {

  public static void main(String[] args) {
    Product p = new Product();
    p.maker = "비트마우스";
    p.title = "비트마우스";
    p.price = 65000;
    
    // 상수를 Category클래스로 옮긴 후에 사용하기
    p.category = Category.COMPUTER_CPU;
    
    // 개선점 :
    // => 카테고리의 이름 하나의 긴 변수명으로 되어 있따..
    // => 만약 한 계층에 하위 분류를 추가한다면 underscorer를 사용하여 분류명을 길게 해야 한다.
    // => 분류명 관리가 불편하다.
    
    // 해결책:
    // => static nested 클래스를 사용하여 각 계층별로 분류를 관리하게된다.
    
  }

}
