package abstractpolymorphism;

	//MobileWebBrowser와 PCBrowser 클래스의 인스턴스를 모두 대입받기 위한 상위 클래스
	//인스턴스가 접근할 수 있는 메서드를 만들어주기 위해서 만든 메서드
	//추상 클래스 - 인스턴스를 생성할 수 없음
public abstract class ProgressiveWeb {
	//인스턴스가 접근할 수 있는 메서드를 만들어주기 위해서 만든 메서드
	public abstract void nextPage();
	}
