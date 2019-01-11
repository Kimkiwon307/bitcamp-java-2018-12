//메서드 - 재귀호출 (메모리를 많이쓴다), 속도가 느리e
package ch06;

public class Test12{
  public static void main(String[] args) {
   
    int result = sum1(5,sum1(4,sum1(3, sum1(2,(sum1(1,0))))));
    System.out.println(result);
    
    int result2 = 0;
    result2 = sum1(result2, 1);
    result2 = sum1(result2, 2);
    result2 = sum1(result2, 3);
    result2 = sum1(result2, 4);
    result2 = sum1(result2, 5);
    System.out.println(result2);
    System.out.println(sum2(5));
    
     // 위의 알고리즘(결과를 내는 방식)은 다음 수학 공식과 같다.
    // sum(n) = n + sum(n-1)
  }

  static int sum1(int a, int b) {
    return a + b;

  }
 static int sum2 (int n) {
   if(n == 1)
     return n;
   return n + sum2(n - 1); //자기가 자기 호출  =재귀호출
   
 }

}