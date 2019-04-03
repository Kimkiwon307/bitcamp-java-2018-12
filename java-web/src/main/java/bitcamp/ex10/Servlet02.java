// 클라이언트가 보낸 쿠키 읽기
package bitcamp.ex10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex10/s2")
@SuppressWarnings("serial")
public class Servlet02 extends HttpServlet{

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {


    Cookie[] c = request.getCookies();
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    if(c != null) {
     for(Cookie cc : c) {
       out.printf("%s=%s\n", cc.getName(),cc.getValue());
       if(cc.getName().equals("name3")) {
         out.printf(" =>%s\n", URLDecoder.decode(cc.getValue(),"UTF-8"));
       }
     }
   }
    out.println("쿠키 보냈습니다. ex10/s1");
  }
}
