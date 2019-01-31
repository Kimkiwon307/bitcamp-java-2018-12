package ch22.b;

import java.io.FileInputStream;

public class Test03_2 {

  public static void main(String[]args) {

    // 파일의 바이너리 데이타를 읽어 배열에 저장한다!!!!!!!!!!
    try {
      FileInputStream in = new FileInputStream("data.bin");
      byte[] buf = new byte[1024];
      
        //바이너리 데이터를 읽어 배열에 저장하기
      int count = in.read(buf, 5, 6);

        for(int i =0;  i< 10; i++) {
        System.out.print(Integer.toHexString(buf[i])+ " ");
        }
      System.out.println();
      System.out.println(count);
      in.close();
    }catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("출력완료");

  }
}
