// 클라이언트로 출력하기 - 한글 깨짐 현상 처리하기
package bitcamp.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s2")
public class Servlet02 extends GenericServlet{

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
  
    
     // 반드시 출력 스트림을 얻기 전에 설정 해야한다
    res.setContentType("text/"
        + ";charset=UTF-8");
    PrintWriter out =res.getWriter();
    out.println("안녕하세요");
    out.println("hello");
    out.println("こんにちは");
    out.println("你好");
    out.println("sự an ninh");
  }
}
