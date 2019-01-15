// String 클래스 사용법 - 힙에 있는 스트링 인스턴스를 상수풀에도 만들기

package ch11;


public class Test03{
  public static void main(String[] args) {
    String s1 = new String("Hello") ;
    String sx = "Hello";
    String s2  = s1.intern();
    String s3 = "Hello";
    if (s1 == s2) {
      System.out.println("s1 == s2");
    }
    else 
      System.out.println("s1 != s2");
    
   
     if(s2 == s3)
       System.out.println("s2 == s3");
     else
       System.out.println("s2 != s3");
     
     if(s2 == sx)
       System.out.println("s2 == sx");
     else
       System.out.println("s2 != sx");

     
  }
}