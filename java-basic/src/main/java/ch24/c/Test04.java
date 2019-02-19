// join() - 해당 스레드가 종료될 때까지 현재 스레드를 기다리게 한다.
package ch24.c;

public class Test04 {

	public static void main (String [] agrs) throws Exception {

		Thread t =	new Thread() { // 익명클래스 
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.printf("스레드 ====> %d\n",i);
				}
				try {
				sleep(5000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		t.start();

		t.join();

		for (int i = 0 ; i< 1000; i++) {
			System.out.printf("main()~~~~> %d\n", i);
		}


	}



}


