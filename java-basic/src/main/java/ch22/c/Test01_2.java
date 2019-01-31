package ch22.c;

import java.io.FileInputStream;

public class Test01_2 {

  public static void main(String[]args) {

    // 파일의 바이너리 데이타 읽기!!!!!!!!!!
    // => FileInputStream 클래스를 사용한다.
    try {
      // 1) 데이터 읽기를  담당할 객체를 생성한다
      
      FileInputStream in = new FileInputStream("jls11.pdf");
      System.out.println("데이타 읽는중");
      long start = System.currentTimeMillis();
      byte[] buf = new byte[3000000];
      int len = 0;
      int count = 0;
      while((len=in.read(buf))!=-1) {
        if (++count % 1000 == 0)
          System.out.print(".");

        if(count % 20000 == 0) {
          System.out.println();
      }
      }long end = System.currentTimeMillis();
        System.out.println(end - start);

      in.close();
    }catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("출력완료");

  }
}
