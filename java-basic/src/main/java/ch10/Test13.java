//   초기화 블록 - 클래스 로딩과 스태틱 블록 실행 과정

package ch10;


class B{
  static int b = 22;
  
  static {
    System.out.println("B.static{}");
    b += A.a;
  }
  
}
class A{
  static int a = 7;
  
  static {
    System.out.println("A.static{}");
    a += B.b;
  }
}
public class Test13{
  public static void main(String[] args) {
System.out.println(B.b); //29
System.out.println(A.a); //29
  }

}