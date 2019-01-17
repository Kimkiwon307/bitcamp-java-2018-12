package ch12.a;

public class Calculator {
  
  int result ;
  
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
