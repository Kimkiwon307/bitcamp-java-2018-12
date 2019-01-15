//  생성자 - 정의하는 방법
package ch10;
class Monitor6{
  //초기화 문장?
  //변수를 선언할 때 값을 설정하는 것을 초기화 문장이라 부른다.
  //
  int bright ;  //밝기
  int contrast = 50;//명암
  int widthRes ;//해상도 너비
  int heightRes = 1080;//해상도 높이
  
  Monitor6() { //생성자 
    this.bright = 50 ;
    this.contrast = 70;
    this.widthRes = 2560;
    this.heightRes = 1200;
  }
  public void on() {
     System.out.println("화면을 출력한다.");
  }
}
public class Test08{
  public static void main(String[] args) {
    //인스턴스 생성
//    new Monitor6; //컴파일 오류!
    new Monitor6();
//    new Monitor6(100); // 컴파일 오류!
  }

}