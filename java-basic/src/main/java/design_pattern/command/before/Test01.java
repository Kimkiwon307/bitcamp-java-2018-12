package design_pattern.command.before;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    CommandHandler handler = new CommandHandler();
    while(true) {
      System.out.print("명령>");
      String input = keyboard.nextLine();

      //상수풀에있는 스트링 인스턴스 주소가 놓인다.
      if("/board/add".equals(input)) {
        handler.addBoard();
      }else if("/board/dlete".equals(input)) {
        handler.deleteBoard();
      }else if("/board/detial".equals(input)) {
        handler.detailBoard();
      }else if("/board/update".equals(input)) {
        handler.updateBoard();
      }else if("/board/list".equals(input)) {
        handler.listBoard();
      }else if("/member/add".equals(input)) {
        handler.addMember();
      }else if("/member/dlete".equals(input)) {
        handler.deleteMember();
      }else if("/member/detial".equals(input)) {
        handler.detailMember();
      }else if("/member/update".equals(input)) {
        handler.updateMember();
      }else if("/member/list".equals(input)) {
        handler.listMember();
      }else if("quit".equals(input)) {
        break;
      }else {
        System.out.println("처리할 수 없는 명령입니다.");
      }
      System.out.println();
    }
    keyboard.close();
  }

}
