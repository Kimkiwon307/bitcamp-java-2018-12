
//인스턴스 배열?

package ch07;
public class Test08{

static class Score {
 String name; 
 int kor;
 int eng;
 int math;
 int sum;
 float aver;
}
public static void main(String[] args) {
 
 int v1, v2, v3;
 
 int[] values = new int[3];
 
 Score s1, s2, s3;
 
 Score[] scores = new Score[3];
 
// System.out.println(scores[0].name);// 실행 오류! (runtime exception 발생)
 scores[0] = new Score();
 scores[1] = new Score();
 scores[2] = new Score();
 System.out.println(scores[0].name);//기본적으로 다 0이다
 System.out.println(scores[0].kor);
}

}