package ch12.c.other;

import ch12.c.My;

public class Test02 {

  public static void main(String[] args) {

    My obj1 = new My();
    //private 접근 불가!
    // obj1.v1 = 100; // 컴파일 오류! 프라이비트
    
    //  obj1.v2 = 100; // 컴오 디펄트
    
    //  obj1.v3 = 100; 컴오 프로텍티드
    
    obj1.v4 = 100;
    
    
  }

}
