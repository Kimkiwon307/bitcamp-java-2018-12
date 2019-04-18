// 요청 핸들러의 파라미터 - @RequestParam
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



//http://localhost:8080/java-spring-webmvc/c04_2/h1?name=kim
@Controller 
@RequestMapping("c04_2") 
public class Controller04_2 {
  @GetMapping("h1")
  @ResponseBody 
  public void handler1(
      PrintWriter out,
      ServletRequest request,
      @RequestParam(value = "name")String name1,
      @RequestParam(name = "name")String name2,
      @RequestParam("name")String name3,
      String name) {
    
    
    out.printf("name=%s\n", request.getParameter("name"));
    out.printf("name=%s\n", name1);
    out.printf("name=%s\n", name2);
    out.printf("name=%s\n", name3);
    out.printf("name=%s\n", name);
  }
  
//http://localhost:8080/java-spring-webmvc/c04_2/h1?name1=kim&name2=mincheol
  
  @GetMapping("h2")
  @ResponseBody 
  public void handler2(
      PrintWriter out,
      @RequestParam("name1")String name1,
      String name2,
      @RequestParam(value = "name3",required = false)String name3,
      @RequestParam(value = "name4",defaultValue = "mincheol")String name4) {
    
    
    out.printf("name1=%s\n", name1);
    out.printf("name2=%s\n", name2);
    out.printf("name3=%s\n", name3);
    out.printf("name3=%s\n", name4);
  }

}
