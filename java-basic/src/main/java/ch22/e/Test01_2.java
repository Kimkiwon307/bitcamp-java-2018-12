package ch22.e;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test01_2 {



  public static void main(String[] args) {

    try (FileInputStream in = new FileInputStream("score.data");
        BufferedInputStream in1 = new BufferedInputStream(in);
        DataInputStream in2 = new DataInputStream(in1)) {

      Score s1 = null;
      Score s2 = null;
      Score s3 = null;

      s1 = new Score(in2.readUTF(),in2.readInt(),in2.readInt(),in2.readInt());
      s2 = new Score(in2.readUTF(),in2.readInt(),in2.readInt(),in2.readInt());
      s3 = new Score(in2.readUTF(),in2.readInt(),in2.readInt(),in2.readInt());

      //출력한대로 읽어야한댜 =파일포맷
      System.out.printf("%s, %d, %d, %d, %d, %.1f\n",s1.getName(),s1.getKor(),s1.getEng(),s1.getMath(),s1.getSum(),s1.getAver());
      System.out.printf("%s, %d, %d, %d, %d, %.1f\n",s2.getName(),s2.getKor(),s2.getEng(),s2.getMath(),s2.getSum(),s2.getAver());
      System.out.printf("%s, %d, %d, %d, %d, %.1f\n",s3.getName(),s3.getKor(),s3.getEng(),s3.getMath(),s3.getSum(),s3.getAver());

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("읽기 완료!");

  }



}

