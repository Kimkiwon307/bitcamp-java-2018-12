package design_pattern.observer.after2;

// 자동차의 상태가 바뀌었을 때 호출할 메서드 규칙을 정의한다.
public class SunRoofCloseCarObserver extends AbstractCarObserver {



  @Override
  public void carStopped() {
 
    //예  5월 5일 - 자동차 시동을 끌 때 썬루프 자동 닫기 기능을 추가
    System.out.println("썬루프를 닫는다.");
  }

}
