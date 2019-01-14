//  인스턴스 필드의 초기화 - 필드 초기화 절차
package ch10;
class Monitor5{
  //초기화 문장?
  //변수를 선언할 때 값을 설정하는 것을 초기화 문장이라 부른다.
  //
  int bright ;  //밝기
  int contrast = 50;//명암
  int widthRes ;//해상도 너비
  int heightRes = 1080;//해상도 높이
  {//인스턴스 블록
    this.bright = 50;
    this.contrast = 60;
    this.widthRes = 1920;
  }
  
  Monitor5() { //생성자 
    this.contrast = 70;
    this.widthRes = 2560;
    this.heightRes = 1200;
  }
  
  void display() {
    System.out.println("--------------------------------------");
    System.out.printf("밝기(%d)\n", this.bright);
    System.out.printf("명암(%d)\n", this.contrast);
    System.out.printf("해상도(%d x %d)\n", this.widthRes,this.heightRes);
    System.out.println("--------------------------------------");
  }
}
public class Test07{
  public static void main(String[] args) {
   // 모니터 인스턴스 생성
    Monitor5 m1 = new Monitor5();
 // 인스턴스 필드 초기화 절차
    //  bright | contrast | withREs | heightRes|
    //     0     |       0    |     0    |     0      | 
    //      
    
  
    m1.display(); 
  
  }

}