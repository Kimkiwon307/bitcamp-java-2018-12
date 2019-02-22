package com.eomcs.lms.handler;

import java.util.List;

import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonListCommand extends  AbstractCommand {
  
 
  LessonDao lessonDao;
  
  public LessonListCommand(LessonDao lessonDao) {
 
    this.lessonDao = lessonDao;
  }
  
  
  @Override
  public void execute(Response response) throws Exception {
      List<Lesson> lessons = lessonDao.findAll();
      for (Lesson lesson : lessons) {
    	  response.println(String.format("%3d,%-15s, %s, %10s ~ %10s\n", 
            lesson.getNo(), lesson.getTitle(),lesson.getContents(), 
            lesson.getStartDate(), lesson.getEndDate()));
      }
  }
}
