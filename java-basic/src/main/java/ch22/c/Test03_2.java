//프리머티브 데이타 타입 값을 도와주는거
package ch22.c;

import java.io.FileOutputStream;

public class Test03_2 {

  public static void main(String[]args) {


    try(  FileOutputStream out = new FileOutputStream("data.bin");
        DataOutputStream out2 = new DataOutputStream(out)) {

      int no =100;
      String name = "ABC가각간";
      int age = 20;

      out2.writeInt(no);
      out2.writeUTF(name);
      out2.writeInt(age);

    }catch (Exception e) {
      e.printStackTrace();
    }
  }
}