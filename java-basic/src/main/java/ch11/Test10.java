// Wrapper 클래스와 오토빡싱/오토  언빡싱
package ch11;


public class Test10{
  public static void main(String[] args) {
    
    Integer obj1  = Integer.valueOf(100); //빡싱
    int i1 = obj1.intValue();            // 언빡싱
    
    int i2= obj1; // 오토 언빡싱
    Integer obj2 = 200;  // 오토 빡싱
 
  
  
  
  
  
  }
}