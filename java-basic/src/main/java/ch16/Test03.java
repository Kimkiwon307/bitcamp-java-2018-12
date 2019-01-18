// 제네릭(generic)적용후 - 메서드가 다루는 객체의 타입 이름을  파라미터로 받는다.

package ch16;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
  public static void main(String[] args) {

    String obj1 =echo(new String("Hello)"));
    Date obj2 = echo(new Date());
    Calendar obj3 = echo(Calendar.getInstance());
    File obj4 = echo(new File("okok"));
    Integer obj5 = echo(Integer.valueOf(100000));
  }
  // 제네릭을 이용하면 여러 타입을 모두 수용할 수 있는 메서드를 만들수 있따.
  // <다루는 타입의 별명>  리턴타입  메서드명(다루는_타입_별명 파라미터,...){....}
  // 다음 메서드를 해석하기
  // => echo() 메서드가 다루는 타입을 "ok"라고 하자
  // => echo()는 Ok라는 타입의 파라미터값(객체주소)을 받고, Ok라는 타입의 객체(주소)를 리턴한다
  // => 제네릭을 사용하면 특정 타입을 다루는 메서드를 여러 개 정의할것을 한개로 줄일수잇
  // 이때 ok를 타입 파라미터라고 한다.  
  public static <Ok>  Ok echo(Ok obj) {
    return obj;
  }
}
/* 
제네릭의 타입 파라미터로 많이 사용하는 이름
T , 
*/