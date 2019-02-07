package ch22.e;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test01_1 {

  public static void main(String[] args) {
   
    Score s1 = new Score("홍길동", 100, 100, 100); //2바이트 utf16을 3바이트 utf 8으로 바꾼다. 첫번째 2바이트 9바이트=홍길동 4바이트 = 100 , 4바이트 = 100, 4바이트=100 
    Score s2 = new Score("임꺽정", 90, 90, 90);
    Score s3 = new Score("유관순", 80, 80, 80);
    

    try (// 오토클로저블 구현안된 객체는 못쓴다. ex) String k1 
        DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("score.data")))) { //실무

      //계산된 값은 저장하지 않는다. 
     
      out2.writeUTF(s1.getName());
      out2.writeInt(s1.getKor());
      out2.writeInt(s1.getEng());
      out2.writeInt(s1.getMath());

      out2.writeUTF(s2.getName());
      out2.writeInt(s2.getKor());
      out2.writeInt(s2.getEng());
      out2.writeInt(s2.getMath());

      out2.writeUTF(s3.getName());
      out2.writeInt(s3.getKor());
      out2.writeInt(s3.getEng());
      out2.writeInt(s3.getMath());

      out2.flush(); //버퍼를 쓸떄는 항상 써준다.

    } catch (Exception e) {

      e.printStackTrace();
    }
    System.out.println("출력 완료!");
  }







}


