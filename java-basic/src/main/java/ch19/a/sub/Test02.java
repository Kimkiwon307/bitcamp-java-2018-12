// 중첩 클래스 - nested class
package ch19.a.sub;

// 익명 클래스의 예제를 위한 클래스
class Car {
  String model;

  public Car() {
    this.model = "미정";
  }

  public Car(String model) {
    this.model = model ;
  }

  public void run() {
    System.out.println("달려달려");
  }
}
// 익명 클래스의 예제를 위한 인터페이스
interface Pen {
  void write();
}
public class Test02 {

  // 1) 중첩 클래스
  // => 특정 클래스 안에서만 사용 되는 클래스가 있다면 중첩 클래스로 선언하라.
  // => 즉 노출 범위를 좁히는 것이 유지보수에 좋다.

  // 2)static nested class
  // => 바깥 클래스의 특정 인스턴스에 종속되지 않는 클래스.
  static class A {}

  // 2)non-static nested class = inner class
  // => 바깥 클래스의 특정 인스턴스에 종속되는 클래스.
  class B{}
  
  
  public static void main(String[] args) {

    //3) local class
    // => 특정 메서드 안에서만 사용되는 클래스.
    class C{}

    //4) anonymous class
    // => 클래스의 이름이 없다.
    // => 클래스를 정의하는 동시에 인스턴스를 생성해야 한다.
    // 
    // => 단 한 개의 인스턴스만 생성해서 사용할경우 사용한다.
    // => 문법
    //        new 수퍼클래스() {클래스 정의}
    //        new 인터페이스() {클래스 정의}


    // 예1:
    // => Car 클래스를 상속 받고, Car의 기본 생성자를 호출하는 익명 클래스 정의 및 객체 생성
    //  => 인스턴스를 생성할 때 수퍼 클래스인 Car의 기본 생성자를 호출한다.
    /* Objcet obj */  
    Car obj =  new Car () {
      @Override
      public void run() {
        System.out.println(this.model + "씽씽카");
      }
    }; //new 명령은 인스턴스를 생성하는 명령이기 때ㅜㅁㄴ에 문장 끝에 세미콜론을 붙여야한다.

    obj.run();

    //클래스 이름 다음에 오는 것이 수퍼 클래스의 생성자를 지정하는 문법이다.
    Car obj2 = new Car("티코") {
      @Override
      public void run() {
        System.out.println(this.model + "경차 달린다.");
      }
    };
    obj2.run();

    // 예 3 : 인터페이스를 구현하여 익명 클래ㅣ스 생성하기
    //     인터페이스를 지정하면 수퍼 클래스는 자동으로 Objcet가 된다

    Pen obj3 = new Pen() {
      @Override
      public void write() {
        System.out.println("글 쓴다!");
      }
    };
    obj3.write();
  }
  // 스태틱 메서드
  public static void m1() {
    // 스테틱 멤버는 오직 같은 스태틱 멤버만 사용할 수 잇다.
    A obj = new A();

    // 스태틱 멤버는 인스턴스 주소를 담는 this라는 built - in 변수가 없기 떄ㅜㅁㄴ에
    // 인스턴스 메ㅁ버(필드, 메섣, inner클래스)를 사용할수없다

    B obj2 ; //레퍼런스 변수를 선언할때는 inner클래스를 선언할수 있따.
    obj2  =  new B(); //컴파일 오류

    // 다른 로컬 멤버(변수, 중첩 클래스)는 사용할수 없다.
    C obj3 ; //컴파일 오류 ! c클래스는 메인에서만 사용
    obj3 = new C(); // 컴파일오류



  }

}
