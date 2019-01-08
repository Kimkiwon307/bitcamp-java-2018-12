// 흐름 제어문 - if else 조건문
package ch05;

public class Test02{
    public static void main(String[] args) {
    
        int age = 24;
        
        if(age >= 22) 
          System.out.println("성인입니다");
        else
          System.out.println("미성년입니다.");
        // k & R 스타일
        if(age >= 22) { 
          System.out.println("----------");
          System.out.println("성인입니다");
        }
        else {
          System.out.println("------------");
          System.out.println("미성년입니다.");
        } 
        // ---------------------------------------------------
        if(age >= 22) { 
          System.out.println("----------");
          System.out.println("성인입니다");
        } else {
          System.out.println("------------");
          System.out.println("미성년입니다.");
         } 
        
        //if 문만 작성할 수 있지만  else문만 존재할 수 없다.
        
       // else 
          System.out.println("ok?"); // 에러

    
    
    
    
    
    
    
    
    
    
    
    
    }
}
