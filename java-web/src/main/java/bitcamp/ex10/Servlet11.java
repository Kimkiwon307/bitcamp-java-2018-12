// 쿠키 유효기간 설정하기 
package bitcamp.ex10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex10/s11")
@SuppressWarnings("serial")
public class Servlet11 extends HttpServlet{

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 쿠키 유효기간
    // 유효기간을 설정하면 그 기간 동안에만 웹서버에게 쿠키를 보낸

    //유효 기간을 설정하지 않으면 웹브라우저가 실행되는 동안에만 웹서버에게 쿠키를 보낸다.
    Cookie c1 = new Cookie("v1","aaa");

    //유효기간을 설정하면 웹브라우저를 종료해도 삭제되지 않는다.
    // 단 유효기간이 지나면 웹서버에 보내지 않고 삭제한다.
    Cookie c2 = new Cookie("v2","bbb");
    c2.setMaxAge(30);  //30초 유효

    Cookie c3 = new Cookie("v3", "ccc");
    c3.setMaxAge(60); //60초 유효
   
    // 쿠키를 응답 헤더에 포함시키기
    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();


    out.println("쿠키 보냈습니다. ex10/s11");
  }
}
