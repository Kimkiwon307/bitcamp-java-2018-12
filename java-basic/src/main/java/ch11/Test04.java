// String 클래스 사용법 - String 인스턴스에 있는 값을 비교하기 : equals()

package ch11;


public class Test04{
  public static void main(String[] args) {
    String s1 = new String("Hello") ;
    String s2  = new String("Hello");


    if (s1 == s2)  //인스턴스 비교
      System.out.println("s1 == s2");
    else 
      System.out.println("s1 != s2");


    if(s1.contentEquals(s2)) //인스턴스 문자열비교
      System.out.println("s1과 s2의 문자열이 같다.");
    else
      System.out.println("s1과 s2의 문자열이 다르다");

     String s3 = "Hello";
     String s4 = "hello";
     
     if (s3.equals(s4)) { //대소문자 구분
       System.out.println(" s3.contentEquals(s4)");
     }if (s3.equalsIgnoreCase(s4)) { //대소문자 구분
         System.out.println(" s3.contentEquals(s4)");
      }

  }
}