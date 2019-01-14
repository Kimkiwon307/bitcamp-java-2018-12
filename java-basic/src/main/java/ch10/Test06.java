//  인스턴스 필드의 초기화 - 초기화 문장을 통해 필드에 기본 값을 미리 저장한다.
package ch10;
class Monitor4{
  //초기화 문장?
  //변수를 선언할 때 값을 설정하는 것을 초기화 문장이라 부른다.
  //
  int bright ;  //밝기
  int contrast ;//명암
  int widthRes ;//해상도 너비
  int heightRes;//해상도 높이
  
  Monitor4() { //생성자 
    this.bright = 50;
    this.contrast = 50;
    this.widthRes = 1920;
    this.heightRes = 1080;
  }
  
  void display() {
    System.out.println("--------------------------------------");
    System.out.printf("밝기(%d)\n", this.bright);
    System.out.printf("명암(%d)\n", this.contrast);
    System.out.printf("해상도(%d x %d)\n", this.widthRes,this.heightRes);
    System.out.println("--------------------------------------");
  }
}
public class Test06{
  public static void main(String[] args) {
   // 모니터 인스턴스 생성
    Monitor4 m1 = new Monitor4();
    
  
    m1.display(); 
    
    // 물론 특정 속성의 값을 바꾼 후에 사용해도 된다.
    
    m1.bright = 40;
    m1.contrast = 40;
    m1.widthRes = 1920;
    m1.heightRes = 1080;
    
    m1.display();
    
   
  }

}