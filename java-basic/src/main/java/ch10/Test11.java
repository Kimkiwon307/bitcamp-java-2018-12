//  생성자 - 여러개의 생성자
package ch10;
class Monitor9{

  int bright ;  //밝기
  int contrast = 50;//명암
  int widthRes ;//해상도 너비
  int heightRes = 1080;//해상도 높이

  //
  Monitor9(int bright, int contrast){
    this.bright = bright;
    this.contrast = contrast;
    System.out.println("모니터9 인트값 2개 받는 생성자");
  }
  Monitor9() { //생성자 
    this.bright = 50 ;
    this.contrast = 70;
    this.widthRes = 2560;
    this.heightRes = 1200;
    System.out.println("모니터9기본생성자");
  }
  Monitor9(int bright, int contrast, int widthRes, int heightRes){
    this.bright = bright;
    this.contrast = contrast;
    this.widthRes =widthRes;
    this.heightRes = heightRes;
    System.out.println("모니터9 인트값 4개 받는 생성자");
  }

  public void on() {
    System.out.println("화면을 출력한다.");
  }
}
public class Test11{
  public static void main(String[] args) {

    //    new Monitor8(); 기본 생성자가 없는경우      

    new Monitor9();
    new Monitor9(50,50);
    new Monitor9(50, 50, 1920, 1080);
    
//    new Monitor9(50); 컴파일 오류
  }

}