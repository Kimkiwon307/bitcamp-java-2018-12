
package ch22.f;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test3_2 {

  public static void main(String[] args) {

    try(ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("Score3.data"))){
      Score3 score = (Score3)in.readObject();
      System.out.println(score);

      //Score3 클래스를 바꾼 후에도 기존에 serialize 된 데이터를 
      //  그대로 읽을 수 있다.
      // 왜? serialVersionUID가 같기 때문이다.
      // 이런 이유로 개발자가 serialVersionUID 변수의 값을 설정하는 것이다.
      // 물론 기존 클래스와 비교해 완전히 바뀌어서 
      // 기존에 serialize 된 값을 정상적으로 읽을수 없을 경우에는
      // serialVersionUID 값을 같게 하는 것은 좋지않다.
      // 지금처럼 이전 클래스와 비교해 큰 변경이 없을 경우에만 이 변수의 값을 그대로 유지하는 것이다.
    }catch(Exception e) {
      e.printStackTrace();
    }

  }
}