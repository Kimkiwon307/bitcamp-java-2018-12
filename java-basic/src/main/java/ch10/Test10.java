//  생성자 - 기본 생성자(default constructor) II
package ch10;
class Monitor8{
  
  int bright ;  //밝기
  int contrast = 50;//명암
  int widthRes ;//해상도 너비
  int heightRes = 1080;//해상도 높이
  
  //
  Monitor8(int bright, int contrast){
    this.bright = bright;
    this.contrast = contrast;
  }
  
  public void on() {
     System.out.println("화면을 출력한다.");
  }
}
public class Test10{
  public static void main(String[] args) {
  
//    new Monitor8(); 기본 생성자가 없는경우      
    
    new Monitor8(50,50); 

    
  }

}