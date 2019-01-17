// 다형적 변수의 사용
package ch14.e;

public class Test01 {

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
  static void test(PickUpTruck car) {
    System.out.println("------------------");
    car.run();
    car.stop();
    car.run();
    car.stop();
    System.out.println("----------------------");

  }
  static void test(SUV car) {
    System.out.println("------------------");
    car.run();
    car.stop();
    car.run();
    car.stop();
    System.out.println("----------------------");
  }
  static void test(Convertible car) {
    System.out.println("------------------");
    car.run();
    car.stop();
    car.run();
    car.stop();
    System.out.println("----------------------");
  }
  static void test(DumpTruck car) {
    System.out.println("------------------");
    car.run();
    car.stop();
    car.run();
    car.stop();
    System.out.println("----------------------");

  }
}
