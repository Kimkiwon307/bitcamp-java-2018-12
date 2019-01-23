// 인터페이스의 정의 - public 과 abstract는 생략 가능
package ch18.b;

public interface SpecA {
  
  // 규칙이기에 무조건 public 이다
//  private abstract void m1(); 컴파일오류
//  protected abstract void m1(); 컴오 
//  public abstratc void m1(); OK
// abstract void m1(); //OK! <= default 접근 제어가 아니라 public 생략
    
  void m1(); //OK! public abstract생략!
  void m2();
}
