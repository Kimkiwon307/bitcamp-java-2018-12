// 애플리케이션 예외의 종류: Exception 계열의 예외 처리 III
package ch21.c;

import java.util.ArrayList;

public class Test06 {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("페이커");
    list.add("뱅기");
    list.add("호랑이");
    

    //get() 메서드
    //=> 목록에서 인덱스 지정한 위치의 값을 꺼내준다.
    //=> 만약 인덱스가 무효하다면 IndexOutOfBoundsException 예외가 발생한다.
    //=> IndexOutOfBoundException은 RuntimeException 계열의 예외 클래스이다.
    //
    try {
      
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    
    }catch (RuntimeException e) {
      //여기서 예외를 처리했기 때문에 main() 호출자에게 따로 보고를 하지 않는다.
      System.out.println("실행 중 오류 발생!");
    }
System.out.println("종료");
  } 
}
