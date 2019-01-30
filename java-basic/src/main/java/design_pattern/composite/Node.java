package design_pattern.composite;

public abstract class Node {
  protected String title;

  public String getTitle() {
    return this.title;
  }
  public abstract void getFileInfor();//파일마다 정보가 다를수 있기 때ㅜㅁㄴ에
}
