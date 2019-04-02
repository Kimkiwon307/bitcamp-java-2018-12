package com.eomcs.lms.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.eomcs.lms.AppConfig;


//웹 애플리케이션이 시작되거나 종료될 때 보고를 받는 클래스이다.
// => observer 디자인 패턴이 적용된 예이다.

@WebListener
public class ContextLoaderListener implements ServletContextListener {

  final static Logger logger = LogManager.getLogger(ContextLoaderListener.class);


  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // 웹 어플리케이션이 시작될 때 서블릿 컨테이너는 이 메서드를 호출해준다.
    // => 이 메서드에서 InitServlet이 하던 SpringIoc컨테이너 준비를 수행한다.

    logger.info("Spring IoC 컨테이너 준비");
    ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
    printBeans(iocContainer);

    ServletContext sc = sce.getServletContext();
    sc.setAttribute("iocContainer", iocContainer);

  }


  private void printBeans(ApplicationContext iocContainer) {
    // 개발하는 동안 참고할 로그는 보통 debug 등급으로 출력한다.
    logger.debug("---------------------------------------------------"); 
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      logger.debug(String.format("빈 생성 됨 (객체명=%s, 클래스명=%s)", name, 
          iocContainer.getBean(name).getClass().getName()));
    }
    logger.debug("---------------------------------------------------"); 
  }
}

