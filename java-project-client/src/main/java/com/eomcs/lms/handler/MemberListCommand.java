package com.eomcs.lms.handler;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.Agent.LessonAgent;
import com.eomcs.lms.Agent.MemberAgent;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.domain.Member;

public class MemberListCommand implements Command {
  
  Scanner keyboard;
  
  public MemberListCommand(Scanner keyboard) {
    this.keyboard = keyboard;
  }
  
  @Override
  public void execute(ObjectInputStream in, ObjectOutputStream out) {
    try {
    
      List<Member> members =MemberAgent.list(in, out);
    
      for (Member member : members) {
        System.out.printf("%3d, %-20s\n", 
            member.getNo(), member.getName()); 
      }
    }catch(Exception e) {
      System.out.printf("게시글 저장 오류!:%s \n",e.getMessage());
    }
  }
}
