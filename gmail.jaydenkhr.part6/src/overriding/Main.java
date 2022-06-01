package overriding;

public class Main {

	public static void main(String[] args) {
		//P Class의 method를 사용
		//제공되는 메서드를 사용할 때 확인할 내용
		//1. static이 붙었는지 안붙었는지 확인 - static이 있으면 2번 패스
		//2. 붙지 않았다면 인스턴스 생성은 어떻게 해야하는지
		P obj = new P();
		//3. 매개변수는 어떤 자료형 몇 개인지 확인- 없음
		//4. return type은 어떻게 되는지 - void
		obj.method();
		
        //P 클래스의 method의 기능이 부족하다고 판단되면
		//P 클래스를 상속받는 클래스를 생성 - C
		//C 클래스에 기능이 부족하다고 판단된 메소드를 재정의
		C ins = new C();
		ins.method();
		
		//P가 상위 클래스C가 하위 클래스
		P p = new P(); //클래스와 인스턴스 타입이 같으면 대입이 가능
		p = new C(); //인스턴스의 타입이 변수의 클래스의 하위 클래스이면 가능
		
		C c = new C();
		//c = new P(); //이 문장 에러
		//C가 P 클래스의 하위 클래스이기 때문에 에러
		
		c = (C)(new P()); //강제로 형 변환을 하면 에러는 아니지만 예외가 발생
		
		c = (C)p;  //예외 발생하지 않음 - p에는 C()가 대입되어 있어서 가능
	}

}
