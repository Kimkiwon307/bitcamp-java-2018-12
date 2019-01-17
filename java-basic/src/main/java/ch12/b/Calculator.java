package ch12.b;

public class Calculator {

  // 외부의 접근을 막아야 하는 멤버에 대해서는 private - modifier를 붙인다.
  
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

  public void multiple(int value) {
    this.result *= value;
  }
  public void divide(int value) {
    this.result /= value;
  }
}
