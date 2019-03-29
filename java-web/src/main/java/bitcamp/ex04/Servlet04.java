// 클라이언트로 출력하기 - HTML 출력하기
package bitcamp.ex04;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/ex04/s4")
public class Servlet04 extends GenericServlet{

  private static final long serialVersionUID = 1L;
  private  String uploadDir;


  @Override
  public void init() throws ServletException {
    //이 메서드는 init(ServletConfig)가 호출 될 때 이 메서드를 호출한다.

    this.uploadDir = this.getServletContext().getRealPath("/upload");
    System.out.println(uploadDir);
  }
  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {




    //    req.setCharacterEncoding("UTF-8"); 멀티할때는 안먹힘
    //  
    //    String name = req.getParameter("name");
    //    String age = req.getParameter("age");
    //    String photo = req.getParameter("photo");
    //    
    //    res.setContentType("text/plain;charset=UTF-8");
    //    PrintWriter out = res.getWriter();
    //
    //    out.printf("이름=%s\n",name);
    //    out.printf("나이=%s\n", age);
    //    out.printf("사진=%s\n", photo);
    // 멀티파트 형식의 데이터 처리하기
    //1) Apache 라이브러리 가져온다.
    //   - mvnrepository.com에서 apache fileupload 라이브러리 검색한다.
    //     - build.gradle에 라이브러리 정보 추가한다.
    //      - '$ gradle eclipse' 실행하여 이클립스 설정 파일을 갱신한다.
    // 
    DiskFileItemFactory  fileItemFactory = new DiskFileItemFactory();

    ServletFileUpload multipartDataHandler = 
        new ServletFileUpload(fileItemFactory);

    HashMap<String,String> paramMap = new HashMap<>();


    try {
      List<FileItem> parts = multipartDataHandler.parseRequest((HttpServletRequest)req);
      for(FileItem part : parts) {
        if(part.isFormField()) {
          paramMap.put(part.getFieldName(),part.getString("UTF-8"));
        }else {
          String filename = UUID.randomUUID().toString();
          File file = new File(this.uploadDir + "/" + filename);

          part.write(file);

          paramMap.put(part.getFieldName(),filename);

        }
      }
      res.setContentType("text/html;charset=UTF-8");
      PrintWriter out = res.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet04</title>");
      out.println("</head>");
      out.println("<body><h1>파일 업로드 결과</h1>");
      out.printf("이름=%s<br>\n",paramMap.get("name"));
      out.printf("나이=%s<br>\n", paramMap.get("age"));
      out.printf("사진=%s<br>\n", paramMap.get("photo"));
      out.printf("<img src='../upload/%s'><br>\n",paramMap.get("photo"));
      out.println("</body></html>");
    }catch(Exception e) {
      e.printStackTrace();
    }
  }
}
