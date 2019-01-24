// 중첩 클래스와 접근 제어
package ch19.a;

public class Test03 {
  
  //중첩 클래스도 멤버이기 때문에 필드나 메서드처럼 접근 제한자를 붙일수 있다.
  
  private static class A1{}
          static class A2{}
  protected static class A3{}
  public static class A4{}
  
  private static class B1{}
          static class B2{}
  protected static class B3{}   
  public static class B4{}

  public static void main(String[] args) {
//
    class C1{}
    
//    private class C1{} 오류 로컬변수에 접근 제한자를 붙일 수 없듯이 로컬 클래스도 불가능하다.
    
  }
  
  

}
