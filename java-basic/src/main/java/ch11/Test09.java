// Wrapper 클래스와 오토빡싱
package ch11;


public class Test09{
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    System.out.println(b1 == b2);
    
    System.out.println(b1.equals(b2));// 값비교가 아니고 인스턴스를 비교하는것 
    
     

  }
}