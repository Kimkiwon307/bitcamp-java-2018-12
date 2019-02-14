package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.BoardAgent;
import com.eomcs.lms.Agent.MemberAgent;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.domain.Member;

public class MemberUpdateCommand implements Command {
  
  Scanner keyboard;
  
  public MemberUpdateCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }
  
  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
      Member member =  MemberAgent.get(no, in, out);
       // 기존 값 복제
       Member temp = member.clone();

       System.out.printf("이름? ");
       String input = keyboard.nextLine();
       if (input.length() > 0) 
         temp.setName(input);

       MemberAgent.update(member, in, out);

       System.out.println("게시글을 변경했습니다.");

     } catch (Exception e) {
       System.out.println("변경 중 오류 발생!");
     }
   
  }
  
 
}
