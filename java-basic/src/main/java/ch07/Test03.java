// 클래스 사용 
package ch07;
public class Test03{

  static class Score {
    String name; //설계 도면이기 때문에 변수가 존재하는 상태가 아니다.
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  // 설계 도면 대로 변수를 준비한다.

  public static void main(String[] args) {
    // 학생의 성적 데이터를 담을 새로운 구조의 메모리를 정의한다.
    Score s1; 
    s1 = new Score();
    Score s2 = new Score();

    // 새 데이터 타입에 따라 만든 메모리 = score클래스의 인스턴스
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;

    // 메서드에 새 데이터 타입으로 만든 메모리의 주소를 전달한다.
    // => 값이 아니라 메모리의 주소를 전달한다. "call by reference"
    printScore(s1);
    printScore(s2);
  }

  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %f\n", s.name, s.kor, s.eng, s.math ,s.sum, s.aver);
  }
}