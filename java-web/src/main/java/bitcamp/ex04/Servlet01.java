// 클라이언트가 
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex04/s1")
public class Servlet01 extends GenericServlet{

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {

    //GET 요청
     // - 웹 브라우저에 URL을 입력한 후 엔터를 치면 GET요청을 보낸다.
    // - 웹 프ㅔ이지에서 링크를 클릭하면 (자바스크립트 처리하지않은상태)GET요청을 보낸다.
    // - 웹 페이지의 폼(method='GET' 일 때 )에서 전송 버튼을 클릭하면 GET요청을 보ㅓ낸다
    //
    // 테스트
    // - /ex04/Test01.html 실행
    // 
    
    // 웹 브라우저가 보낸 데이터 읽기
      String name = req.getParameter("name");
      int age = Integer.parseInt(req.getParameter("age"));
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
      
    out.printf("이름=%s\n",name);
    out.printf("나이=%d\n", age);
  }
}
