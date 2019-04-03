// 
package bitcamp.ex11;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex11/s1")
@SuppressWarnings("serial")
public class Servlet01 extends HttpServlet{

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {


    //세션
    // => 클라이언트를 식별하는 기술이다.
    // => HTTP 프로토콜은 Stateless 방식으로 통신을 한다.
    //     즉 연결한 후 요청하고 응답을 받으면 연결을 끊는다.
    //     그래서 서버는 클라이언트가 요청할 때 마다 누구인지 알 수 없다.
     //    이를 해결하기 위해 클라이언트가 접속하면 웹 서버는 그 클라이언트를 위한
    //     고유 번호를 발급(쿠키이용)한다.
    //     이 고유 번호를 '세션 아이디' 라 부른다.
    //  웹브라우저는 세션 아이디를 보관해 두엇다가 그 서버에 요청할 때마다
    //     세션 아이디를 보낸다
    //         왜? 세션 아이디는 쿠키기이다.
    // 세션 아이디는 쿠키는 유효기간을 설정하지 않앗기 때문에
    //  웹 브라우저를 종료하면 세션 아이디 쿠키는 삭제된다.
    //  세션 아이디 쿠키의 사용 범위는 웹 애플리케이션이다.
    // ex) /java-web 
    //  따라서 같은 웹 애플리케이션의 서브릿을 실행할 때는 무조건 세션아이디를 보낸다
   
    //세션 생성하기
    HttpSession session = request.getSession();
    
    
    // 세션에 데이터 보관하기
    session.setAttribute("v1", "aaa");
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();


    out.println("session생성함. ex11/s1");
  }
}
