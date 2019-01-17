// Wrapper 클래스
package ch11;

import java.util.Date;

public class Test09{
  public static void main(String[] args) {
   
    //Integer i1 = new Integer(100); //가능한 사용 하지 말자!
    Integer i1 = Integer.valueOf(100);
    //char c = new Character('가');
    Character c1 = Character.valueOf('가');
    
    byte b = i1.byteValue(); //int를 byte로
    String s = i1.toString();//int를 String
    String str = Integer.toHexString(200);// int값을 16진수변화후 문자열로
    
    printInt(100);
    printFloat(3.14f);
    //printInt("hello"); 컴오
    Integer x = Integer.valueOf(1000);
    Float y = Float.valueOf(3.14f);
    Date today = new Date();
    String z = "HELLO";
//    printFloat(z); // 인스턴스에 주소 넘길수없다. 파라미터 변수가 값이 다
    
    printObject(today);
    printObject(x);
    printObject(y);
    printObject(z);
    
  }
  static void printInt(int i) {
    System.out.println("값 =>"+ i);
  }
  static void printFloat(float f) {
    System.out.println("값 => "+ f);
  }
  static void printObject(Object obj) {
    System.out.println("값 =>" + obj.toString());
  }
}