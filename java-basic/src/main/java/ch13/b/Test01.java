// 기능 확장 - 방법2) 상속 기능 활용하기
package ch13.b;

public class Test01 {
  public static void main(String[] args) {
    
    // 상속받은 calculator2
    Calculator2 c1 = new Calculator2();
    c1.plus(5);
    c1.multiple(2);
    c1.minus(2);
    c1.divide(4);
    System.out.println(c1.getResult());
      
  }

}
