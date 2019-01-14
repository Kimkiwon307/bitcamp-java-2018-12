package ch09;
//계산 기능과 관련된 메서드를 별도의 블록으로 분리하는 문법이 "클래스"이다
public class Calculator3 {
  
  // 클래스에서 공통으로 관리하지 않고 
  // 개별적으로 관리해야 할 값이 있다면 인스턴스 필드로 선언하라! (ex:result)
  int result =0; // <==인스턴스 필드 (논스태틱필드)
  
  static void plus (Calculator3 that, int a) {
    //result 가 더이상 클래스 필드가 아니기 때문에 다음과 같이 사용할수 없다.
//    result += a; 컴파일오류
    
    //파라미터 that에 들어 있는 주소로 찾아가서 그 인스턴스의 result필드를 사용한다.
    that.result += a;
  }
   static void minus(Calculator3 that,int a) {
//    result -= a ; 컴파일오류
     that.result -= a;
     
  }
  static void multiple(Calculator3 that,int a) {
//    result *= a ; 컴파일오류
    that.result *= a;
  }
  static void divide(Calculator3 that,int a) {
//    result /= a ; 컴파일오류
    that.result  /= a;
  }
  
 
      
  }
