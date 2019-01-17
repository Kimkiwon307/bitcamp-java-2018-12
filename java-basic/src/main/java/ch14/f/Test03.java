// 다형적 변수와 오버라이딩 그리고 추상 메서드
package ch14.f;

public class Test03 {

  public static void main(String[] args) {


      //추상 클래스는 인스턴스 생성할 수 없다.
    // 그래서 추상 메서드를 호출할 수 없다.
    
//    Car c  = new Car();  콤파일오류
    
   Car c = new Sedan();
   
   c.run(); //세단의 런
  
  
  
  
  
  
  
  
  
  
  }
    
}