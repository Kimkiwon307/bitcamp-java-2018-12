// String 클래스 사용법 - immutable(값을 바꿀수 없는) 객체이다.

package ch11;


public class Test05{
  public static void main(String[] args) {
  
    String s1 = new String("Hello") ;
    String s2 = s1.replace('l', 'r');
    String s3 =  s1.replace("el", "gd");
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s2 == s3);
  }
}