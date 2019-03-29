package bitcamp.ex05;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 서블릿 클래스를 만들때 HTTP 포로토콜을 쉽게 다룰 수 있도록
// service
@SuppressWarnings("serial")
public abstract class MyHttpServlet extends GenericServlet{

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    // 서블릿 컨테이너가 이 메서드를 호출하면

    // => 파라미터 값을 원래의 타입으로 변환한다
    HttpServletRequest request = (HttpServletRequest) req;
    HttpServletResponse response = (HttpServletResponse) res;

    //=> 오버 리당한 service()를 호출한다.
    this.service(request,response);

  }

  protected void service(HttpServletRequest request , HttpServletResponse response)
      throws ServletException, IOException{
    // 웹브라우저가 요청하면
    // => 서블릿 컨테이너가 service(ServletRequest , ServletResponse)를 호출한다.
    // => service(ServletRequest, servletResponse)는
    //          다시 오버로딩한 이 메서드를 호출한다.
    //  현재 아무런 일을 하지 않느다.
    //  이 클래스를 상속 받는 서브 클래스 쪽에서


  }


}
