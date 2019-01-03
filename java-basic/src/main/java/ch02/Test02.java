// 리터럴(literal)
package ch02;

public class Test02{
    public static void main(String[] args) {
   // 20 억을 4바이트 리터럴로 출력하라.
         System.out.println(2000000000);
   // 20 억을 8바이트 리터럴로 출력하라.
         System.out.println(2000000000L);
   // 30 억을 8바이트 리터럴로 출력하라.
         System.out.println(3000000000L);
   // 30 억을 4바이트로 리터럴로 출력하라.
        // System.out.println(3000000000); 범위초과
    }
}