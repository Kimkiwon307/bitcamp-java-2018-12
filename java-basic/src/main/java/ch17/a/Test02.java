// 추상 메서드 상소
package ch17.a;

abstract class My1 extends A {
  
}

class My2  extends A{

  @Override
  public void m2(String name) {
   System.out.println("my의 m2" + name);
    
  }
  void m3() {
    System.out.println("Hello!");
  }
  
}

// 추상 클래스 <===> 일반 클래스 (concrete class)


public class Test02 {

  public static void main(String[] args) {
    
//    A obj = new A();
//    My1 obj2 = new My1();
      My2 obj3 = new My2();
       obj3.m2("홍길동");
       
       A obj4 = new My2();
       obj4.m2("임꺽정");
//       obj4.m3();
       
     ((My2)obj4).m3();
        
    

  }

}
