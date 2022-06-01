package gmail.jaydenkhr.third;

public class Etc_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문 안의 실행문장이 1개 일때는 {} 생략 가능
		//비추천
		for(int i=0; i<3; i=i+1)
			System.out.println("Hello World");

		for(int i=0; i<3; i=i+1) {
			System.out.println("자동 들여쓰기 단축키는 Contro + I");
		}
		
		//for을 사용하지 않은 것과 동일한 상태
		//반복 안됨
		for(int i=0; i<3; i=i+1); {
			System.out.println("제어문의 ()뒤에 ; 붙어서 없는 것과 동일");
			System.out.println("한번만 수행하며 do while은 예외");
		}
		//아래 코드는 에러 
		//for(;;) {}
		//System.out.println("Dead Code");

	}

}
