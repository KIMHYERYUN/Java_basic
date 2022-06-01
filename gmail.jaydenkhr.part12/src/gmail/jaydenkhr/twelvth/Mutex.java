package gmail.jaydenkhr.twelvth;

//스레드 클래스
class ShareData implements Runnable{
	//속성만들고
	private int result;
	private int idx;
	
	public int getResult() {
		return result;
	}

	private synchronized void sum() {
		//idx를 1000번 증가시켜서 result에 더해주기
		for(int i=0; i<1000; i=i+1) {
			idx = idx + 1;
			
			result = result + idx;
		}
	}
	
	//스레드로 동작할 메서드
	public void run() {
		sum();
	}
}

public class Mutex {
	
	public static void main(String[] args) {
		//ShareData 인스턴스 생성
		ShareData sh = new ShareData();
		//위의 인스턴스를 가지고 스레드를 생성 - 공유 데이터를 가지고 스레드를 생성
		Thread th1 = new Thread(sh);
		Thread th2 = new Thread(sh);
		
		//스레드 실행 - 둘다 공유데이터를 동시에 사용하고 있어서 같이 실행시키면 result에 더하기 전에 sleep이 호출되어서 다른 스레드에게 제어권이 넘어가고 
		//그 스레드에서 idx를 수정해버리기 때문에 발생. 2000번 idx를 증가시키면서 더해야 하므로 
		//1부터 2000까지의 합이 나와야 하는데 그렇지 않고 실행할 때마다 다른 결과를 만들어냄
		th1.start();
		th2.start();
		
		//위 문제 해결방법 2가지
		//1.매서드의 결과형 앞에 synchronized(동기화) : 메서드 수행 중 다른 메서드 작업 수행 불가
		//	 - 13열 private void sum() {    -> private synchronized void sum() {
	    //2.한번에 실행되어야 하는 영역을 synchronized블럭으로 만드는 것인데 synchronized(공유객체){}로 묶으면 되는데 이 블럭에 진입한 경우 공유객체를 동시 수정할 수 없도록 동기화 블럭을 만듦.
		//   - {}할 동안만 서로 실행하지 못하게 만듦
		//   - idx 부터 딜레이되고 result 생산하는 영역
		//   - synchronized(this) {
		//			idx = idx + 1; ........result..}
							
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//sh.result 값 출력
		System.out.println(sh.getResult());

	}
	
}


