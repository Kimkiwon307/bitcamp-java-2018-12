//
package bitcamp.app1;

import java.io.PrintWriter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
@RequestMapping("c04_6") 
public class Controller04_6 {
  @GetMapping("h1")
  @ResponseBody 
  public void handler1(
      PrintWriter out,
      @RequestHeader("Accept") String accept,
      @RequestHeader("User-Agent")  String userAgent
      ) {
    out.printf("accept=%s\n", accept);
    out.printf("userAgent=%s\n", userAgent);
    out.println(userAgent.matches("chrome"));

  }

  public static void main(String[]args) {
        String str ="Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36";
    
//    String str ="AA BB Aa Bb $12,000";
    String regex = "Chrome.*Safari";
    Pattern pattern = Pattern.compile(regex);

    Matcher matcher = pattern.matcher(str);

    if( matcher.find()) {
      System.out.println("ok");
   
      //    for(int i =0; i< matcher.groupCount(); i++) {
      //      System.out.println(matcher.group(i));
      //    }
      //     
    }

    System.out.println(str.matches("chrome"));


  }


}





















