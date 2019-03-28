// 클라이언트로 출력하기 - HTML 출력하기
package bitcamp.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s3")
public class Servlet03 extends GenericServlet{

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
  
    
     // 반드시 출력 스트림을 얻기 전에 설정 해야한다
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out =res.getWriter();
    
    out.println("<html>");
    out.println("<head><title>롤하면..</title></head>");
    out.println("<body> <h1>질텐데..</h1></body>");
    out.println("</html>");
  }
}
