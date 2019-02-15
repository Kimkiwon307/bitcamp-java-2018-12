package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.BoardAgent;
import com.eomcs.lms.Agent.LessonAgent;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateCommand implements Command {

  Scanner keyboard;
  LessonAgent lessonAgent;
  public LessonUpdateCommand(Scanner keyboard, LessonAgent lessonAgent) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
    
      Lesson lesson =lessonAgent.get(no);
    
      // 기존 값 복제
      Lesson temp = lesson.clone();
      
      System.out.printf("내용? (%s)",temp.getContents());
      String input = keyboard.nextLine();
      if (input.length() > 0) 
        temp.setContents(input);
      
      lessonAgent.update(temp);
      
      System.out.println("게시글을 변경했습니다.");
      
    } catch (Exception e) {
      System.out.println("변경 중 오류 발생!");
    }
  }
  }
  
  

