package bitcamp.app1;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalControllerAdvice{

  @InitBinder
  public void ok(WebDataBinder binder) {

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
  }
}