package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    Date today = new Date(System.currentTimeMillis());
    int count = 0;
    int leng = 10;
    int index = 0;
   
    int []no = new int[leng];
    String []content = new String[leng];
   
   while(true) {
     
    System.out.print("번호? ");
    no[index] = Integer.parseInt(kb.nextLine());
    
    System.out.print("내용? ");
    content[index] = kb.nextLine();
    index++;
    System.out.println("게속 입력하시겠습니까(Y/n)");
    String answer = kb.nextLine();
    if(!answer.equalsIgnoreCase("y") && !answer.equals(" ")) {
      kb.close();
      break;
    }
   }
   for(int j = 0 ; j < index; j++) {
     System.out.printf("%d,%s,%s,%d",no[j]
       ,content[j],today,count);
   }
  }
}
