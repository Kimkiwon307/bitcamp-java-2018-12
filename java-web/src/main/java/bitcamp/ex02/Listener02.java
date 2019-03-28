package bitcamp.ex02;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

// ServletContainer 가 관리하는 컴포넌트
// => 서블릿, 필터, 리스너
//
// 리스너 만들기
// => 서블릿 컨테이너 또는 서블릿, 세션 등의 객체 상태가 변경되었을 때 보고 받는 옵저버
// => "Observer" 디자인 패턴이 적용됨
// =>ServletContextListner 
// 리스너 용도
  // => 서블릿 컨테이너나, 세션 등이 특별한 상태일 때 필요한 작업을 수행한다.
// 

public class Listener02 implements ServletRequestListener{
@Override
  public void requestInitialized(ServletRequestEvent sre) {
  //요청이 들어 왔을 때 호출
  System.out.println("Listener02.requestInitialized()");
}
@Override
  public void requestDestroyed(ServletRequestEvent sre) {
//요청 처리
  System.out.println("Listener02.requestDestroyed()");
}

}