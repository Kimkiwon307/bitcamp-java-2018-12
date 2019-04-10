package com.eomcs.lms.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import com.eomcs.lms.service.PhotoBoardService;

@WebServlet("/photoboard/delete")
public class PhotoBoardDeleteController implements PageController {

  @Autowired PhotoBoardService photoBoardService;
@Override
public String excute(HttpServletRequest request, HttpServletResponse response) throws Exception {

  int no = Integer.parseInt(request.getParameter("no"));
    if (photoBoardService.delete(no) == 0) {
      throw new Exception("해당 번호의 사람이 없습니다");  
    } 
    return "redirect:list";
  }

}