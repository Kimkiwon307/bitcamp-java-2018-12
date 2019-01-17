package ch13.a;

// 계산 결과에 영향을 미치는 필드에도 getter/setter를 적용한다
public class Score2 {
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int music;
  private int art;


  private int sum;
  private float aver;

  public int getKor() {
    return this.kor;
  }
  public void setKor(int kor) {
    if(kor >= 0 && kor <= 100)
      this.kor = kor;
    this.compute();
  }
  public int getEng() {
    return this.eng;
  }
  public void setEng(int eng) {
    if(eng >= 0 && eng <= 100)
      this.eng = eng;
    this.compute();
  }
  public int getMath() {
    return this.math;
  }
  public void setMath(int math) {
    if(math >= 0 && math <= 100)
      this.math = math;
    this.compute();
  }
  public int getArt() {
    return this.art;
  }
  public void setArt(int art) {
    if(art >= 0 && art <= 100)
      this.art = art;
    this.compute();
  }
  public int getMusic() {
    return this.music;
  }
  public void setMusic(int music) {
    if(music >= 0 && music <= 100)
      this.music = music;
    this.compute();
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  

  public int getSum() {
    return this.sum;
  }
  public float getAverage() {
    return this.aver;
  }

  private void compute() {
    this.sum = this.kor + this.eng + this.math + this.music + this.art;
    this.aver = this.sum / 5f;
  }
}
