package design_pattern.observer.after2;


//CarObserver를 직접 구현하면 
//CarObserver에 선언된 모든 메서드를 구현해야 한다.
//관심이 없는 메서드도 구현해야한다.
//이런 불편함을 줄이기 위해 다음과 같이 추상클래스를 적용한
public class AbstractCarObserver implements CarObserver{

  @Override
  public void carStarted() {
    
  }

  @Override
  public void carStopped() {
    
  }

}
