package ch18.g;

public class Test01 {

  public static void main(String[] args) {

      // 인터페이스에 선언한 필드는 publci static final이기 때무네 바로 사용가능
      System.out.println(A.V1);
      System.out.println(A.V2);
        
//      A.V2 = 300;  final이라 안됨
  }

}
