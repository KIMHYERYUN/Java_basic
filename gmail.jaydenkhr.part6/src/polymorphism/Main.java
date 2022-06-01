package polymorphism;

public class Main {

	public static void main(String[] args) {
		// 앞에서 만든 메서드 3개를 전부 호출
		//Protoss p = new Protoss();
		//p.attack();
		
		//Terran t = new Terran();
		//t.attack();
		
		//Zerg z = new Zerg();
		//z.attack();
		
		//동일한 기능을 하는 메서드 이름 상이 -> 클래스 만들기 전 통일작업 수행 필요
	    //Terran 클래스 offence -> attack 변경
		
		//각 메서드 호출 구문에 키를 할당
		//동일한 이름의 메서드로 동일한 코드 호출하기 위해 3개의 클라스가 하나의 클래스로부터 상속받도록 
		//하는 메서드를 overriding 시킴
		//상위 클래스 만들고 attack overriding 될 수 있도록 메서드 생성
		//Starcraft 생성

		//star.attack()이라는 동일한 코드로 서로 다른 클래스에 있는 메서드를 호출: 다형성
		Starcraft star = new Protoss();
		star.attack();
		
		star = new Terran();
		star.attack();
		
		star = new Zerg();
		star.attack();
		
		
	}

}
