package anonymousclass;

public class Main {

	public static void main(String[] args) {
		//어떤 인터페이스의 메서드를 사용할 때는
		//인터페이스를 implements 한 클래스를 만들고 그 안에 메서드를 구현한 후
		//다른 곳에서 클래스의 인스턴스를 만들고 메서드를 호출
		Template t = new TemplateImpl();
		t.method();
		
		//Template 인터페이스를 별도의 클래스를 만들지 않고 사용
		new Template( ) {
			@Override
			public void method() {
				System.out.println("익명 객체를 이용한 인터페이스 사용");
			}
		}.method();
		
		
		
		}

	}

