package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.LessonAgent;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;

public class LessonDetailCommand implements Command {

  Scanner keyboard;
  LessonAgent lessonAgent;
  public LessonDetailCommand(Scanner keyboard, LessonAgent lessonAgent) {
    this.keyboard = keyboard;
    this.lessonAgent =  lessonAgent;
  }

  @Override
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());
    try {
        
      Lesson lesson =  lessonAgent.get(no);
      System.out.printf("내용: %s\n", lesson.getContents());
      System.out.printf("시작날짜: %s\n", lesson.getDayHours());
      System.out.printf("종료날짜: %s\n", lesson.getEndDate());
      System.out.printf("타이틀: %s\n", lesson.getTitle());


    }catch(Exception e) {
      System.out.printf("게시글 상세 정보 출력 오류!:%s \n",e.getMessage());
    }
  }

 
}
