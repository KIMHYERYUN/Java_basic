package gmail.jaydenkhr.twelvth;

//Thread를 상속(extends)받는 클래스
class ThreadEx extends Thread {
	//Thread로 수행할 내용을 가진 메서드
	public void run() {
		//Thread.sleep을 사용하는 이유는 delay를 만들기 위해서
		//0.01초씩 대기하면서 스레드 1이라고 10번 출력하도록 만들기
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("스레드 1");				
			}
		}
	}

//Runnable 인터페이스를 구현한 클래스
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		// 0.01초마다 스레드2라고 10번 출력하기
		int i=0;
		while(i<10) {
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("스레드 2");
			i=i+1;
		}
	}	
}

public class ThreadCreate {
	
	public static void main(String[] args) {
		//Thread를 상속받은 ThreadEx 클래스를 가지고 스레드를 생성하고 시작
		ThreadEx th1 = new ThreadEx();
		//run을 호출하면 스레드로 실행을 하지 못하ㅗㄱ 일반 메서드 호출을 하는데
		//이 경우는 프로세스 실행하는 것과 동일합니다.
		//th1.run();
		
		th1.start();
		//new ThreadEx().start()로 해도 됨
		
		
		//Runnable 인터페이스를 구현한 RunnableImpl 클래스를 가지고 스레드
		//생성하고 시작
		RunnableImpl runnable = new RunnableImpl();
		Thread th2 = new Thread(runnable);
		th2.start();
		//new Thread(new RunnableImpl()).start()와 동일
		
		Thread th3 = new Thread() {
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("스레드 3");
				}
			}
		};
		
				
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(10);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("스레드 4");
					
				}
			}
		};
		Thread th4 = new Thread(r);
		th4.start();
	}

}
