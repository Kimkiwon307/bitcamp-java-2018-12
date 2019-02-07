
// Serialize - trainsient 필드
package ch22.g;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test3_1 {

  public static void main(String[] args) {

    try(ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("Score3.data"))) {
      Score3 score =new Score3();
      score.setName("홍길동");
      score.setKor(100);  //setter 내부에서 compute()를 호출하여 sum과 aver를 자동계산
      score.setEng(100); 
      score.setMath(100);       
        
      out.writeObject(score);
      System.out.println("출력완료");
    }catch (Exception e) {
      e.printStackTrace();
    }

  }
}