
// Serialize - Serializable 설명ㄴ
package ch22.f;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_1 {

  public static void main(String[] args) {
    try(ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("Score1.data"))) {

      // 인스턴스 출력하기
      // writeObject(인스턴스의 주소)
      // => 모든 인스턴스 필드를 바이트 배열로 만들어 출력한다.
      //   바이트 배열로 만드는 것을"직렬화(Serialize)"라 부른다.
      //   반대로 바이트 배열을 가지고 인스턴스를 만드는 것을 "객체화(deserialize=unmarshaling)"라 부른다.
      // => 단 serialize를 허락한 객체에 한 해서만 작업한다.
     //   (java.io.Serializable 인터페이스의 구현체에 대해서만 작업 가능)
      // => 만약 허락되지 않은 객체에 대해 이 메서드를 호출하면
      //   NotSerializationException 예외가 발생한다
      out.writeObject(new Score1("홍길동", 100, 100, 100));
      // Score1 클래스는 java.io.Serializable 을 구현하지 않았기 때문에
      //  writeObject()를 사용할수 읎다.
    }catch (Exception e) {
      e.printStackTrace();
    }

  }
}