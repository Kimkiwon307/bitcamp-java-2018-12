package ch23.i;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Test01 {

  public static void main(String[] args) throws Exception{
    String str = "ABC012가각간";

    byte[] bytes = str.getBytes("UTF-8");
    
    // Base64 인코딩
     // => 바이너리 데이터를 문자화시킨다.
     // => 바이너리 값을 6비트식 잘라서(2의 6승) 64진수으로 만든 후

    Encoder encoder = Base64.getEncoder();
    byte[] base64Bytes = encoder.encode(bytes);

    System.out.println(new String(base64Bytes));
  //Base64 디코딩
  // => Base64 코드를 원래의 바이너리 값으로 변환한다.
   Decoder decoder = Base64.getDecoder();
    byte[] bytes2 =decoder.decode(base64Bytes);
    System.out.println(new String(bytes2,"UTF-8"));

  }

}
