//문자 데이터 출력하기
package ch22.d;

import java.io.FileWriter;

public class Test01_1 {
  
  public static void main(String[] args) {
    
    //FileWriter
    // => 문자 단위로 데이터를 출력하는 일을 한다.
    //
    try(FileWriter out = new FileWriter("data.txt")){
        out.write('A');
        out.write('B');
        out.write('C');
        out.write('가');
        out.write('각');
        out.write('간');
        
    }catch (Exception e) {
      e.printStackTrace();
    }
System.out.println("출력완료");  
  }
}
