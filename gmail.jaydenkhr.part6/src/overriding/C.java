package overriding;

public class C extends P {
	//매서드 오버라이딩
	//상위 클래스에 있는 메서드를 하위 클래스에서 다시 만드는 것
	@Override
	public void method() {
		
		System.out.println("추가하고자 하는 기능");
	}

}
