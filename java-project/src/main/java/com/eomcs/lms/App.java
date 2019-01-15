package com.eomcs.lms;

import java.sql.Date;

public class App {

  static java.util.Scanner kb = new java.util.Scanner(System.in);  
  static Date today = new Date(System.currentTimeMillis()); 
  static int lindex = 0;
  static int mindex = 0;
  static int bindex = 0;
  static int count = 0;

  static Lesson lesson = new Lesson();
  static Member member = new Member();
  static Board board = new Board();

  public static void main(String[] args) {

   

    while(true) {
      String commend = prompt();

      if (commend.equals("/lesson/add")) {
        addLesson();
      } else if(commend.equals("/lesson/list")) {
         listLesson();
      }else if(commend.equals("/member/add")) {
          addMember();
      }else if(commend.equals("/member/list")) {
          listMember();
      }else if(commend.equals("/board/add")) {
          addBoard();
      }else if(commend.equals("/board/list")) {
          listBoard();
      }else if(commend.equals("quit")) {
        System.out.println("안녕");

      }else
        System.out.println("실행할 수 없는 명령입니다.");

    }
  }
  static void addLesson() {

    System.out.print("번호? "); 
    lesson.no[lindex] = Integer.parseInt(kb.nextLine());

    System.out.print("수업명? ");
    lesson.title[lindex] = kb.nextLine();

    System.out.print("설명? ");
    lesson.content[lindex] = kb.nextLine();

    System.out.print("시작일? ");
    lesson.start[lindex] = Date.valueOf(kb.nextLine());

    System.out.print("종료일? ");
    lesson.end[lindex] = Date.valueOf(kb.nextLine());

    System.out.print("총수업시간? ");
    lesson.ttime[lindex] = Integer.parseInt(kb.nextLine());

    System.out.print("일수업시간? ");
    lesson.dtime[lindex] = Integer.parseInt(kb.nextLine());

    lindex ++;

    System.out.println("저장하였습니다.");
  }
  static void listLesson() {
    for(int j=0; j < lindex; j++) {
      System.out.printf("%d, %s,%s ~ %s,%d",lesson.no[j],lesson.title[j]
          ,lesson.start[j],lesson.end[j],lesson.ttime[j]);
      System.out.println();
    }
  }
  static void addBoard() {
    System.out.print("번호? ");
    board.no[bindex] = Integer.parseInt(kb.nextLine());

    System.out.print("내용? ");
    board.content[bindex] = kb.nextLine();

    bindex++;
    System.out.println("저장하였습니다.");
  }
  static void listBoard() {
    for(int j = 0 ; j < bindex ; j++) {

      System.out.printf("%d, %s,%s,%d",board.no[j],board.content[j],today,count);
      System.out.println();
    }
  }
  static void addMember() {
    System.out.print("번호? ");
    member.no[mindex] = Integer.parseInt(kb.nextLine());

    System.out.print("이름? ");
    member.name[mindex] = kb.nextLine();

    System.out.print("이메일? ");
    member.email[mindex] = kb.nextLine();

    System.out.print("암호? ");
    member.pw[mindex] = Integer.parseInt(kb.nextLine());

    System.out.print("사진? ");
    member.photo[mindex] = kb.nextLine();

    System.out.print("전화? ");
    member.tell[mindex] = kb.nextLine();

    mindex++;
    System.out.println("저장하였습니다.");
  }
  static void listMember() {
    for(int j = 0; j < mindex ; j++) {
      System.out.printf("%d, %s , %s , %s, %s",member.no[j],member.name[j],member.email[j]
          ,member.tell[j],today);
      System.out.println();
    } 
  }
  static String prompt(String s){
    System.out.print("명령>");
    String commend = kb.nextLine();
    return s;
  }
}
