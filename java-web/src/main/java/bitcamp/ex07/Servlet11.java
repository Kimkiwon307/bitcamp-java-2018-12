// 포워딩(forwarding) - 서블릿 실행을 위임하기
package bitcamp.ex07;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex07/s11")
@SuppressWarnings("serial")
public class Servlet11 extends HttpServlet{


  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {


    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("---------------------------------");
    out.print("계산결과 :");
   
    
    String op =  request.getParameter("op");

    
    RequestDispatcher 요청배달자 = null;
    if(op.equals("+")) {
      요청배달자 =  request.getRequestDispatcher("/ex07/s11_pluse");
    }else if (op.equals("-")) {
      요청배달자 = request.getRequestDispatcher("/ex07/s11_minus");
    } else {
      요청배달자 = request.getRequestDispatcher("/ex07/s11_error");
    }
    // 다른 서블릿을 실행시키낟. 실행이 완료되면 돌아온다.
    요청배달자.include(request, response);

    out.println("---------------------------------");
  }
}
