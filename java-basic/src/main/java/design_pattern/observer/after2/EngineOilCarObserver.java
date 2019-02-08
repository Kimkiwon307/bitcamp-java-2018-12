package design_pattern.observer.after2;

// 자동차의 상태가 바뀌었을 때 호출할 메서드 규칙을 정의한다.
public class EngineOilCarObserver extends AbstractCarObserver {

  @Override
  public void carStarted() {
    //예  2월 30일 - 자동차 시동을 걸 때 엔진 오일 유무를 검사하는 기능을 추가
    System.out.println("엔진 오일 유무 검사");
  }

  

}
