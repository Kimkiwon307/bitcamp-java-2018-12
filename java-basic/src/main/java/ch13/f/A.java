 package ch13.f;

public class A {
 private int v1 = 100;


 public A(){
   
//   System.out.println("A().{}"); 컴퐈일 오
  
   super();
   
   System.out.println("A().{}");
 }
 public void m1() {
   System.out.printf("A.v1 = %d\n",v1);
 }
}
