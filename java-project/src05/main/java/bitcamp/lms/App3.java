/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitcamp.lms;

public class App3 {
   public static void main(String[] args) {
     java.util.Scanner kb  = new java.util.Scanner(System.in);
     java.util.Date today = new java.util.Date();
     
     System.out.print("번호? ");
     int n = kb.nextInt();
     kb.nextLine();
     
     System.out.print("내용? ");
     String m = kb.next();
     
     kb.close();
     
     System.out.printf("번호: %d\n내용: %s\n", n,m);
     System.out.printf("작성일: %1$tY-%1$tm-%1$td\n", today);
     System.out.print("조회수: 0");
     
     
       
   }
}
