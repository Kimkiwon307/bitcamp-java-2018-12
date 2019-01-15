//  생성자 - 생성자와 this
package ch10;
class Monitor10{

  int bright ;  //밝기
  int contrast = 50;//명암
  int widthRes ;//해상도 너비
  int heightRes = 1080;//해상도 높이

  //
  Monitor10(int bright, int contrast){
      this(bright, contrast, 0,0);
    System.out.println("모니터9 인트값 2개 받는 생성자");
  }
  Monitor10() { //생성자 
    // 다른 생성자를 호출 할 수 있다.
    
    this(50,50,2560,1200);
    System.out.println("모니터9기본생성자");
  }
  Monitor10(int bright, int contrast, int widthRes, int heightRes){
    this.bright = bright;
    this.contrast = contrast;
    this.widthRes =widthRes;
    this.heightRes = heightRes;
    System.out.println("모니터9 인트값 4개 받는 생성자");
  }

  public void on() {
    //주의! : 일반 메서드는 생성자 호출불가
//    this(); 컴파일오류
  }
}
public class Test12{
  public static void main(String[] args) {

    //    new Monitor8(); 기본 생성자가 없는경우      

    new Monitor10();
    System.out.println("---------------------------");
    new Monitor10(50,50);
    System.out.println("---------------------------");
    new Monitor10(50, 50, 1920, 1080);
    System.out.println("---------------------------");
    
    Monitor10 obj1 = new Monitor10();
//    obj1.Monitor10();
//    new Monitor9(50); 컴파일 오류
  }

}