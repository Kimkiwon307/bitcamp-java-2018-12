// 메서드 - 메서드 중첩 호출
package ch06;

public class Test06{
  public static void main(String[] args) {
      // 가변 파라미터에 값 전달하기
     // => 0개 이상의 값을 전달한다
    int result = plus();
    System.out.println(result);
  }
  
 
 static int plus(int...value) {
   int sum = 0;// <== 메서드 안에 선언된 변수를 "로컬변수"라 한다.
                  //<== 파라미터도 로컬 변수입니까? 예. 로컬 변수이다
   
   for(int i = 0; i < value.length; i++) {
     sum += value[i];
   }
   return sum;
 }
    
   
  
}
