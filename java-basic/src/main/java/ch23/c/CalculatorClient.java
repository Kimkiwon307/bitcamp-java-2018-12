// 계산기 클라이언트 만들기
package ch23.c;

import java.io.DataOutputStream;

import java.io.IOException;

import java.io.OutputStream;

import java.net.Socket;

import java.net.UnknownHostException;

import java.util.Scanner;

 

public class CalculatorClient {

	@SuppressWarnings({"unused", "resource", "unlikely-arg-type"})

	public static void main (String []args) throws UnknownHostException, IOException {

		Scanner keyboard = new Scanner(System.in);
		Socket socket = new Socket("localhost",8888);
		
		System.out.println("서버와 연결되었음!");

		OutputStream out2 = socket.getOutputStream();
		DataOutputStream out = new DataOutputStream(out2);

		Scanner in = new Scanner(System.in);
		String a = "";
		while(true) {
			System.out.print(">");
			
			if(in.equals(null)) {
			    out.writeUTF(a);
			    break;
			}
		
			int no1 = Integer.parseInt(in.next());
			String op = in.next();
			int no2 = Integer.parseInt(in.next());
			
			out.write(no1);
			out.writeUTF(op);
			out.write(no2);
			out.flush();
			
		}
	}

}