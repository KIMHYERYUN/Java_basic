package gmail.jaydenkhr.eighth;

public class Testing2 {
	
	public static void maini(String[] args) {
		int n =10;
		int x = 0;
		
		try {
			//예외가 발생하는 문장
			System.out.println("result=" + (n/x));
		}catch(Exception e) {
			//기록이나 화면에 출력하는 코드 작성 - Logging
			System.out.println(e.getLocalizedMessage());
		}
		
		//예외처리를 하지 않으면 앞에서 예외가 발생하기 때문에 이 문장은 실행되지 않음
		System.out.println("계속 수행할 문장");
	}

}
