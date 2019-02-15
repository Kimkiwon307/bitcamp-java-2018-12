package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.LessonAgent;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Lesson;

public class LessonListCommand implements Command {
  
  Scanner keyboard;
  LessonAgent lessonAgent;
  public LessonListCommand(Scanner keyboard, LessonAgent lessonAgent) {
    this.keyboard = keyboard;
    this.lessonAgent =  lessonAgent;
  }
  
  @Override
  public void execute() {
    try {
      List<Lesson> lessons = lessonAgent.list();
      for (Lesson lesson : lessons) {
        System.out.printf("%3d, %-20s, %s, %s,%s\n", 
            lesson.getNo(), lesson.getContents(), 
            lesson.getDayHours(), lesson.getEndDate(), lesson.getTitle());
      }
    }catch(Exception e) {
      System.out.printf("게시글 저장 오류!:%s \n",e.getMessage());
    }
    
    
  }
}
