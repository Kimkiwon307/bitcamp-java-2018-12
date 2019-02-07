package ch22.g;
 
import java.io.Serializable;

public class Score3 implements Serializable{
  
  private static final long serialVersionUID = 100L;
  
  private String name;
  private String tel;
  private  int kor;
  private  int eng;
  private  int math;
  transient private int sum;
  private transient float aver;

  public Score3() {
    System.out.println("Score3()");
  }
  public Score3(String name, int kor, int eng, int math) {
    this.name =name;
    this.kor =kor;
    this.eng=eng;
    this.math =math;
  }
 
 
  @Override
  public String toString() {
    return "Score3 [name=" + name + ", tel=" + tel + ", kor=" + kor + ", eng=" + eng + ", math="
        + math + ", sum=" + sum + ", aver=" + aver + "]";
  }
  
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    System.out.println("set.name");
    this.name = name;
  }
  public int getKor() {
    return kor;
  }
  public void setKor(int kor) {
    System.out.println("set.name");
    this.kor = kor;
    this.compute();
  }
  public int getEng() {
    return eng;
  }
  public void setEng(int eng) {
    System.out.println("set.name");
    this.eng = eng;
    this.compute();
  }
  public int getMath() {
    
    return math;

  }
  public void setMath(int math) {
    System.out.println("set.name");
    this.math = math;
    this.compute();
  }
  public int getSum() {
    return sum;
  }
  public float getAver() {
    return aver;
  }
  public void compute() {
    this.sum = this.kor + this.eng + this.math ;
    this.aver = this.sum / 3f;
  }
}
