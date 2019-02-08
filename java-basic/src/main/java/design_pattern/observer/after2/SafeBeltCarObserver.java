package design_pattern.observer.after2;

public class SafeBeltCarObserver extends AbstractCarObserver {

  @Override
  public void carStarted() {
    //예) 1월 20일에  -자동차 시동을 걸 때 안전 벨트 착용 여부를 검사하는 기능을 추가
    System.out.println("안전벨트 착용 여부 검사");
  }

 

}
