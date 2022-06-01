package singleton;

public class Main {

	public static void main(String[] args) {
		//인스턴스 생성
		//BusinessLogic obj1 = new BusinessLogic();
		//BusinessLogic obj2 = new BusinessLogic();
		
		
		// 위의 경우를 아래경우로만 출력가능 : 싱글톤 패턴으로 디자인 된 클래스라서 
		//생성자로 인스턴스 생성을 못하고 static 메서드를 호출해서 인스턴스를 생성
		BusinessLogic obj1 = BusinessLogic.sharedInstance();
		BusinessLogic obj2 = BusinessLogic.sharedInstance();
		
		//기존 인스턴스를 가리키도록 하기
		BusinessLogic obj3 = obj1;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj3));
		

	}

}
