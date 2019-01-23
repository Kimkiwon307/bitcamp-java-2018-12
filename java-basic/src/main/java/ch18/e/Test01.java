package ch18.e;

public class Test01 {

  public static void main(String[] args) {
    
    // 펜사용 규칙에 따라 만든도구
    BallPen153 t1 = new BallPen153();
    MultiPen t2 = new  MultiPen();
    
    Canvas c1 = new Canvas(t1);
    
    t1.press(true);
    c1.render("오호라");
    
    c1.setPen(t2);
    
    t2.rotate(Zebra.ON);
    c1.render("이히라");
  }

}
