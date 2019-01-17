// 다형적 변수의 필요

package ch14.e;

public class Test02 {

  public static void main(String[] args) {

    PickUpTruck c1 = new PickUpTruck();
    SUV c2 = new SUV();
    Convertible c3= new Convertible();
    DumpTruck c4 = new DumpTruck();
    
    // 위에서 생성한 각 인스턴스를 테스트하려면
    // 다음과 같이 그 타입에 맞는 test()메서드를 각각 정의해야 한다.
    
    test(c1);
    test(c2);
    test(c3);
    test(c4);
  }
  //Car 레퍼런스는 Car의 모든 종류(서브클래스)를 인스턴스 주소 사용
  static void test(Car car) {
    System.out.println("----------------------");
    car.run();  //car 변수가 실제 가리키는 인스턴스의 오버라이딩 메서드이다.
    car.stop(); //Car의 stop();
    car.run();  //car 변수가 실제 가리키는 인스턴스의 오버라이딩 메서드이다.
    car.stop(); //Car의 stop();
    System.out.println("----------------------");

  }
}
