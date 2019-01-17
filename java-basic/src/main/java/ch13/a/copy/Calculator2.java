package ch13.a.copy;

public class Calculator2 {

  private int result ;

  //리턴 메서드 필요 getter
  public int getResult() {
    return this.result;
  }

  public void plus (int value) {
    this.result += value;

  }
  public void minus (int value) {
    this.result  -= value;
  }
 
  //기능 추가

  public void multiple(int value) {
    this.result *= value;
  }
  public void divide(int value) {
    this.result /= value;
  }

}
