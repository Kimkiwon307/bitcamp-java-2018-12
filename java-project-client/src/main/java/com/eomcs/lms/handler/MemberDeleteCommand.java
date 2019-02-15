package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.BoardAgent;
import com.eomcs.lms.Agent.MemberAgent;
import com.eomcs.lms.domain.Member;

public class MemberDeleteCommand implements Command {

  Scanner keyboard;
  MemberAgent memberAgent;
  
  public MemberDeleteCommand(Scanner keyboard, MemberAgent memberAgent) {
    this.keyboard = keyboard;
    this.memberAgent = memberAgent;
  }

  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      memberAgent.delete(no);
      System.out.println("데이터 삭제 성공!");

    }catch(Exception e) {
      System.out.printf("게시글 삭제 오류!:%s \n",e.getMessage());
    }
  }


}
