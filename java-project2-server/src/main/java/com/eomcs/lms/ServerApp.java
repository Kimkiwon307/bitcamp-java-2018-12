// 21단계 

package com.eomcs.lms;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.ApplicationContext;

import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.context.RequestMappingHandlerMapping;
import com.eomcs.lms.context.RequestMappingHandlerMapping.RequestMappingHandler;
import com.eomcs.lms.handler.Response;

public class ServerApp {

	ArrayList<ApplicationContextListener> listeners = new ArrayList<>();
	HashMap<String,Object> context = new HashMap<>();
	ApplicationContext iocContainer;
	RequestMappingHandlerMapping handlerMapping;

	public void addApplicationContextListener(ApplicationContextListener listener) {
		listeners.add(listener);
	}

	public void service() throws Exception {

		try (ServerSocket ss = new ServerSocket(8888)) {


			// 애플리케이션을 시작할 때, 등록된 리스너에게 알려준다.
			for (ApplicationContextListener listener : listeners) {
				listener.contextInitialized(context);
			}

			// ApplicationInitializer가 준비한 ApplicationContext를 꺼낸다.
			iocContainer = (ApplicationContext) context.get("applicationContext");

			handlerMapping = (RequestMappingHandlerMapping) context.get("handlerMapping");

			System.out.println("서버 실행 중...");

			while (true) {
				new RequestHandlerThread(ss.accept()).start();
			} // while

			// 애플리케이션을 종료할 때, 등록된 리스너에게 알려준다.
			// => 현재 while 문은 종료 조건이 없기 때문에 다음 문장을 실행할 수 없다.
			//    따라서 주석으로 처리한다.
			/*
      for (ApplicationContextListener listener : listeners) {
        listener.contextDestroyed(context);
      }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		} // try(ServerSocket)

	}

	public static void main(String[] args) throws Exception {
		ServerApp app = new ServerApp();

		// App이 실행되거나 종료될 때 보고를 받을 옵저버를 등록한다.
		app.addApplicationContextListener(new ApplicationInitializer());


		// App 을 실행한다.
		app.service();
	}
	// 바깥 클래스(ServerApp)의 인스턴스 필드를 사용해야 한다면 
	// Inner 클래스(non-static nested class)로 정의하라!
	// 
	class RequestHandlerThread extends Thread {

		Socket socket;

		public RequestHandlerThread(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {

			try (Socket socket = this.socket;
					BufferedReader in = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
					PrintWriter out = new PrintWriter(socket.getOutputStream())) {

				// 클라이언트의 요청 읽기
				String request = in.readLine();

				// 클라이언트에게 응답하기
				// => 클라이언트 요청을 처리할 메서드를 꺼낸다.

				RequestMappingHandler requestHandler = handlerMapping.get(request);


				if (requestHandler == null) {
					out.println("실행할 수 없는 명령입니다.");
					out.println("!end!");
					out.flush();
					return;
				}

				try {
					requestHandler.method.invoke(requestHandler.bean , new Response(in,out));
				} catch (Exception e) {
					out.printf("실행 오류! : %s\n", e.getMessage());
					e.printStackTrace();
				}

				out.println("!end!");
				out.flush();

			} catch (Exception e) {
				System.out.println("명령어 실행 중 오류 발생 : " + e.toString());
				e.printStackTrace();

			}
		}
	}



}









