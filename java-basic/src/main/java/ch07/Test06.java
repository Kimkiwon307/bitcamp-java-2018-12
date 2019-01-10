// 가비지와 가비지 걸렉터 그리고 레퍼런스 카운트

package ch07;
public class Test06{

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
      Score s2 = new Score();
      s2 = s1;
      s1 = new Score();
      
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