// 추상 클래스를 사용할 때
package ch18.f;

public abstract class AbstractCar {

  String model;
  int cc;

   //추상 클래스의 목적은 서브 클래스에게 공통 필드와 공통 메서드를 상속해주는 것이다.
  public void on() {
      System.out.println("시동을켠다");
    }

    public void off() {
      System.out.println("시동을 끈다");
    }

    public abstract void run();
}
