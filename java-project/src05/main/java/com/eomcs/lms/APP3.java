package com.eomcs.lms;
import java.sql.Date;
public class APP3 {

  public static void main(String[] args) {
    
    java.util.Scanner kb = new java.util.Scanner(System.in);
    java.util.Date today = new java.util.Date();
    int i = 0;
    
    System.out.print("번호?" );
    int no = Integer.parseInt(kb.nextLine());
    
    System.out.print("내용?" );
    String context = kb.nextLine();
    
    System.out.println("번호: " + no);
    System.out.println("내용: " + context);
    System.out.printf("작성일: %1$tY-%1$tm-%1$td\n",today);
    System.out.print("조회수: " + i);
    

  }

}
