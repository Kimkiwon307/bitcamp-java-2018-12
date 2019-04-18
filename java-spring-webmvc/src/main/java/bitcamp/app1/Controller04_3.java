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



//http://localhost:8080/java-spring-webmvc/app1/c04_3/h1?model=sonata&maker=bit&capacity=5&auto=true
@Controller 
@RequestMapping("c04_3") 
public class Controller04_3 {
  @GetMapping("h1")
  @ResponseBody 
  public void handler1(
      PrintWriter out,
      String model,
      String maker,
      int capacity,
      boolean auto,
      Car car) {
    
    out.printf("model=%s\n", model);
    out.printf("maker=%s\n", maker);
    out.printf("capacity=%s\n", capacity);
    out.printf("auto=%s\n", auto);
    out.printf("auto=%s\n", car);
    
  }
  
 

}
