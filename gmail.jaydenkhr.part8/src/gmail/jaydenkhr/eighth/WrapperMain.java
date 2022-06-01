package gmail.jaydenkhr.eighth;

public class WrapperMain {

	public static void main(String[] args) {
		//실수 32.4를 인스턴스로 생성
		Double d = 32.4;
		//Wrapper Type을 기본형으로 변경(Double -> double)
		double x = d;
		
		//문자열을 숫자로 변환 -포맷이 맞지 않으면 NumberFormatException 발생
		//"123"을 숫자 123으로 변환
		//int y = "123";
		int y = Integer.parseInt("123");
		//중간에 공백이 있어서 NumberFormatException 발생
		//y = Integer.parseInt("12 3"); 

		//숫자를 문자열로 변환
		//java에서는 Wrapper Class의 toString 메서드를 이용해도 되고
		//""을 + 해줘도 된다.
		
		String s = 123 + "";

		
		Integer i = 123;
		s = i.toString();
		
		//Object 클래스의 인스턴스에 기본형 데이터가 들어있는 경우
		//기본형으로 형 변환은 안된다.
		//Wrapper Type으로 형변환해서 대입해야 한다.
		Object o = 123;
		//int k =(int)o; //하위 버전에서는 에러 - web Programming에서 에러
		int k = (Integer)o;
		
	}

}
