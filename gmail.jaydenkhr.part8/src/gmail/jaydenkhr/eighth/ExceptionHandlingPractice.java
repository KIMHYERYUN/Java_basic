package gmail.jaydenkhr.eighth;

public class ExceptionHandlingPractice {

	public static void main(String[] args) {
		try {
			//예외가 발생할만한 코드를 작성
			int x=10;
			//0으로 나눌 수 없기때문에 ArithmeticException 발생
			//int n=0;
			//예외문 작성 -> /by zero 출력
			
			//ArithmeticException이 발생하지 않음
			int n = -1 ;
			
			int result = x/n;
			System.out.println("result:"+result);
		}catch(ArithmeticException e) {
			//ArithmeticException이 발생했을 때 처리할 내용
			System.out.println("산술제외:" + e.getLocalizedMessage());		
		}catch(NullPointerException e) {
			//ArithmeticExcepiton이 발생했을 때 처리할 내용
			System.out.println("null예외:" + e.getLocalizedMessage());
		}catch(Exception e) {
			System.out.println("모든 예외처리 가능:" + e.getLocalizedMessage());
			//Exception은 항상 맨끝에 작성(상위 클래스이기 때문에)
			
		}finally {
			//무조건 수행할 내용
			System.out.println("무조건 수행할 내용");
			System.out.println("주로 외부 자원 연결 해제 코드를 작성");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		int a= 10;
		try {
			System.out.println(a);
		}catch(Exception e) {
			System.out.println(a);
			//System.out.println(b);
			//try에서 사용한 변수는 catch 나 finally에서 사용불가
			e.printStackTrace();
			
		}

				
	}
}
