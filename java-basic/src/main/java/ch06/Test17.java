//JVM 아규먼트 응용 I

package ch06;

public class Test17{
  public static void main(String[] args) {
    // JVM 학생의 이름과 국영수 점수를 입력 받아 총점과 평균을 출력하
    // $ java -cp ./bin/main -Dname=홍길동 -Dkor=100 -Deng=100 -Dmath=90 ch06.Test15
    // 이름 : 홍길동
    // 총점 : 290
    // 평균 : 96.9
    
  String value1 = System.getProperty("name");
  int value2 = Integer.parseInt(System.getProperty("kor"));    
  int value3 = Integer.parseInt(System.getProperty("eng"));    
  int value4 = Integer.parseInt(System.getProperty("math"));    
  
  int sum = value2 + value3 + value4;
 
  
  System.out.printf("이름 : %s\n", value1);
  System.out.printf("총점 : %d\n",sum);
  System.out.printf("평균 : %.1f\n",sum/3f);
  
    
    
  }

}
