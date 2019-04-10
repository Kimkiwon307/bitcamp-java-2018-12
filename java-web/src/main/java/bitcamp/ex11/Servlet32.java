//  세션의 무효화 시키기 - 값 꺼내기
package bitcamp.ex11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex11/s32")
@SuppressWarnings("serial")
public class Servlet32 extends HttpServlet{


  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    HttpSession session = request.getSession();

    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("v1=%s\n",session.getAttribute("v1"));
  }
}