//
package bitcamp.app1;

import java.beans.PropertyEditorSupport;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



//http://localhost:8080/java-spring-webmvc/app1/c04_4/h1?model=sonata&capacity=5&auto=true&createdDate=2019-4-19
@Controller 
@RequestMapping("c04_4") 
public class Controller04_4 {
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

  //h3?engine=bitengine,3500,16
  @GetMapping("h3")
  @ResponseBody 
  public void handler3(
      PrintWriter out,
      @RequestParam("engine") Engine engine) {

    out.println(engine);
  }


  // h2?car=sonata,5,true,2019-4-19


  @InitBinder
  public void ok(WebDataBinder binder) {
    //    System.out.println("Controller04_4.ok()");

    DatePropertyEditor propEditor = new DatePropertyEditor();


    binder.registerCustomEditor(java.util.Date.class, propEditor);
    binder.registerCustomEditor(
        Car.class, // String을 Car 타입으로 바꾸는 에디터임을 지정한다. 
        new CarPropertyEditor()  // 바꿔주는 일을 하는 프로퍼티 에디터를 등록한다.
        );
    
    binder.registerCustomEditor(
        Engine.class, // String을 Car 타입으로 바꾸는 에디터임을 지정한다. 
        new EnginePropertyEditor()  // 바꿔주는 일을 하는 프로퍼티 에디터를 등록한다.
        );
    
  }


  class CarPropertyEditor extends PropertyEditorSupport{
    @Override
    public void setAsText(String text) throws IllegalArgumentException {

      Car car = new Car();

      String[] s = text.split(",");

      car.setModel(s[0]);
      car.setCc(Integer.parseInt(s[1]));
      car.setAuto(Boolean.valueOf(s[2]));
      setValue(car);

    }
  }

  class EnginePropertyEditor extends PropertyEditorSupport{
    @Override
    public void setAsText(String text) throws IllegalArgumentException {

      Engine engine = new Engine();
      String[] s = text.split(",");
      engine.setModel(s[0]);
      engine.setCc(Integer.parseInt(s[1]));
      engine.setValve(Integer.parseInt(s[2]));
    
      setValue(engine);
    }
  }




  // Property Ediotor 만들기 
  class DatePropertyEditor extends PropertyEditorSupport{

    SimpleDateFormat format;

    public DatePropertyEditor() {    
      format = new SimpleDateFormat("yyyy-MM-dd"); 
    }

    public DatePropertyEditor(SimpleDateFormat format) {    
      this.format = format ;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
      System.out.println("DatePropertyEditor.setAsText()");
      Date date;
      try {
        date = format.parse(text);
        setValue(date);
      } catch (ParseException e) {
        throw new IllegalArgumentException(e);
      }
    }




    @Override
    public Object getValue() {
      System.out.println("DatePropertyEditor.getValue()");
      return super.getValue();
    }
  }


}





















