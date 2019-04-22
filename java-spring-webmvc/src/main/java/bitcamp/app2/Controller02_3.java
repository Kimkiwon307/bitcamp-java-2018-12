// URL 에서 값 추출하기 - URL에 포함된 정규표현식 다루기
package bitcamp.app2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@RequestMapping("/c02_3")
public class Controller02_3 {

// app2/c02_3/h1/kim/010-124545/man
  @GetMapping(value ="h1/{name}/{tel}/{gender}", 
      produces="text/plain;charset=UTF-8")
  @ResponseBody
  public String handler1(
      @PathVariable String name, 
      @PathVariable String tel,
      @PathVariable String gender) {
    return String.format("team: %s\n tel: %s \n gender=%s", name, tel,gender);
  }

  @GetMapping(
      value ="h2/{name:[a-zA-Z0-9]+}/{tel:[0-9]{3}+-[0-9]{4}+-[0-9]{4}+}/{gender:man|woman}", 
      produces="text/plain;charset=UTF-8")
  @ResponseBody
  public String handler2(
      @PathVariable String name, 
      @PathVariable String tel,
      @PathVariable String gender) {
    return String.format("team: %s\n tel: %s \n gender=%s", name, tel,gender);
  }
  
  
}













