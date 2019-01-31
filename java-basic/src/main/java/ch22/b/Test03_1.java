package ch22.b;

import java.io.FileOutputStream;

public class Test03_1 {

  public static void main(String[]args) {

    // 배열 단위로 출력하기
    try {
      //주의!
      //=> 기존의 파일을 덮어쓴다.
      FileOutputStream out = new FileOutputStream("data.bin");
      
      byte[] bytes = {0x11,0x22,0x33,0x44,0x55,0x66};
     
      out.write(bytes, 2, 3); // 배열 일부만  출력한다.
      
      
      out.close();
    }catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("출력완료");

  }

}
