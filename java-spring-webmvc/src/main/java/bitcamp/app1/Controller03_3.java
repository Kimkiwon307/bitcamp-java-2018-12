// request handler 구분하는 방법 - accept 요청 헤더의 값에 따라 요청하기
package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("c03_3") 
public class Controller03_3 {

  //테스트 방법:
  //=> http://localhost:8080/java-spring-webmvc/html/app1/c03_3.html
  //=> 요청 헤더 중에서 특정 이름을 갖는 헤더가 있을 때 호출될 메서드를 지정할 수 있따.
  //=> 웹 페이지에서 링크를 클릭하거나 입력 폼에 값을 넣고 등록 버튼을 누르는 
  // 일반적인 상황에서는 요청헤더에 임의의 헤더를 추가할 수 없다.
  //=> 자바스크립트 등의
  @GetMapping(produces = "text/plain")
  @ResponseBody 
  public String handler1() {
    return "handler1";
  }

  @GetMapping(produces = "text/html")
  @ResponseBody 
  public String handler2() {
    return "handler2";
  }

  @GetMapping(produces = "application/json")
  @ResponseBody 
  public String handler3() {
    return "handler3";
  }
  
  @GetMapping()
  @ResponseBody 
  public String handler4() {
    return "handler4";
  }




}
