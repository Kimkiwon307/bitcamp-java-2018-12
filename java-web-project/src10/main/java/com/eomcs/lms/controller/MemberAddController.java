package com.eomcs.lms.controller;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5)
@Controller("/member/add")
public class MemberAddController implements PageController {

  @Autowired MemberService memberService;
@Override
public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    if(request.getMethod().equals("GET")) {
      return "/member/form.jsp";
    }
   ServletContext sc = request.getServletContext();
    
    Member member = new Member();
    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
    member.setPassword(request.getParameter("password"));
    member.setTel(request.getParameter("tel"));
    
    Part photo = request.getPart("photo");
    if (photo.getSize() > 0) {
      String filename = UUID.randomUUID().toString();
      String uploadDir = sc.getRealPath(
          "/upload/member");
      photo.write(uploadDir + "/" + filename);
      member.setPhoto(filename);
    }

    memberService.add(member);
    
  return "redirect:list";
  }

}
