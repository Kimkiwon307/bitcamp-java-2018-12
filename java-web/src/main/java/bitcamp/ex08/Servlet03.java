// 리다이렉트 - 으응답할 떄 콘텐트를 보내지 않는다. 바로 다른 페이지를 요청하라고 명령한다.
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

@WebServlet("/ex08/s3")
@SuppressWarnings("serial")
public class Servlet03 extends HttpServlet{

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 리다이렉트 : 클라이언트의 요청을 받은 후 콘텐트를 보내는 대신 다른 페이지의 URL을 알려줄 때 사용한다.
    //             웹 브라우저는 응답 받는 즉시 해당 페이지를  요청한다.
    //             리프레시와 달리 서버는 콘텐트(메세지 바디)를 보내지 않는다.
    //     사용 예 : 로그인후 즉시 메인 화면으로 보내고 싶을때 결제완료 후 결과를 출력하지 않고 즉시 결제 상태 페이지로 보내고 싶을 
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<html><head>");
    out.println("<meta http-equiv ='refresh' content='3;url=s100'>");
    out.println("</haed><body>");
//    for(int i =0 ;i<1000;i++) {
    out.println("안녕하세요 - ex08/s2");
//    }
    out.println("</body></html>");

    //클라이언트에게 URL을 알려줄 때 상대 경로를 지정할 수 있다.
     // forward/include와 달리 '/'는 컨텍스트 루트(웹 에플리케이션루트)가 아닌
    // 웹서버 루트를 의미한다.
    response.sendRedirect("s100");
  }
}
