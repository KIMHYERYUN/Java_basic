package gmail.jaydenkhr.ninth;

public class SystemMethod {

	public static void main(String[] args) {
		// 운영체제 이름 확인
		System.out.println("OS:" + System.getProperty("os.name"));
		System.out.println("자바버전:" + System.getProperty("java.version"));

		//현재시간
		long start = System.nanoTime();
		//작업수행
		for(int i=0; i<1000000000; i++) {}
		//현재시간
		long end = System.nanoTime();
		//작업시간 : 뒤의 시간에서 앞의 시간을 빼면 작업을 수행하는데 걸린 시간
		System.out.println("걸린시간:" + (end-start));
		
		
		//현재시간
		start = System.nanoTime();
		//작업수행
		for(int i=0; i<1000000000; i=i+1) {}
		//int 21/-21억까지만 가능, int -> long & 숫자 뒤에 L 
		//for(long i=0; i<1000000000000L; i=i+1) {}
		//현재시간
		end = System.nanoTime();
		//작업시간 : 뒤의 시간에서 앞의 시간을 빼면 작업을 수행하는데 걸린 시간
		System.out.println("걸린시간:" + (end-start));
		
		
	}

}
