package ch19.a.sub;



public class Test01 {

  public static void main(String[] args) {
    //public 으로 공개된 클래스는 다른 패키지에서 접근 할 수 있다.
    ch19.a.sub.A obj1 = new ch19.a.sub.A();
    
  //public 으로 공개하지 않은 클래스는 다른 패키지에서 접근 할 수 없다.
   ch19.a.sub.B obj1 = new ch19.a.sub.B();  컴파일 오류
    
      

  }

}
