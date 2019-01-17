// 캡슐화 (encapsulation) 적용 - 사례2

package ch12.b;

public class Test02 {

  public static void main(String[] args) {
    //의도
    Score s1 = new Score();
    s1.name="홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.compute();
    System.out.printf("총점=%d, 평균=%.1f\n",s1.getSum(), s1.getAverage());

    //의도 x
    Score s2 = new Score();
    s2.name="꺽정임";
    s2.kor = 80;
    s2.eng = 70;
    s2.math = 80;
    s2.compute();
//    s2.aver = 95.5f; //마두닥
    System.out.printf("총점=%d, 평균=%.1f\n",s2.getSum(), s2.getAverage());

  }

}
