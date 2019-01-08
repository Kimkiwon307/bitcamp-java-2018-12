// 비트 연산자 : & , | , ^ , ~
// => 용도 : 이미지 프로세싱 분야에서 사용됨
package ch04;

public class Test13{
    public static void main(String[] args) {
      
      int a = 0xca; 
      int b = 0x66; 
      System.out.println( a & b);
      System.out.println( a | b);
       
      System.out.println(a ^ b);
      System.out.println(~a);
      
      // & 활용 : 특정 값을 차단하고 특정 값만 통과시킬떄
      int data = 0b1111_1001_0111_1111;
      System.out.println(Integer.toBinaryString(data & 0b0000_1111_1100_0000));
      //예: 빨강색 제거
      int pixel = 0x003f4478; // 각 바이트의 값이 00RRGGBB 이라 가정하자.
      System.out.println(pixel & 0x0000ffff);
      
      
      
      
    }
}
