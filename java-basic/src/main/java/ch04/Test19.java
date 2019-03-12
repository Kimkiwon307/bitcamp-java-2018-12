// 비트 연산자 응용
// 
package ch04;

public class Test19 {
  public static void main(String[] args) {
	  // 한 개의 정수 값에 여러 개의 정보를 저장하기
	  // => 비트의 1 또는 0을 이용하여 정보를 표현할 수 있다.
	  //
	  // 개발자가 프로그래밍 가능한 언어를 int 값으로 표현해 보자!
  
	  int d1 = 0x01 | 0x02 |0x04 | 0x80; 
	  int d2 = 0x0087;
	  System.out.println(d1);
	  System.out.println(d2);
	  
	  System.out.printf("java: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("C: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("C++: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("Python: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("PHP: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("Kotlin: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("Groovy: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("TypeScript: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("java: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("java: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("java: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("java: %b\n",(d2 & 0x0001) == 0x0001);
	  System.out.printf("java: %b\n",(d2 & 0x0001) == 0x0001);
  
  
  
  }
}

















