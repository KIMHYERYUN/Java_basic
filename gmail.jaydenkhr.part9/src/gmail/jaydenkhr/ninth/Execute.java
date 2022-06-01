package gmail.jaydenkhr.ninth;

public class Execute {

	public static void main(String[] args) {
		
		//api에 static이 없기 때문에 인스턴스 생성
		//생성자 확인해야 하는데 생성자 없음
		//생성자가 보이지 않으면 인터페이스나 추상 클래스 인지 확인
		//그러면 인터페이스를 구현하거나 추상 클래스를 상속하는 클래스를 구현
		//인터페이스도 아니고 추상 클래스도 아님
		//이경우는 static method 중 자기 자신을 리턴하는 메소드 확인
		//static Runtime - getRuntime()
		//이런 경우 못찾았으면 Builder나 Factory가 붙는 클래스를 찾아햐마
		//exec 메서드는 throws IOException이라는 걸 예외
		
		//Runtime 클래스를 그림판으로 실행
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("mspaint.exe");
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
