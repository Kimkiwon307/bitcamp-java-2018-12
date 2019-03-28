// 클라이언트가 
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex04/s2")
public class Servlet02 extends GenericServlet{

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
   
    //POST 요청

    // 테스트
    // - /ex04/Test02.html 실행
    // 

    // 웹 브라우저가 보낸 데이터 읽기
    req.setCharacterEncoding("UTF-8");
    String name = req.getParameter("name");
    int age = Integer.parseInt(req.getParameter("age"));
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.printf("이름=%s\n",name);
    out.printf("나이=%d\n", age);
  }
}
