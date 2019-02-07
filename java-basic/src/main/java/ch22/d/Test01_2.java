//문자 데이터 읽기
package ch22.d;

import java.io.FileReader;
import java.io.FileWriter;

public class Test01_2 {
  
  public static void main(String[] args) {
    
    //FileWriter
    // => 문자 단위로 데이터를 출력하는 일을 한다.
    //
    try(FileReader in = new FileReader("data.txt")){
         
        System.out.println(Integer.toHexString(in.read()));
        System.out.println(Integer.toHexString(in.read()));
        System.out.println(Integer.toHexString(in.read()));
        System.out.println(Integer.toHexString(in.read()));
        System.out.println(Integer.toHexString(in.read()));
        System.out.println(Integer.toHexString(in.read()));

    }catch (Exception e) {
      e.printStackTrace();
    }
System.out.println("출력완료");  
  }
}
