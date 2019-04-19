//
package bitcamp.app1;

import java.beans.PropertyEditorSupport;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@RequestMapping("c04_5") 
public class Controller04_5 {
  @GetMapping("h1")
  @ResponseBody 
  public void handler1(
      PrintWriter out,
      String model,
      int capacity,
      boolean auto,
      Date createdDate) {

    out.printf("model=%s\n", model);
    out.printf("capacity=%s\n", capacity);
    out.printf("auto=%s\n", auto);
    out.printf("createdDate=%s\n", createdDate);
  }

  @GetMapping("h2")
  @ResponseBody 
  public void handler2(
      PrintWriter out,
      @RequestParam("car") Car car) {
    out.println(car);
  }

  @GetMapping("h3")
  @ResponseBody 
  public void handler3(
      PrintWriter out,
      @RequestParam("engine") Engine engine) {

    out.println(engine);
  }



}





















