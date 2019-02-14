package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.LessonAgent;
import com.eomcs.lms.domain.Lesson;

public class LessonDeleteCommand implements Command {

  Scanner keyboard;

  public LessonDeleteCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      LessonAgent.delete(no, in, out);
      System.out.println("데이터 삭제 실패!");

    }catch(Exception e) {
      System.out.printf("게시글 삭제 오류!:%s \n",e.getMessage());
    }

  }


}
