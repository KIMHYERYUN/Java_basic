package gmail.jaydenkhr.twelvth;

public class DaemonThread {

	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("자동 저장");
				}
			}
		};
		th.setDaemon(true); //데몬 스레드가 됨 다른 스레드가 없으면 종료
		th.start();
		
		Thread th1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + " 종료");
			}
		};
		th1.start();

	}

}
