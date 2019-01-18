// 제네릭(generic) 응용 - 클래스 전체에 응용하

package ch16;

import java.io.File;

import java.util.Calendar;
import java.util.Date;

class Box1 {
  Object value;

  public Box1(Object value) {
    this.value = value;
  }
  public Object getValue() {
    return this.value;
  }
}
//제네릭을 적용한 클래스
// => 클래스 전체에서 사용할 타입 파라미터를 선언하기
// => class 클래스명<타입파라미터명, 타입파라미터명,...>{...}
class Box2<T> {
  T value; // T라는 타입의 인스턴스 주소를 받음

  public Box2(T value) {
    this.value = value;
  }
  public T getValue() {
    return this.value;
  }
}
public class Test04 {
  public static void main(String[] args) {

    // 제네릭이 적용되지 않은 Box1 클래스 이용

    Box1 b1 = new Box1(100);
    Box1 b2 = new Box1("Hello");
    Box1 b3 = new Box1(new Date());

    // Box1 객체에서 값 꺼내기
    // 값을 꺼낼때 마다 형변환 해야 한다 부울편~

    int v1 = (int)b1.getValue();
    String v2 = (String)b2.getValue();
    Date v3 = (Date)b3.getValue();

    // 제네릭이 적용된 BOX2 클래스
    Box2<String> x1 = new Box2<String>("Hello");
    Box2<String> x2 = new Box2<>("임꺽정");
    Box2<String> x3;
    x3 = new Box2<>("유관순");
    
     // 그런데 제네릭에 지정된 타입이 아닌 것을 넣으려 하면 컴파일 오오오오옹류류류ㅠ류류
    // 이것이 제넥릭을 사용하는 이유 이기도하아다
    // 즉 특정클래스만 다루도록 제한 할수 있따.
//    Box2<String> x4 = new Box2<>(new Date());
    
//    제네릭을 사용하면 getValue() 메서드가 각 타입별로 존재하느넋처럼 사용항수잇다
    
    String y1 = x1.getValue();
    String y2 = x2.getValue();
    String y3 = x3.getValue();
    Box2<Date> x4 =new Box2<>(new Date());
    Date y4 = x4.getValue(); 
    
  
  
  
  } 
}