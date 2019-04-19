package bitcamp.app1;

import java.util.Map;
import javax.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping("c05_3") 
public class Controller05_3 {

  @GetMapping("h1")
  public String handler1(
      ServletRequest request) {

    request.setAttribute("name", "홍길동");
    request.setAttribute("age", 20);
    request.setAttribute("working", true);
    return"/WEB-INF/jsp/c05_3.jsp";
  }

  @GetMapping("h2")
  public String handler2(
      Map<String,Object>map) {
    map.put("name", "홍길동");
    map.put("age", 21);
    map.put("working", true);
    return"/WEB-INF/jsp/c05_3.jsp";
  }

  @GetMapping("h3")
  public String handler3(
     Model model) {
    model.addAttribute("name", "홍길동");
    model.addAttribute("age", 22);
    model.addAttribute("working", true);
    return"/WEB-INF/jsp/c05_3.jsp";
  }

  @GetMapping("h4")
  public ModelAndView handler4(
    ) {
    ModelAndView model = new ModelAndView();
    
    
    model.addObject("name", "홍길동");
    model.addObject("age", 23);
    model.addObject("working", true);
    model.setViewName("/WEB-INF/jsp/c05_3.jsp");
    return model;
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
