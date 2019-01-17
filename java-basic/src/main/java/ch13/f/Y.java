 package ch13.f;

public class Y extends X{
 
  private int v2 = 200;
  
  
  public Y(){
//    super();  이건 에러
    super(500); // X클래스는 기본생성자가 아닌 int를 받는 생성자
    System.out.println("B().{}");

  }
 
 public void m2() {
   System.out.printf("B.v2 = %d\n",v2);
 }
}
