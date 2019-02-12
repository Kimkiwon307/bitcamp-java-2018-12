//URL 다루기 - 문서 내부의 특정 위치를 가리키기

package ch23.h;

import java.net.URL;

public class Test02 {

  public static void main(String[] args) throws Exception {
    // 웹에서 자원의 위치를 표현하는 방법
    // => [프로토콜]: // 서버주소:포트번호/자원의경로
    // => 프로토콜  : http,https
    // => 서버주소 : IP 주소(192.168.0.20), 서버도메인주소(예: www.bitcamp.net)
    // => 포트번호 : 80(생략가능하다) , 8080(프록시 서버) 등
    // => 자원의 경로 : /index.html, /board/list.do 등
    
    // 자바에서 URL을 저장하기
    URL url =  new URL("http://www.bitcamp.co.kr:80/a/b/c/index.html#side");
                                                                   //#이후는 내부위치
    System.out.printf("프로토콜: %s\n", url.getProtocol());
    System.out.printf("서버주소: %s\n", url.getHost());
    System.out.printf("포트번호: %s\n", url.getPort());
    System.out.printf("자원경로: %s\n", url.getPath());
    System.out.printf("내부위치: %s\n", url.getRef());
  }

}
