package gmail.jaydenkhr.twelvth;

public class ThreadProcessDifference {

	public static void main(String[] args) {
		// 1초마다 Hello Thread를 10번 출력하는 문장
		int i=0;
		while(i<10) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hello Thread");
			
			i=i+1;
		} //while 종료

		//앞의 2개 블럭은 프로세스 형태로 실행
		//앞쪽의 블럭이 끝나야만 뒤의 블럭이 실행됨
		
		//스레드를 생성해서 시작 - anonymous 클래스
		new Thread() {
			//스레드를 시작시키면 호출되서 스레드로 동작하는 메서드
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("스레드 1");
					}
				}
			
		}.start();
		//스레드는 sleep을 만나서 쉬는시간이 생기면 다른 스레드를 수행할 수 있다.
		new Thread() {
			//스레드를 시작시키면 호출되서 스레드로 동작하는 메서드
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("스레드 2");
					}
				}
			
		}.start();
	}
	

}
