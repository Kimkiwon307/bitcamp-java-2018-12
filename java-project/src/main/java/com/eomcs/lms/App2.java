package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;
public class App2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    Date today = new Date(System.currentTimeMillis());
    int leng = 10;
    int index = 0;

    int []no = new int[leng];
    String []name = new String[leng];
    String []email = new String[leng];
    String []pw = new String[leng];
    String []photo = new String[leng];
    String []tell = new String[leng];
    while (true) {

      System.out.print("번호? ");
      no [index] = Integer.parseInt(kb.nextLine());

      System.out.print("이름? ");
      name[index] = kb.nextLine();

      System.out.print("이메일? ");
      email[index] = kb.nextLine();

      System.out.print("암호? ");
      pw[index] = kb.nextLine();

      System.out.print("사진?" );
      photo[index] = kb.nextLine();

      System.out.print("전화?" );
      tell[index] = kb.nextLine();
      
        index++;
      System.out.println("게속 입력하시겠습니까(Y/n)");
      String answer = kb.nextLine();
      if(!answer.equalsIgnoreCase("y") && !answer.equals(" ")) {
        kb.close();
        break;
      }
    }
    
    for(int j = 0 ; j < index; j++) {
      System.out.printf("%d,%s,%s,%s,%s",no[j]
        ,name[j],email[j],tell[j],today);
    }


  }
}
