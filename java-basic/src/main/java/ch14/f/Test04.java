// 오버라이딩 메소드와 추상 메서드
package ch14.f;

public class Test04 {

  public static void main(String[] args) {

    A obj = new B();
    obj.m1();   
 // B obj2 = obj; // 컴파일오류
    B obj2 = (B) obj; // 형변환
    
    if(obj == obj2) {
      System.out.println("obj == obj2");
    }
    
    A obj3 = new A();
//    B obj4 = (B) obj3; // runtime 예외 발생
    
    obj3.m1();
//    obj4.m2();
  }
  
    
}