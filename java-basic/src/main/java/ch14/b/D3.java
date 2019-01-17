// this와 super 키워드를 사용하여 메서드를 호출할 때;
package ch14.b;

public class D3 extends D2{
  
  @Override
  void m1() {
    System.out.println("D3.m1()");
  }

  @Override
  void m3() {
    System.out.println("D3.m3()");
  }
  void test() {
      this.m4();
      super.m4();
      
      this.m3();
      super.m3();
      
      this.m1();
      super.m1();
      
      this.m2();
      super.m2();
  }
  
   public static void main(String[] args) {
     D3 obj = new D3();
       obj.test();
//this 키워드는 지금 클래스 super 키워드는 슈퍼클래스부터 찾는다.
   
   }
  }
