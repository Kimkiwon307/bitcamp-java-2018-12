// 제네릭(generic) 과 배열

package ch16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test05{
  public static void main(String[] args) {
      // 제네릭을 사용하는 멧더르르 이용하여 배열 만들기
    
      
    String[] strs = create2(new String[0] );
    System.out.println(strs.length);
    
    // 내부에서 생성할 배열 크기 보다 더 큰 배열을 파라미터로 넘긴다면?
    String[] temp =  new String[100];
    String[] strs2 = create2(temp);
    System.out.println(strs2.length);
    
    
  }
  // 제네릭으로 배열 생성하기
  //
  //예 1 제네릭의 타입 파라미터로 레퍼런스 배열을 생성할 수 없다.
  static <T> T[] ctreate1() {
    //T[] arr = new T[10]; // 컴파일 오류
    return null;
  }
  // 예2 제네릭의 타입 파라미터를 이용하여 배열을 생성하기
  // => 빈 배열을 받아서 복제하는 방법을 사용한다.
  static <T> T[] create2(T[] arr) {
    //copyOf(원래배열, 배열크기)
    // => 원래 배열의 크기가 지정한 배열크기 보다 작을 때는
    //    원래 배열과 같은 타입의 배열을 새 배열크기에 맞춰 새로 생성한다.
    return Arrays.copyOf(arr, 10);
  }
//   예3
    static <T> T[] create3(Class<?>type) {
      return (T[]) Array.newInstance(type, 10);
    }
    //예4
    static<T>T[] create4(T[] arr){
      return (T[]) Array.newInstance(arr.getClass(), 10);
    }
  
  
}