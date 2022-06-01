package gmail.jaydenkhr.sixth;

public class ThisClassPractice {

	public static void main(String[] args) {
		// ThisClass에 있는 method()를 호출
		//1. static이 붙은 메서드인지 확인
		
		//2. static이 붙지 않은 메서드이면 인스턴스 생성
		//생성자 확인하고 생성자가 없으면 static으로 자기 자신을 리턴하는 메서드 확인
		ThisClass obj = new ThisClass();
		//3. 필요한 메서드를 호출
		obj.method();
		obj = new ThisClass();
		
		

	}

}
