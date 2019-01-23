// 서브 인터페이스 구현 II- 수퍼 인터페이스의 메서드까지 모두 구분해야 한다.
package ch18.d;

//수퍼 인터페이가 있는 인터페이스를 구현 할 때는
//수퍼 인터페이의 메서드까지 모두 구현해야 한다.

public class Tool2 implements ProtocolC {

  @Override
  public void m3() {} //프로토콜에이2

  @Override
  public void m1() {}  //프로토콜에이, 프로토코ㄹ비

  @Override
  public void m2() { } //프로토콜에이

  @Override
  public void k1() {} //프로토콜비

  @Override
  public void k2() {} //프로토콜비

  @Override
  public void x() {} // 프로토콜씨

  @Override
  public void y() {} //프로토콜 씨
  
 
}
