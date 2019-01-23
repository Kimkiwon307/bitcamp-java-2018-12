package ch18.e;

public class BallPen153 extends Monami implements Pen{
  @Override
  public void write(String contents) {
    
    if (!this.use)
      return;
    System.out.println("모나미>> " + contents);

}
}