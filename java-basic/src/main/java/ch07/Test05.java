// 레퍼런스와 인스턴스의 관계

package ch07;
public class Test05{

  static class Score {
    String name; 
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {
    Score s1 = new Score();
  
    // 인스턴스 필드
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    
    Score s2 = s1;
    
    System.out.println(s2.name);
    s1.name = "임꺽정";
    System.out.println(s2.name);
      //메서드가 생성한 인스턴의 주소를 받을수잇
    Score s3 = createScore("유관순", 90, 90 , 90);
    System.out.println(s3.name);
    System.out.println(s3.kor);
    
  }
  static Score createScore(String name, int kor, int eng, int math){
    Score s = new Score();
    s.name = name;
    s.kor = kor;
    s.eng = eng;
    s.math = math;
    s.sum= kor + eng + math;
    s.aver = s.sum /3f;
    return s;
  }
}