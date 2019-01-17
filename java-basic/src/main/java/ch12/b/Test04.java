// getter/setter를 적용하면 좋은 이유

package ch12.b;

public class Test04 {

  public static void main(String[] args) {
    //
    Score2 s1 = new Score2();
    
    s1.setName("홍길동");
    s1.setKor(100);
    s1.setEng(90);
    s1.setMath(80);
    
    System.out.printf("%s : 총점=%d, 평균=%.1f\n", s1.getName(),s1.getSum(), s1.getAverage());
    
    //이유1
    s1.setKor(70);
    System.out.printf("총점=%d, 평균=%.1f\n",s1.getSum(), s1.getAverage());
 
    //이유2
    s1.setEng(-300);
    System.out.printf("총점=%d, 평균=%.1f\n",s1.getSum(), s1.getAverage());  
  }
}
