// 예외 처리하기 - 여러 개의 예외가 발생할때 멀티 catch블록사용
package ch21.b;

import java.util.HashMap;
import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {
  
    Scanner kb = new Scanner(System.in);
    
    HashMap<String,Command> commandMap = new HashMap();
    commandMap.put("plus",new PlusCommand(kb)); 
    
    while(true) {
      
      if(kb.equals("quit"))
         break;
    System.out.println("명령>");
    String input = kb.nextLine();

    //예외 처리 문법을 적용하면, 예외가 발생하더라도 JVM을 멈추지 안흔다.
    
    try {
     Command command = commandMap.get(input);
     command.execute();
     //try 블록에서 발생할 수 있는 예외가 여러개일때
     // 각 예외 정보를 받을 catch 블록을 여러 개 둘 수 있따.
    
    }catch (NullPointerException e) {
      System.out.println("해당 명령이 존재하지 않습니다.");
    }catch(NumberFormatException e) {
      System.out.println("숫자를 입력하세요");
    }
     System.out.println("실행 완료");
    }

    kb.close();
  }



}
