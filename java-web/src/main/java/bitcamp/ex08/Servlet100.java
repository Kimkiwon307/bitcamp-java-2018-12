// 리프래시 - 클라이언트에게 다른 URL을 요청하라는 명
package bitcamp.ex08;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex08/s100")
@SuppressWarnings("serial")
public class Servlet100 extends HttpServlet{



  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    
    out.println("반가워요 -/ex08/s100");

   

  }
}
