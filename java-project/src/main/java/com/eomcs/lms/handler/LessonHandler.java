package com.eomcs.lms.handler;

import java.awt.List;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {
  
  LessonList ll = new LessonList();
  public Scanner keyboard;
 
  public LessonHandler(Scanner keyboard) {
    this.keyboard = keyboard;
  }
  
 public void addLesson() {
    Lesson lesson = new Lesson();

    System.out.print("번호? ");
    lesson.setNo(Integer.parseInt(keyboard.nextLine()));
    
    System.out.print("수업명? ");
    lesson.setTitle(keyboard.nextLine());

    System.out.print("설명? ");
    lesson.setContents(keyboard.nextLine());

    System.out.print("시작일? ");
    lesson.setStartDate(Date.valueOf(keyboard.nextLine())); 

    System.out.print("종료일? ");
    lesson.setEndDate(Date.valueOf(keyboard.nextLine())); 

    System.out.print("총수업시간? ");
    lesson.setTotalHours(Integer.parseInt(keyboard.nextLine()));

    System.out.print("일수업시간? ");
    lesson.setDayHours(Integer.parseInt(keyboard.nextLine())) ;

     ll.add(lesson);
   

    System.out.println("저장하였습니다.");
  }
  public void listLesson() {
    Lesson[] lessons = ll.toArray();
    for (Lesson lesson : lessons) {
      System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
          lesson.getNo(), lesson.getTitle(), lesson.getStartDate(), 
          lesson.getEndDate(), lesson.getTotalHours());
    }
  }
}
