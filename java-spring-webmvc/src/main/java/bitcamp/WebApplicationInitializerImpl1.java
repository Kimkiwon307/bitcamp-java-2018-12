package bitcamp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

// 서블릿 컨테이너가 시작될 때 보고 받는 객체
// 구동 순서:
// 1) 서블릿 컨테이너를 시작한다.
// 2) 서블릿 컨테이너는 /WEB-INF/lib/*.jar 파일을 뒤진다.
// 3) /META-INF/services/javax.servlet.ServletContainerInitializer 파일을 찾늗나.
// 4) 그 파일에서 ServletContainerInitializer 구현체를 알아낸다.
// 5) 해당 구현체의 인스턴스를 생성한 후 onSt

public class WebApplicationInitializerImpl1 implements WebApplicationInitializer {
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {

    System.out.println("WebApplicationInitializerImpl1.onStratup()...호출 ");
    AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
    ac.register(AppConfig.class);
    ac.refresh();

    DispatcherServlet servlet = new DispatcherServlet(ac);

    Dynamic registration = servletContext.addServlet("app6", servlet);

    registration.setLoadOnStartup(1);
    registration.addMapping("/app6/*");

  }
}
