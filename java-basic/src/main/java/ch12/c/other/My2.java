package ch12.c.other;

import ch12.c.My;

public class My2 extends My {
  public void m1 () {
    My obj1 = new My();

    //private
    //   obj1.v1 = 100; 컴포아링오류
    //(default)
    //   obj1.v2 = 100; 컴오
    //
    //   obj1.v3 = 100; 컴오 

    obj1.v4 = 100000;

    //My2 가  상속받은 필드
    //     this.v1 = 100; 상속받아도 컴파일오류
    //     this.v2 = 100; 컴오
    this.v3 = 1000;
    this.v4 = 1000;
  }

}
