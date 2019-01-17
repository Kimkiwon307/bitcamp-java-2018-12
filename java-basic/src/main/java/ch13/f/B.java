 package ch13.f;

public class B extends A{
 
  private int v2 = 200;
  
  
  public B(){
    super(); // A클래스의 기본생성자를 호출한다
    System.out.println("B().{}");
  }
 
 public void m2() {
   System.out.printf("B.v2 = %d\n",v2);
 }
}
