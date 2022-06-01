package gmail.jaydenkhr.twelvth;

import java.util.concurrent.Semaphore;

class SemaphoreThread extends Thread{
	//3.인스턴스 생성
	Semaphore semaphore;
	
	public SemaphoreThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	//1.매서드 작성
	public void run() {
		try {
			//4.열쇠를 취득
			semaphore.acquire();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName());
		//5.열쇠를 반납
		semaphore.release();
	}
}

public class SemaphoreTest {

	public static void main(String[] args) {
		//2.작성
		//동시에 3개 까지 실행되도록 해줍니다.
		Semaphore semaphore = new Semaphore(3);
		//6. 병렬처리는 아래 방법으로 대체작성
		//Semaphore semaphore = new Semaphore(Runtime.getRuntime().availableProcessors());
		
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();	
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		//7. 병렬처리 시 작성 : 원하는 갯수를 작성하면 그만큼 실행
		//System.out.println(Runtime.getRuntime().availableProcessors());
		
		//처음에 하나씩 연속해서 생성했으나 최종적으로 동시에 3개 실행
		
		
	}

}
