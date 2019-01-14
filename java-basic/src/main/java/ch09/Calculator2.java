package ch09;
//계산 기능과 관련된 메서드를 별도의 블록으로 분리하는 문법이 "클래스"이다
public class Calculator2 {
  
  //plus(), minus(), multiple(), divide()가 사용할 변수는 같은 클래스에 둔다.
  //=> 클래스 멤버가 사용하는 경우 클래스 멤버로 만들어야 한다.
  static int result =0; // <==클래스 필드 (스태틱필드)
  
  static void plus (int a) {
    result += a;
  }
   static void minus(int a) {
    result -= a ;
  }
  static void multiple(int a) {
    result *= a ;
  }
  static void divide(int a) {
    result /= a ;
  }
 
      
  }
