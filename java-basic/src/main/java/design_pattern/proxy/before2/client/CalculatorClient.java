package design_pattern.proxy.before2.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class CalculatorClient {
  
  public int compute(int a, int b, String op) throws Exception {
    try (Socket s = new Socket("localhost",8888);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream())
        ){

      out.writeInt(a);
      out.writeInt(b);
      out.writeUTF(op);

      if(in.readUTF().equalsIgnoreCase("OK")) {
        return in.readInt();
      }else {
        throw new RuntimeException(in.readUTF());
      }
    }
  }

}
