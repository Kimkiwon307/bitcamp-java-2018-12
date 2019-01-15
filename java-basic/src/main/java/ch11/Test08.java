// StringBuffer 클래스 사용법 - equals()
package ch11;


public class Test08{
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    System.out.println(b1 == b2);
    
    System.out.println(b1.equals(b2));// 값비교가 아니고 인스턴스를 비교하는것 
    
     

  }
}