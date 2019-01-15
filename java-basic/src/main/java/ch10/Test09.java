//  생성자 - 기본 생성자(default constructor)
package ch10;
class Monitor7{

  
  int bright ;  //밝기
  int contrast = 50;//명암
  int widthRes ;//해상도 너비
  int heightRes = 1080;//해상도 높이
  
  //Monitor7(){} 컴파일러가 자동으로 만든다.
  
  public void on() {
     System.out.println("화면을 출력한다.");
  }
}
public class Test09{
  public static void main(String[] args) {
  
//    new Monitor7; 컴파일오류!
    
    new Monitor7();

    
  }

}