package ch22.c;

import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStream extends OutputStream{

  OutputStream out;
  byte[] buf =new byte[1024];
  int size = 0;

  public BufferedOutputStream(OutputStream out) {
    this.out = out;
  }
  
  @Override
  public void write(int b) throws IOException {

    buf[size++] = (byte)b;

    if(size >= 1024) {
      out.write(buf); //버퍼가 꽉 차면 파일로 내보낸다.
      size = 0; // 다시 버퍼를 쓸 수 있도록 size를 0으로 초기화 한다.
    }
  }
  // 버퍼에 남아있는 데이터를 출력할 떄 호출한다.
  @Override
  public void flush() throws IOException {
    if(size > 0) {
      out.write(buf,0, size);
    }
  }
}
