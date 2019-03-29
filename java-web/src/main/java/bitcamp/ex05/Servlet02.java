// HTTP 프로토콜 다루기 - HttpServletRuquest 와 GET/POST
package bitcamp.ex05;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex05/s2")
public class Servlet02 extends MyHttpServlet {

  private static final long serialVersionUID = 1L;

  
  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
   if( request.getMethod().equals("GET")) {
     out.println("GET임");
   }else if(request.getMethod().equals("POST")) {
     out.println("post임");
   }else {
     out.println("이 서블릿이 다루지못함");
   }
  
  }
}
