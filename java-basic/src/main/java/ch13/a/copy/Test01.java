// 기능 확장 - 방법1) 기존 코드를 가져와서 기능 추가하기
package ch13.a.copy;

public class Test01 {
  public static void main(String[] args) {
    
    Calculator2 c1 = new Calculator2();
    
    c1.plus(5);
    c1.multiple(2);
    c1.minus(2);
    c1.divide(4);
    System.out.println(c1.getResult());
      
  }

}
