package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberListCommand implements Command{
  
  Scanner keyboard;
  List<Member> list;
  
  public MemberListCommand(Scanner keyboard, List<Member> list) {
    this.keyboard = keyboard;
    
    // 다음과 같이 이 클래스가 사용할 List 객체를 LinkedList로 결정해 버리면,
    // List 사용 규칙을 따르는 다른 객체로 쉽게 변경할 수 없다.
    // 다른 List 객체로 변경하려면 이 클래스의 생성자 코드를 바꿔야 한다.
    // 어떤 기능을 변경할 때마다 소스 코드를 변경하는 방식은 유지보수에 좋지 않다.
    // 해결책?
    // => 이 클래스에서 어떤 List 객체를 사용할 것인지 결정하지 말고 
    //    이 클래스를 사용하는 쪽에서 결정하도록 유도하라!
    // => 즉 생성자에게 List 객체를 준비하지 말고 파라미터로 주입 받아라.
    //    이렇게 자기가 작업하는데 사용하는 도구를 "의존 객체(dependency)" 라 부른다.
    //    그리고 의존 객체를 자기가 생성하지 않고 외부로부터 주입 받는 것을 
    //    "의존 객체 주입(dependency injection; DI)"라고 부른다.
    // 
    //this.list = new LinkedList<>(); // 이 클래스에서 의존 객체를 결정하지 말자!
    this.list = list; // 파라미터로 주입된 의존 객체를 저장한다.
  }
  
  public void execute() {
    Member[] members = list.toArray(new Member[] {});
    for (Member member : members) {
      System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n", 
          member.getNo(), member.getName(), 
          member.getEmail(), member.getTel(), member.getRegisteredDate());
    }
  }

  
  private int indexOfMember(int no) {
    for (int i = 0; i < list.size(); i++) {
      Member m = list.get(i);
      if (m.getNo() == no)
        return i;
    }
    return -1;
  }
}
