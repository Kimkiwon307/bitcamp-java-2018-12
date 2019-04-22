// 세션 다루기 -  세션의 값을 무효화 시키는 방법
package bitcamp.app2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class Controller04_1_Interceptor2 implements HandlerInterceptor{

  @Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    throws Exception {
  
      System.out.println("Intercepto2.preHandle()");
    
    return false;
}

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {

      System.out.println("Interceptor2.postHandle()");
    HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
  }
  
  
}












