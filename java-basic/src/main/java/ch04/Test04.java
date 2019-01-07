// 연산자 우선순위 
package ch04;

public class Test04{
    public static void main(String[] args) {
      float r = 3.2f + 5 /2 ;
          System.out.println(r);
    /*
     * => 연산자 우선 순위에 따라 *,/,% 연산자가 +, - 연산자 보다 먼저 계산된다.
     *
     *     
     */
      float r2 = (3.2f + 5) / 2 ;
        System.out.println(r2);
       // 연산자 우선 순위에서 괄호가 모든 연산자 보다 우선으로 취급된다. 
       
      int a = 2; // a=5     
      int r3 = a++ + a++ * a++; //<== ++ 연산을 먼저 수행한다.
                                     //<== * 연산을 먼저 수행한다.
    System.out.println(r3);
    System.out.println(a);
    
    
    
    }
}
