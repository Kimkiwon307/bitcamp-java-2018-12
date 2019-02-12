//URL 요청하기  - URLCOnnection 사용 / 포스트요청할때사용 포스트는 아직 안배움 : 게시판에 글등록할떄 쓰는거 그런데 어차피 아파치 쓸듯 

package ch23.h;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test05 {

  public static void main(String[] args) throws Exception {

    URL url =  new URL("https://www.naver.com/");
    
    //URL 정보를 가지고 HTTP 요청을 수행할 객체를 얻는다
    URLConnection con = url.openConnection();
   
    //웹서버와 연결한다
    con.connect();
    
    //웹 서버의 응답 데이터를 읽어드릴 도구를 준비한다
    InputStream in = con.getInputStream();
    
    //서버가 보낸 데이터를 한 줄씩 읽기 위해 데코레이터를 붙인다.
    BufferedReader in2 = new BufferedReader(new InputStreamReader(in));

    while(true) {
      String str = in2.readLine();
      if(str == null)
        break;
      System.out.println( str);
    }
    in2.close();
    in.close();

  }

}
