package ch22.b;

import java.io.FileInputStream;

public class Test02_2 {

  public static void main(String[]args) {

    // 파일의 바이너리 데이타를 읽어 배열에 저장한다!!!!!!!!!!
    try {
      FileInputStream in = new FileInputStream("data.bin");
      byte[] buf = new byte[1024];
      
        //바이너리 데이터를 읽어 배열에 저장하기
      int count = in.read(buf);

        for(int i =0;  i< count; i++) {
        System.out.print(Integer.toHexString(buf[i])+ " ");
      }
      System.out.println();
      in.close();
    }catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("출력완료");

  }
}
