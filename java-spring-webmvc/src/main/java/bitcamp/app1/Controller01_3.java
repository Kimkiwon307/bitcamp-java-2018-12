// 페이지 컨트롤러 만드는 방법 - 실무용
package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/c01_3") // 핸들러에 적용될 기본 URL을 지정한다.
public class Controller01_3 {

  @RequestMapping("h1")
  @ResponseBody 
  public String handler() {
    return "c01_3_h1";
  }
  
  @RequestMapping("h2")
  @ResponseBody
  public String handler2() {
    return "c01_3_h2";
  }

  @RequestMapping("/h3") //URL을 지정할 때 디렉토리 형식으로 지정할 수 있다.
  @ResponseBody
  public String handler3() {
    return "c01_3_h3";
  }
  
  @RequestMapping("////////////////////////////////////////////////h4") //URL을 지정할 때 디렉토리 형식으로 지정할 수 있다.
  @ResponseBody
  public String handler4() {
    return "c01_3_h4";
  }
    
  
}
