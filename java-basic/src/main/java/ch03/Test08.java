// 키보드로 입력한 값을 받기 III - int 값 읽기 
package ch03;

public class Test08{
    public static void main(String[] args) {

      java.util.Scanner keyboard = new java.util.Scanner(System.in);
      
     
      System.out.print("a? ");
      
      int a = keyboard.nextInt();
      // nextInt()는 한 개의 토큰(token)을 읽을 때까지 기다린다.
       // 한 개의 token을 읽으면 4바이트 정수 값으로 바꾼 다음에 리턴한다.
       // 토큰(token)?
       // ==> 토큰이란 공백으로 구분되는 단어를 뜻한다.
       // 공백(whitespace)?
       // ==> 스페이스, 탭, 줄바꿈 코드를 말한다.
       //예) aaa     bbb   ccc   ==> aaa, bbb, ccc
       //중간에 여러 개의 공백이 들어가도 한 개의 공백으로 간주한다.
      
      
      
      
      System.out.print("b? ");
      
      int b = keyboard.nextInt();
      
     
      System.out.printf("%d * %d = %d \n",a,b, a*b);
   
      //입력이 완료될때까지 실행안한다 -블로킹
      
      
      
    }
}
