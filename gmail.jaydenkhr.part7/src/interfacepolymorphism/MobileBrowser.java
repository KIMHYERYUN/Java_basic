package interfacepolymorphism;

//ProgressiveWeb 인터페이스를 구현한 MobileBrowser
public class MobileBrowser implements ProgressiveWeb {
	public void nextPage() {
		System.out.println("아래로 스크롤");
	}
}

