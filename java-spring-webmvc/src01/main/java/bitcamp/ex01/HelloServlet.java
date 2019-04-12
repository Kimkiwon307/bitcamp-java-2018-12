package bitcamp.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/ex01/s1")
@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet{
  
@Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    
  res.setContentType("text/html;charset=UTF-8");
  PrintWriter out = res.getWriter();
  out.println("<html><head>안녕</head>");
  out.println("<body><h1>민철아 안녕</h1></body></html>");
  }  

}
