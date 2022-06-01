package gmail.jaydenkhr.twelvth;

import java.util.ArrayList;
import java.util.List;

//공유 자원 클래스 - 진열대
class Product{
	List<Character> list;
	
	//생성자
	public Product() {
		list = new ArrayList<Character>();
	}
	
	//물건을 생산하는 메서드
	//public void put(char ch) {  에러
	public synchronized void put(char ch) {
		list.add(ch);
		System.out.println(ch + "가 입고되었습니다.");
		//잠시 대기
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("현재 재고 수량:" + list.size());
	}
	
	//물건을 소비하는 메서드
	//public char get() { 에러
	public synchronized char get() {
		if(list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		char ch = list.remove(0); 								
		System.out.println(ch + "가 출고 되었습니다");
		try {
			 Thread.sleep(1000);  
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("현재 재고 수량:" + list.size());
		return ch;

	}
}

//생산자 Thread - Thread 클래스로부터 상속
class Producer extends Thread{
		//창고
		private Product list;
		//생성자-외부에서 데이터를 받아서 자신의 멤버 변수에 대입
		//DI(Dependency Injection) - 의존송 주입
		public Producer(Product list) {
			this.list = list;
		}	
		public void run() {
			//26번 A~Z 까지 list에 추가 
			for(int i = 65; i<=90; i=i+1) {
				list.put((char)i);
			}
		}
	}

	
//소비자 스레드	
class Customer extends Thread{
	private Product list;
	
	public Customer(Product list) {
		this.list = list;
	}
	public void run() {
		//26번 list에서 꺼내오기
		for(int i=0; i<26; i=i+1) {
			list.get();
		}
	}			
}
		
public class ConsumerProblem {

	public static void main(String[] args) {
		//공유할 진열대 생성
		Product product = new Product();
		
		//생산자 스레드 생성 및 실행
		Producer p = new Producer(product);
		Customer c = new Customer(product);

		p.start();
		c.start();
	}

}
//없는상태에서 remove 하기 때문에 튕겨버림
//실행을 하면 소비자 스레드는 예외가 발생하고 생산자 스레드는 계속 작업을 수행함
//소비자 스레드는 데이터가 없는 것을 가져 갈려고 해서 ArrayIndexOutOfBoundException 발생
