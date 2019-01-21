// 추상 메서드와 추상 클래스
package ch17.a;

public abstract class A {

  //구현 메서드
  public void m1() {
    System.out.println("a.m1()구현메서드");
  }
  
  //추상 메서드
  // => 메서드 몸체(body)가 없다.
  // => 메서드 선언부에 abstract
  // => 추상메서드는 오직 추상 클래스 많이 갖는
  public abstract void m2(String name); //모디피어 사이는 상관없다.
  
  
}
