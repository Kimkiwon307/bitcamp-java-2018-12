package com.eomcs.lms.controller;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.servlet.ServletContext;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.context.RequestMapping;
import com.eomcs.lms.context.RequestParam;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5)
@Controller
public class MemberController  {
  @Autowired MemberService memberService;
  
  @RequestMapping("/member/form")
  public String form() throws Exception {
      return "/member/form.jsp";
    }
  @RequestMapping("/member/add")
  public String add(@RequestParam("contents")String contents
      ,@RequestParam("photos")Part photos)throws Exception{

    
    Member member = new Member();
    member.setName(contents);
    member.setEmail(contents);
    member.setPassword(contents);
    member.setTel(contents);

    
    
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

  @RequestMapping("/member/delete")
  public String delete(@RequestParam("no") int no) throws Exception {


    if (memberService.delete(no) == 0) {
      throw new Exception("해당 번호의 사람이 없습니다");
    } 

    return "redirect:list";
  }
  @RequestMapping("/member/detail")
  public String detail(@RequestParam("no") int no,Map<String,Object>map) throws Exception {
    Member member = memberService.get(no);
    map.put("member", member);

    return "/member/detail.jsp";
  }
  
  @RequestMapping("/member/list")
  public String list(Map<String,Object> map) throws Exception {

    List<Member> members = memberService.list(null);
    map.put("list", members);

    // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
    return "/member/list.jsp";
  }
  
  @RequestMapping("/member/search")
  public String search(HttpServletRequest request, HttpServletResponse response) throws Exception {

    String keyword = request.getParameter("keyword");

    List<Member> members = memberService.list(keyword);
    request.setAttribute("list", members);

    // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
    return "/member/search.jsp";
  }
  @RequestMapping("/member/update")
  public String update(HttpServletRequest request, HttpServletResponse response) throws Exception {

    Member member = new Member();
    member.setNo(Integer.parseInt(request.getParameter("no")));
    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
    member.setPassword(request.getParameter("password"));
    member.setTel(request.getParameter("tel"));
    Part photo = request.getPart("photo");

    if (photo.getSize() > 0) {
      String filename = UUID.randomUUID().toString();
      String uploadDir = request.getServletContext().getRealPath("/upload/member");
      photo.write(uploadDir + "/" + filename);
      member.setPhoto(filename);
    }

    if (memberService.update(member) == 0) {
      throw new Exception("aa");
    }
    return "redirect:list";   
  }

}