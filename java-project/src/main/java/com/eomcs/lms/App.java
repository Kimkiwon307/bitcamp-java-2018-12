package com.eomcs.lms;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int leng = 10;
    int index = 0;

    int []no = new int[leng];
    String []content = new String[leng];
    String []title = new String[leng];
    String []start = new String[leng];
    String []end = new String[leng];
    int []ttime = new int[leng];
    int []dtime = new int[leng];

    while(true) {
      System.out.print("번호? ");
      no[index] = Integer.parseInt(kb.nextLine());

      System.out.print("수업명? ");
      title[index] = kb.nextLine();

      System.out.print("수업내용? ");
      content[index] = kb.nextLine();

      System.out.print("시작일? ");
      start[index] = kb.nextLine();

      System.out.print("종료일?" );
      end[index] = kb.nextLine();

      System.out.print("총수업시간? ");
      ttime[index] = Integer.parseInt(kb.nextLine());

      System.out.print("일수업시간? ");
      dtime[index] = Integer.parseInt(kb.nextLine());

      index++;
      
      System.out.println("게속 입력하시겠습니까(Y/n)");
      String answer = kb.nextLine();
      if(!answer.equalsIgnoreCase("y") && !answer.equals(" ")) {
        kb.close();
        break;
      }
    }
    for(int j=0; j< index; j++) {  
      System.out.printf("%d, %s,%s~%s,%d",no[j],
          title[j],start[j],end[j],ttime[j]);
      
    }
  }
}
