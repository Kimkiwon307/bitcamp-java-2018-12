// 스레드의 생명주기
package ch24.c;

public class Test03 {

	public static void main (String [] agrs) throws Exception {

		Thread t =	new Thread() { // 익명클래스 
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.printf("스레드 ====> %d\n",i);
				}
			}
		};
		t.start();


		new Thread( new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					System.out.printf("스레드2 ******> %d\n",i);
				}
			}
		}).start(); 
		


		// main스레드를 5초동안 낫 러너블 상태에 둔다
		// 즉 메인스레드를 실행하지 안흔다.
		Thread.currentThread().sleep(5000);

		//주의!
		// => 데드 상태에서 다시 실행할 수 없다.

		t.start();  //예외 발생!

		for (int i = 0 ; i< 1000; i++) {
			System.out.printf("main()~~~~> %d\n", i);
		}
		// main() 메서드의 코드를 모두 실행했다고 해서 JVM이 종료되는 것은 아니다.
		// 다른 스레드와 실행 모두 끝나야만 JVM이 종료된다


	}



}


