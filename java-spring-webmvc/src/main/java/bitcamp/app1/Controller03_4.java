// request handler 구분하는 방법 - accept 요청 헤더의 값에 따라 요청하기
package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("c03_4") 
public class Controller03_4 {

  //테스트 방법:
  //=> http://localhost:8080/java-spring-webmvc/html/app1/c03_4.html
  @PostMapping(consumes = "application/x-www-form-urlencoded")
  @ResponseBody 
  public String handler1() {
    return "handler1";
  }

  @PostMapping(consumes = "multipart/form-data")
  @ResponseBody 
  public String handler2() {
    return "handler2";
  }

  @PostMapping(consumes = "text/csv")
  @ResponseBody 
  public String handler3() {
    return "handler3";
  }
  
  @PostMapping(consumes = "application/json") 
  @ResponseBody 
  public String handler4() {
    return "handler4";
  }

  @RequestMapping
  @ResponseBody 
  public String handler5() {
    return "handler5";
  }




}
