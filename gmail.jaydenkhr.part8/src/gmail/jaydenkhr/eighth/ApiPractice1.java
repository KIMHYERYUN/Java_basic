package gmail.jaydenkhr.eighth;

import java.util.Random;

public class ApiPractice1 {

	public static void main(String[] args) {
		// java.lang.Math 클래스의 random 메서드를 이용해서
		//0.0~1.0 사이의 랜덤한 실수를 만들어 출력
		
		double d = java.lang.Math.random();
		System.out.println("d" + d);

		//java.util.Random이라는 클래스의 nextInt라는 메서드를 이용하면
		//랜덤한 정수를 생성할 수 있다.
		//랜덤한 정수를 생성해서 출력
		//메서드를 찾고
		//static 여부 확인
		//static 았으면 클래스로 호출가능, 없으면 인스턴스 생성 - 생성자 확인
		//메서드의 매개변수를 확인하고 리턴타입을 확인
		
		//static이 없으므로 인스턴스 생성
		Random r = new Random();
		//빨간줄 눌러 import 형성
		int s = r.nextInt();
		System.out.println("s" + s);
		
		//아래 문장은 에러
		//java.lang.Math m = new java.lang.Math();
		//모든 멤버가 static이라서 생성자를 외부에 노출시키지 않음
		//java.util.Calendar cal = new java.util.Calendar();
		//추상 클래스라서 인스턴스 생성 못함
		//java.util.List list = new java.util.List();
		//인터페이스라서 인스턴스 생성 못함
		
		
		//java.lang.Thread 클래스의 sleep이라는 메서드를 이용하면
		//일정시간 동안 현재 스레드를 대기 시킬 수 있다.
		//다윈는 1/1000입니다.
		//3초가 현재 프로그램을 대기 시키기
		
		//static, throw, 매개변수, void(결과를 담을 곳이 없음) 
		//Thread.sleep(3000);
		//에러나는 이유 : throws InterruptedException
		try {
			Thread.sleep(3000);;
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		
		//java.lang.Runtime 클래스는 모든 멤버가 static이 아니므로 인스턴스 생성
		//abstract classe도 아니고 interface도 아님
		//그런데 아래 문장은 에러
		//이런 경우 인스턴스 생성?
		//메서드 중에서 자기 자신을 리턴하는 메서드가 있는지 확인(아래 static Runtime 확인)
		Runtime runtime = Runtime.getRuntime();
		
	}

}
