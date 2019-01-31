package ch22.b;

import java.io.FileOutputStream;

public class Test01_1 {

  public static void main(String[]args) {

    // 파일로 바이너리 데이타 출력!!!!!!!!!!
    // => FileOutputStream 클래스를 사용한다.
    try {
      // 1) 데이터를 출력을 담당할 객체를 생성한다
      FileOutputStream out = new FileOutputStream("data.bin");
      // 2) 데이터를 출력한다.
      out.write(2);
      out.write(40);
       out.write(100);
       out.write(101);
       out.write(102);
       out.write(121);
       out.write(127111);
       out.write(0x11223344);
       out.write(0x55667788); 
       out.close();
    }catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("출력완료");







  }

}
