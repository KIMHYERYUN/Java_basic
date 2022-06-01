package singleton;

//Singleton 패턴으로 디자인
public class BusinessLogic {
	//1. 생성자를 private으로 생성 - 외부에서 instance생성 못함
	BusinessLogic() {}
	
	//2. 자신의 클래스 타입으로 static 변수를 생성
	private static BusinessLogic obj;
	
	//3. static 변수가 null일때 인스턴스를 생성하는 static 메서드를 생성
	public static BusinessLogic sharedInstance() {
		if(obj == null ) {
			obj = new BusinessLogic();
		}
		return obj;
	}
}
