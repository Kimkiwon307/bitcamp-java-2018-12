package ch22.c;

import java.io.FileOutputStream;

public class Test02_1 {

  public static void main(String[]args) {

    FileOutputStream out = null;
    try {
      out = new FileOutputStream("data.bin");
      System.out.println("데이타 쓰는중...");

      long start = System.currentTimeMillis();

      for(int i = 0; i < 1000000; i++) {
        out.write(0x55);
      }
      long end = System.currentTimeMillis();
      System.out.println(end - start);

      System.out.println();
      
    }catch (Exception e) {
      e.printStackTrace();
    }finally {
      try {out.close();}catch(Exception e) {}
    }

    

  }
}
