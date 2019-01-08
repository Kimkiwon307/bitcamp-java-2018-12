   // 흐름 제어문 - switch
package ch05;

public class Test03{
    public static void main(String[] args) {
        byte b = 1;  // switch 조건으로 ok
        short s = 1; // switch 조건으로 ok
        char c = 1; // switch 조건으로 ok
        int i= 1;   // switch 조건으로 ok
        long l = 1 ;       // switch 조건으로 no    
        float f = 1.0f;    // switch 조건으로 no
        double d = 1.0;    // switch 조건으로 no
        
        switch(b) {
          case 1:
              System.out.println("11");
              System.out.println("11");
              break;
          case 2:  
             System.out.println("22");
             System.out.println("222222");
             break;
             
          case 'A': // 'A'의 리턴 값은 2바이트 정수 값이다.
            System.out.println("22");
            System.out.println("222222");
            break;
          default:
             System.out.println("???????");
              
        }
        
    }
 }

