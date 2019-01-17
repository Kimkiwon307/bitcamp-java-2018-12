package ch13.f;

public class X {
  private int v1 = 100;


  public X(int value){
  
    
    this.v1 = value;
    System.out.println("A().{}");
  }
  public void m1() {
    System.out.printf("A.v1 = %d\n",v1);
  }
}
