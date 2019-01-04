// 문자 제어 코드
package ch02;

public class Test10{
    public static void main(String[] args) {
        System.out.println("Hello,\nwolrd!"); // 줄바꿈은 이 제어 문자를 사용하라!
        System.out.println("Hello,\rwolrd!"); 
        System.out.println("Hello,\b\b\bwolrd!");
     //bitcamp@bitcamp27:~/git/bitcamp-java-2018-12/java-basic$ java -cp bin/main ch02.Test10
        System.out.println("Hello,\twolrd!");
        System.out.println("Hello,\fwolrd!");
        System.out.println("Hello,\"w\"olrd!");
        System.out.println("Hello,'w'olrd!");
        System.out.println('\'');
        System.out.println('"');
        System.out.println("Hello,\\\\\\wolrd!");
        System.out.println("Hello,'w'olrd!");
        
        
        
    }
 }
