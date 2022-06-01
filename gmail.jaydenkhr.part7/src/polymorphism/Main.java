package polymorphism;

public class Main {

	public static void main(String[] args) {
		//2개의 클래스에 존재하는 메서드를 호출
		//MobileBrowser mbrowser = new MobileBrowser();
		//mbrowser.nextPage();
		
		//PCBrowser pbrowser = new PCBrowser();
		//pbrowser.nextPage();

		//2개의 메서드 모두를 호출했지만 2개의 메서드를 호출하는 코드가 다름
		//-> 2개의 메서드를 호출하는 코드를 동일하게 작성 : 다형성(Polymorphism) 구현
		//2개의 클래스의 상위 클래스가 될 클래스를 생성 - Progressive Web
		
		ProgressiveWeb browser = new MobileBrowser();
		browser.nextPage();
		
		browser = new PCBrowser();
		browser.nextPage();
		
		//현재는 아래 문장이 가능
		//추상 클래스나 인터페이스를 이용하면 아래 문장은 에러
		//Cannot instantiate the type ProgressiveWeb : 인스턴스화 할 수 없음
		browser = new ProgressiveWeb();
		browser.nextPage();
	}
}
