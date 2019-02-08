// 데이터 주고 받기 -파일 받는 서버 만들기
package ch23.b;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {

  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {

      System.out.println("클라이언트의 연결을 기다리고 있음.");

      try (
          Socket socket = serverSocket.accept();
          PrintWriter out = new PrintWriter(socket.getOutputStream());
          DataInputStream in = new DataInputStream(
              new BufferedInputStream(socket.getInputStream()))){

        System.out.println("클라이언트가 연결되었음.");

        long fileLen = in.readLong();
        System.out.printf("보내는 파일의 크기: %d byte\n", fileLen);


        String filename = in.readUTF();
        System.out.printf("보내는 파일의 이름: %s\n", filename);


        File file = new File("temp/download/" + filename);

        try(BufferedOutputStream fileout = new BufferedOutputStream(
            new FileOutputStream(file))){

          System.out.println("파일을 받는중");

          for(long i = 0; i < fileLen; i++) {
            fileout.write(in.read());
          }
          fileout.flush();
          System.out.println("다운로드완료");
         
          out.println("성공");
          out.flush();

        }catch(Exception e){
          out.println("실패");
          out.flush();
        }
        System.out.println("클라인트에게 응답햇음.");
      } 
      System.out.println("클라이언트와의 연결을 끊었음.");

    } catch (Exception e) {

      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }

}
