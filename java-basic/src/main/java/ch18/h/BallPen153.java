//추상 클래스를 상속 받아서 간접적으로 인터페이스를 구현하기
package ch18.h;

// 인터페이스를 직접 구현하면 인터페이스에 선언된 모든 메서드를 정의해야 하지만
// 다음과 같이 미리 인터페이스의 일부를 구현한 추상 클래스를 상속 받으면
// 좀 더 쉽게 인터페이스를 구현할 수 있다.
//
public class BallPen153 extends AbstractPen{
  //   추상클레스에서 구현하지 않은 메서드만 서브클래스 에서 구현한다
  @Override
  public void write(String text) {
    if(!use )
      return;
    System.out.println("모우나미 "+ text);
  }

}
