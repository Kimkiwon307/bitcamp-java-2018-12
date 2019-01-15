// SIngleton 적용 후

package design_pattern.singleton;

//인스턴스를 딱 한 개만 생성하여 공유하고 싶다면, 싱글톤 설계 방식으로 클래스 정의!
class Car2 {
  String model;
  int cc;
  //  인스턴스 주소를 받을 클래스 필드를 선언한다.
  private static Car2 instance;
  
  private Car2() {} 
  
  public static Car2 getInstance() {
    if(Car2.instance == null) {
        Car2.instance = new Car2();
    }
    return new Car2();
  }
}


public class Test02 {
    public static void main(String[] args) {
      
      // 생성자가 존재하지만 private으로 비공개 되어 있기 때문에 직접 호출할 수 없다.
      // 생성자를 호출 할 수 없으면 인스턴스를 생성불가
      //==> 다른 메서드를 호출하여 인스턴스를 생성하라는 의미이다.
//      Car2 c1 = new Car2();컴파일오류!
      Car2 c2 = Car2.getInstance();
      Car2 c3 = Car2.getInstance();
      
      if(c2 != c3) 
        System.out.println("다르다");
      else 
        System.out.println("같다");
      
      
    }
}
