// 로컬 변수와 인스턴스 필드의 초기

package ch07;

import ch07.Test03.Score;

public class Test07{
  public static void main(String[] args) {
    //로컬 변수는 자동으로 초기화 되지않는다.
    //초기화하지 않은 로컬 변수는 사용할 수 없다.
    //초기화? 값을 한 번이라도 저장하는 것!
    String nmae;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    
    // 컴파일오류 System.out.println(name);
      Score s = new Score();
      System.out.println(s.name);
      System.out.println(s.kor);
      System.out.println(s.aver);
  
  }
}