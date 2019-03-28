// 클라이언트로 출력하기 - HTML 출력하기
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex04/s3")
public class Servlet03 extends GenericServlet{

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
  
    
    res.setContentType("text/html;charset=UTF-8");
    res.setContentType("text/plain;charset=UTF-8");
    
    req.setCharacterEncoding("UTF-8");
    String name = req.getParameter("name");
    String photo = req.getParameter("photo");
    int age = Integer.parseInt(req.getParameter("age"));
    PrintWriter out = res.getWriter();

    out.printf("이름=%s\n",name);
    out.printf("나이=%d\n", age);
    out.printf("사진=%s\n", photo);
  }
}
