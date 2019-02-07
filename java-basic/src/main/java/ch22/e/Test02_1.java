// 인스턴스 출력 = 배열활용하기
package ch22.e;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test02_1 {

  public static void main(String[] args) {

    Score[]  students = {
        new Score("홍길동", 100, 100, 100), //2바이트 utf16을 3바이트 utf 8으로 바꾼다. 첫번째 2바이트 9바이트=홍길동 4바이트 = 100 , 4바이트 = 100, 4바이트=100 
        new Score("임꺽정", 90, 90, 90),
        new Score("유관순", 80, 80, 80)
    };


    try (// 오토클로저블 구현안된 객체는 못쓴다. ex) String k1 
        DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("score.data")))) { //실무

      //계산된 값은 저장하지 않는다. 서
      out2.writeInt(students.length); // 먼저 4바이트를 읽어

      for(Score s : students) {  //배열 전체를 반복하려면 쓰는게 좋다
        out2.writeUTF(s.getName());
        out2.writeInt(s.getKor());
        out2.writeInt(s.getEng());
        out2.writeInt(s.getMath());
      }


      out2.flush(); //버퍼를 쓸떄는 항상 써준다.

    } catch (Exception e) {

      e.printStackTrace();
    }
    System.out.println("출력 완료!");
  }







}


