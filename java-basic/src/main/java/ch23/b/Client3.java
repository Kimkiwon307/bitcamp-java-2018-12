// 데이터 주고 받기 - 파일 보내 클라이언트 만들기
package ch23.b;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {

  public static void main(String[] args) throws Exception{

    try (Socket socket = new Socket("localhost", 8888);
       BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
        Scanner in =new Scanner(socket.getInputStream());
        FileInputStream FileIn = new FileInputStream("temp/2dae9.mp4")){   

      System.out.println("서버와 연결 되었습니다.");

      out.
      out.flush(); //스트림 객체의 내부 버퍼에 출력된 내용을 네트워크로 방출시킨다.
      System.out.println("서버에 데이터를 보냇음!");

      String response = in.nextLine();
      System.out.println(response);

    }catch (Exception e) {
      e.printStackTrace();
    }





  }

}
