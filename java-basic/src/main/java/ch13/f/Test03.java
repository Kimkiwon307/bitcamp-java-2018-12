// 자바는 다중 상속을 허락하지 안흔다.
package ch13.f;

public class Test03 extends A , X { //컴오! 

  public static void main(String[] args) {
    
    Test03 obj = new Test03();
    
    obj.m1(); // 다중상속이면 어떤 슈퍼클래스의 m1()메소드를 호출해야되는가


  }

}
