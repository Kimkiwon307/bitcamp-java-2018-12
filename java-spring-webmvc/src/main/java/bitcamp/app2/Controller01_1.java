package bitcamp.app2;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("c01_1") 
public class Controller01_1 {

  @GetMapping("h1")
  public String handler1(Model model) {
    model.addAttribute("name","홍길동");
    model.addAttribute("age",20);
    return"c01_1/h1";
  }

  @GetMapping("h2")
  public void handler2(Model model) {
    model.addAttribute("name","홍길동2");
    model.addAttribute("age",3);
  }

  @GetMapping("h3")
  public Map<String,Object> handler3() {
    HashMap<String,Object> map = new HashMap<>();

    map.put("name","임꺽정");
    map.put("age",20);
    return map;

  }

}


















