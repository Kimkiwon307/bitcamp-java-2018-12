package com.eomcs.lms;
import java.sql.Date;
public class App {

  public static void main(String[] args) {
    java.util.Scanner kb = new  java.util.Scanner(System.in);

    int[]no =  new int[100];
    String[]title = new String[100];
    String[]content = new String[100];
    Date[]start = new Date[100];
    Date[]end = new Date[100];
    int[]atime = new int[100];
    int[]dtime = new int[100];
    int i = 0;

    while(i < 100) {

      System.out.print("번호: ");
      no[i] = Integer.parseInt(kb.nextLine());

      System.out.print("수업명: ");
      title[i] = kb.nextLine();

      System.out.print("수업내용: ");
      content[i] = kb.nextLine();

      System.out.print("시작일: ");
      start[i] = Date.valueOf(kb.nextLine());

      System.out.print("종료일: ");
      end[i] = Date.valueOf(kb.nextLine());

      System.out.print("총수업시간: ");
      atime[i] = Integer.parseInt(kb.nextLine());

      System.out.print("일수업시간: ");
      dtime[i] = Integer.parseInt(kb.nextLine());

      System.out.print("게속 입력 하시껫습니가? (Y/n)");
      String b = kb.nextLine();
      System.out.println();
      if (!b.equals("y") && !b.equals("Y") && !b.equals(" ")) {
        break;
      }
      i++;
    }
   for(int j=0; j <= i; j++) {
    System.out.printf(" 번호: %d\n 수업명: %s\n 수업내용: %s\n "
        + "기간: %s ~ %s\n 총수업시간: %d 시간 \n 일수업시간: %d 시간\n", no[j],title[j],content[j],start[j],end[j],atime[j],dtime[j]);
   }
   }
}
