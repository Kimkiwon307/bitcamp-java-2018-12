package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.BoardAgent;
import com.eomcs.lms.Agent.MemberAgent;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.domain.Member;

public class MemberDetailCommand implements Command {
  
  Scanner keyboard;
  
  public MemberDetailCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }
  
  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());
    try {
      Member member =  MemberAgent.get(no, in, out);
      System.out.printf("이름: %s\n", member.getName());
      System.out.printf("비번: %s\n", member.getPassword());




    }catch(Exception e) {
      System.out.printf("게시글 상세 정보 출력 오류!:%s \n",e.getMessage());
    }

  
  }

 
}
