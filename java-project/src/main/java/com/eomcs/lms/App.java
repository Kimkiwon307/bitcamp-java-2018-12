package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);
  static final int LENGTH = 10;

  public static void main(String[] args) {

    LessonHandler lh = new LessonHandler(keyboard);
    BoardHandler bh = new BoardHandler(keyboard);
    MemberHandler mh = new MemberHandler(keyboard);


    while (true) {
      String command = prompt();

      if (command.equals("/lesson/add")) {

        lh.addLesson();

      } else if (command.equals("/lesson/list")) {
        lh.listLesson();

      } else if (command.equals("/member/add")) {
        mh.addMember();

      } else if (command.equals("/member/list")) {
        mh.listMember();

      } else if (command.equals("/board/add")) {
       bh.addBoard();

      } else if (command.equals("/board/list")) {
        bh.listBoard();

      } else if (command.equals("quit")) {
        System.out.println("안녕!");
        break;

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }

      System.out.println(); // 결과 출력 후 빈 줄 출력
    }

    keyboard.close();
  }

  private static String prompt() {
    System.out.print("명령> ");
    return keyboard.nextLine().toLowerCase();
  }








}
