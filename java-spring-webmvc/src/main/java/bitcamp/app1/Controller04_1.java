// GET, POST 구분하기
package bitcamp.app1;

import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller 
@RequestMapping("c04_1") 
public class Controller04_1 {

  @Autowired ServletContext sc;
  
  //프론트 컨트롤러(DispatcherServlet)으로부터 받고
  @GetMapping("h1")
  @ResponseBody 
  public void handler1(
//      ServletContext sc, // 서브릿콘텍스트는 파라미터로 받을수없다 예외발생
      ServletRequest request , 
      ServletResponse response,
      HttpServletRequest request2,
      HttpServletResponse response2,
      HttpSession session,
      Map<String,Object>map,
      Model model,
      PrintWriter out
      ) {
   out.printf("ServletRequest: %b\n", request != null);
   out.printf("ServletResponse: %b\n", response != null);
   out.printf("HttpServletRequest: %b\n", request2 != null);
   out.printf("HttpServletResponse: %b\n", response2 != null);
   out.printf("HttpSession: %b\n", session != null);
   out.printf("Model: %b\n", model != null);
   out.printf("sc: %b\n", sc != null);
  }


}