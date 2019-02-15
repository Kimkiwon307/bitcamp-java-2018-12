package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.BoardAgent;
import com.eomcs.lms.Agent.LessonAgent;
import com.eomcs.lms.Agent.MemberAgent;
import com.eomcs.lms.domain.Lesson;

public class LessonDeleteCommand implements Command {

  Scanner keyboard;
  LessonAgent lessonAgent;
  
  public LessonDeleteCommand(Scanner keyboard, LessonAgent lessonAgent) {
    this.keyboard = keyboard;
    this.lessonAgent = lessonAgent;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      lessonAgent.delete(no);
      System.out.println("데이터 삭제 실패!");

    }catch(Exception e) {
      System.out.printf("게시글 삭제 오류!:%s \n",e.getMessage());
    }

  }


}
