// 리프래시 - 클라이언트에게 다른 URL을 요청하라는 명
package bitcamp.ex08;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex08/s1")
@SuppressWarnings("serial")
public class Servlet01 extends HttpServlet{

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    for(int i = 0; i<10; i++) {
    out.println(i + "===> 12345678901234567890123456789012345678901234567890123456789012345678901234567890");
    }
    response.setHeader("refresh", "3;url=s100");

  }
}
