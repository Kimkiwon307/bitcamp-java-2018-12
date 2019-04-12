package bitcamp;

//만약 서블릿 컨테이너에게 특정 타입의 객체를 찾아 보고하라고 지장하고 싶으면 
//다음 애노테이션을 사용하여 찾고자 하는 타입을 알려줘라
//

public class ApplicationInitializerImpl2 implements ApplicationInitializer{
  @Override
  public void begin() {
    //이 메서드는 ServletContainerImpl3 클래스가 호출될것이다
    System.out.println("오호라 ... ApplicationInitializerImpl2.begin()호출됨");
  
  }
}
