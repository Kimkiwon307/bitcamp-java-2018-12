package ch22.c;

import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStream extends InputStream{

  InputStream in;
  byte[] buf = new byte[1024];
  int size = 0;
  int cursor = 0;
  
  public BufferedInputStream(InputStream in) {
    this.in  = in;
  }
  
  @Override
  public int read() throws IOException {
    if(cursor >= size) {
      size = in.read(buf);
      if(size == -1)
        return -1;
      cursor = 0;
    }

    // 바이트의 값을 온전히 4바이트 int 값으로 변환하기 위해
    // 0x000000ff 값을 & 비트연산 한다
    // => 0xff 상수 값은 0x000000ff를 의미한다.
    return buf[cursor++] & 0xff;
  }
}
