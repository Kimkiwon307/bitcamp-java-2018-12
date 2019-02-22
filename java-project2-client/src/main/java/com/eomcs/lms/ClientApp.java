// 1단계 : 서버에게 요청을 보내고 서버의 응답을 출력하기
package com.eomcs.lms;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ClientApp {

	Scanner keyboard = new Scanner(System.in);
	Stack<String> commandHistory = new Stack<>();
	Queue<String> commandHistory2 = new LinkedList<>();
 
	public void service() throws Exception{
 
		while (true) {
			String input = prompt();
			int index = input.indexOf("/");
			String[] values = input.substring(0,index).split(":");
		   String host = values[0];
		   if(values.length > 1) {
			   port = Integer.parseInt(values[1]);
		   }
			
			String command = input.substring(index);
			
			
			if (command.equalsIgnoreCase("quit")) {
				System.out.println("클라이언트를 종료합니다.");
				return ;
			}
			commandHistory.push(command);
			commandHistory2.offer(command);
			if (command.equals("history")) {
				printCommandHistory();
				continue;

			} else if (command.equals("history2")) {
				printCommandHistory2();
				continue;
			} 
			// 서버에게 요청을 보낸다

			try(Socket socket = new Socket("localhost",8888);
					PrintWriter out = new PrintWriter(socket.getOutputStream());
					BufferedReader in = new BufferedReader(
							new InputStreamReader(socket.getInputStream()))){

				out.println(command);
				out.flush();
				if (command.equals("stop")) {
					System.out.println("서버종료합니다.");
					break;
				}
				//서버의 응답을 출력한다.
				while(true) {
					String response = in.readLine();
					if(response.equalsIgnoreCase("!end!")) {
						break;
					}else if(response.equals("!{}!")) {
						String input = keyboard.nextLine();
						out.println(input);
						out.flush();
					
					}else {
						System.out.println(response);
					}
				}
			}catch(Exception e) {
				System.out.println("서버요청중 에러");
				e.printStackTrace();

			}//try(socket

		} //while
		keyboard.close();
	}

	@SuppressWarnings("unchecked")
	private void printCommandHistory() {
		Stack<String> temp = (Stack<String>) commandHistory.clone();

		while (temp.size() > 0) {
			System.out.println(temp.pop());
		}
	}

	@SuppressWarnings("unchecked")
	private void printCommandHistory2() {
		Queue<String> temp = (Queue<String>) ((LinkedList<String>) commandHistory2).clone();

		while (temp.size() > 0) {
			System.out.println(temp.poll());
		}
	}

	private String prompt() {
		System.out.print("명령> ");
		return keyboard.nextLine().toLowerCase();
	}

	public static void main(String[] args)throws Exception {

		ClientApp app = new ClientApp();
		app.service();

	}
}

