// 클라이언트로 출력하기
package bitcamp.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s1")
public class Servlet01 extends GenericServlet{

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
  
    // 출력 스트림을 꺼내기 전에 출력할 때 사용할 문자표
    PrintWriter out =res.getWriter();
    out.print("안녕하세요");
    out.print("hello");
    out.print("こんにちは");
    out.print("你好");
      out.print("sự an ninh");
  }
}
