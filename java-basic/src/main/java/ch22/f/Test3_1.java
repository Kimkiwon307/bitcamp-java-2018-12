
// Serialize -serialVersionUID 스태틱 필드 사용하기
package ch22.f;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test3_1 {

  public static void main(String[] args) {
    
    try(ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("Score3.data"))) {
      out.writeObject(new Score3("홍길동", 100, 100, 100));
      System.out.println("출력완료");
 
    }catch (Exception e) {
      e.printStackTrace();
    }

  }
}