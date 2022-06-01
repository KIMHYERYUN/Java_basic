package gmail.jaydenkhr.sixth;

public class MethodClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //MethodClass의 인스턴스 생성
		MethodClass obj = new MethodClass();
		//메소드를 호출
		obj.method();
		obj.method();
		
		//static이 없는 메서드는 반드시 인스턴스를 생성해서 호출해야함
	    //MethodClass.method(); 은 안됨
		
		//static 메서드 호출
		MethodClass.noArgDisp();
		
		//매개변수가 정수 1개인 static 메서드 호출
		MethodClass.argDisp(5);
		
		//매개변수가 2개인 메서드드 호출
		MethodClass.twoArgDisp("출력할 내용", 2);
		
		//static이 없는 매서드는 인스턴스를 이용해서 출력
		MethodClass ins = new MethodClass();
		//return이 없는 메서드라서 호출하고 끝임
		ins.noReturnAdd(100,300);
		
		//return이 있는경우는 결과를 다른 변수에 저장해서 사용하는 것이 일반적
		int result = ins.returnAdd(100, 300);
		//결과를 출력
		System.out.println(result);
		//이전 결과를 가지고 다시 더하기
		result = ins.returnAdd(result, 300);
		System.out.println(result);
		
	}
}
