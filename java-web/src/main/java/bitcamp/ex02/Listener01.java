package bitcamp.ex02;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

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

public class Listener01 implements ServletContextListener{

@Override
public void contextInitialized(ServletContextEvent sce) {
  System.out.println("Listener01.contextInitialized()");
}

@Override
  public void contextDestroyed(ServletContextEvent sce) {
  System.out.println("Listener01.contextDestroyed()");
}

}