package bitcamp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// 서블릿 컨테이너가 시작될 때 보고 받는 객체
// 구동 순서:
// 1) 서블릿 컨테이너를 시작한다.
// 2) 서블릿 컨테이너는 /WEB-INF/lib/*.jar 파일을 뒤진다.
// 3) /META-INF/services/javax.servlet.ServletContainerInitializer 파일을 찾늗나.
// 4) 그 파일에서 ServletContainerInitializer 구현체를 알아낸다.
// 5) 해당 구현체의 인스턴스를 생성한 후 onSt

public class WebApplicationInitializerImpl2 extends AbstractAnnotationConfigDispatcherServletInitializer  {
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null;
  }
  @Override
  protected String[] getServletMappings() {
    // 스프링 프레임워크에서 DispatcherServlet을 등록할 떄 이 메서드를 호출한다.
    // 이 메서드의 리턴 값이 URL패턴으로 사용된다.
    return  new String[] {"/app7/*"};
  }
  @Override
  protected Class<?>[] getServletConfigClasses() {
    // 스프링 WebMVC 프레임워크에서 DispatcherServlet이 사용할 IoC 컨테이너를 준비할 떄
    // 이 메서드를 호출한다.
    // 이 메서드가 리턴한 Java config 클래스를 ㅣㅇ용하여 IoC 컨테이너를 설정할 것이다.
    return null;
  }
  @Override
  protected String getServletName() {
    // TODO Auto-generated method stub
    return "app7";
  }
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    System.out.println("WebApplicationInitializerImpl2.onStratup()...호출 ");
    super.onStartup(servletContext);
  }
}
