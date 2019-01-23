package ch18.f;

//자동차의 기본 기능을 갖추기 위해 AbstruactCar를 상속 받는다
public class Truck extends AbstractCar{

  // 추상 클래스로부터 상속 받은 메서드 중에서
  // 서브 클래스가 구현하도록 맡겨진 메소드를 정의한다.
  @Override
public void run() {
  System.out.println("트럭트럭");
}

}
