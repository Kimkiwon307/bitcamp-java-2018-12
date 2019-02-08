package design_pattern.observer.after2;

public class Test01 {

  public static void main(String[] args) {


    Car car =new Car();

    car.start();

    car.run();

    car.stop();

    // Observer 디자인 패턴과 추상클래스의 결합
    // CarObserver를 직접 구현하는 대신에
    //  AbstractCarObserver를 상속 받으면 코딩하기가 편하다.
    //  => AbstractCarObserver클래스를 참고할것
    car.addObserver(new SafeBeltCarObserver());
    car.addObserver(new EngineOilCarObserver());
    car.addObserver(new BreakOilObserver());
    car.addObserver(new RightOffCarObserver());
    car.addObserver(new SunRoofCloseCarObserver());
    car.start();
    car.run();
    car.stop();
    System.out.println("-----------------------------------------------------------");

  }

}
