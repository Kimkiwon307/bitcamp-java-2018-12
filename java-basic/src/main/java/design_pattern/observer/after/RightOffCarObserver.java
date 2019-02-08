package design_pattern.observer.after;

// 자동차의 상태가 바뀌었을 때 호출할 메서드 규칙을 정의한다.
public class RightOffCarObserver implements CarObserver {

  @Override
  public void carStarted() {
  }

  @Override
  public void carStopped() {
 
    //예  4월 15일 - 자동차 시동을 끌 때 전조등 자동 끄기 기능을 추가
    System.out.println("전조등을 끕니다.");
  }

}
