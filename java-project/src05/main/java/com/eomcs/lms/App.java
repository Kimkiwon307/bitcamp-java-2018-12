package com.eomcs.lms;

public class App {

  public static void main(String[] args) {
      java.util.Scanner kb = new  java.util.Scanner(System.in);
      
 
      System.out.print("번호: ");
      int no = kb.nextInt();
      kb.nextLine();
      
      System.out.print("수업명: ");
      String title = kb.nextLine();
      
      System.out.print("수업내용: ");
      String content = kb.nextLine();
      
      System.out.print("시작일: ");
      String start = kb.nextLine();
      
      System.out.print("종료일: ");
      String end = kb.nextLine();
      
      System.out.print("총수업시간: ");
      int atime = kb.nextInt();
      kb.nextLine();
      
      System.out.print("일수업시간: ");
      int dtime = kb.nextInt();
      kb.nextLine();
      
      System.out.printf(" 번호: %d\n 수업명: %s\n 수업내용: %s\n "
          + "기간: %s ~ %s\n 총수업시간: %d 시간 \n 일수업시간: %d 시간\n", no,title,content,start,end,atime,dtime);
  }
}
