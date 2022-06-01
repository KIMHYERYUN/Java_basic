package polymorphism;

//ProgressiveWeb 으로 상속받는 MobileBrowser
public class MobileBrowser extends ProgressiveWeb {
	public void nextPage() {
		System.out.println("아래로 스크롤");
	}

}
