// 클라이언트로 출력하기 - 바이너리 데이터 출력하기
package bitcamp.ex03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s4")
public class Servlet04 extends GenericServlet{


  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {

    ServletContext ctx = req.getServletContext();

    String path= ctx.getRealPath("/WEB-INF/photo.jpeg");

    FileInputStream in = new FileInputStream(path);

    // 반드시 출력 스트림을 얻기 전에 설정 해야한다
    res.setContentType("image/jpeg");
    BufferedOutputStream out = new BufferedOutputStream(res.getOutputStream());

    int b;
    while((b=in.read()) != -1) {
      out.write(b);
    }
    out.flush();
    in.close();
  }
}
