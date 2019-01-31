package ch22.c;

import java.io.FileInputStream;

public class Test01_1 {

  public static void main(String[]args) {

    // 파일의 바이너리 데이타 읽기!!!!!!!!!!
    // => FileInputStream 클래스를 사용한다.
    try {
      // 1) 데이터 읽기를  담당할 객체를 생성한다
      FileInputStream in = new FileInputStream("jls11.pdf");
      long start = System.currentTimeMillis();
      int b;
      int count = 0;
      while((b=in.read())!=-1) {
        if (++count % 1000 == 0)
          System.out.print(".");

        if(count % 20000 == 0) {
          System.out.println();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        }

      }
      System.out.println();
      in.close();
    }catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("출력완료");

  }
}
