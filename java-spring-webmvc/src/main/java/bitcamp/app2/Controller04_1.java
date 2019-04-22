// 세션 다루기 -  세션의 값을 무효화 시키는 방법
package bitcamp.app2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller 
@RequestMapping("/c04_1")
public class Controller04_1{

  @GetMapping("h1")
  @ResponseBody
  public String handler1() {
    System.out.println("c4_1.handler1() 호출");
    return "c04_1";
  }

  @GetMapping("a/h2")
  @ResponseBody
  public String handler2() {
    System.out.println("c4_1.handler2() 호출");
    return "c04_1";
  }

  @GetMapping("b/h3")
  @ResponseBody
  public String handler3() {
    System.out.println("c4_1.handler3() 호출");
    return "c04_1";
  }


}












