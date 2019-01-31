//Lambda 문법 - functional interface를 효과적으로 다루는 문법
package ch19.h;

public class Test02 {

  // 다음과 같이 추상 메서드가 한 개 있는 인터페이스를 "functional interface"라고 부른다.
  // => 이런 경우에 람다 문법으로 사용할 수 있따.
  static interface Player{
    void play();
  }

  public static void main(String []args) {
      //1) 한 문장일 떄는 중괄호를 생략 할수 있따
    Player p1 = () -> System.out.println("테스트1");
      
    p1.play();

    // 2) 중괄호 가능
    Player p2 = () -> {System.out.println("테스트2");};
   
    p2.play();
  }
}
