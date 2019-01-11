package com.eomcs.lms;

public class APP2 {
  public static void main(String args[]) {
     java.util.Scanner kb = new java.util.Scanner(System.in);
     java.util.Date today = new java.util.Date();
     
     System.out.print("번호?");
     int no = kb.nextInt();
     kb.nextLine();
     
     System.out.print("이름?");
     String name = kb.nextLine();
     
     System.out.print("이메일?");
     String email = kb.nextLine();
     
     System.out.print("암호");
     int pw = kb.nextInt();
     kb.nextLine();
     
     System.out.print("사진?");
     String photo = kb.nextLine();
     
     System.out.print("전화?");
     String tell = kb.nextLine();
     
     System.out.println("번호: " + no);
     System.out.println("이름: " + name);
     System.out.println("이메일: " + email);
     System.out.println("사진:" + photo);
     System.out.println("전화:" + tell);
     System.out.printf("가입일: %1$tY - %1$tm - %1$td\n",today);
  
  
  
  
  
  
  
  
  
  
  
  } 
}
