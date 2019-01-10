// 클래스, 레퍼런스, 인스턴스

package ch07;
public class Test04{

  static class Score {
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {
    // 메모리의 주소를 담는 변수
    Score s1; 
    
    // 인스턴스
    s1 = new Score();
    Score s2 = new Score();
    
    // 인스턴스 필드
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;

    printScore(s1);
    printScore(s2);
  }

  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %f\n", s.name, s.kor, s.eng, s.math ,s.sum, s.aver);
  }
}