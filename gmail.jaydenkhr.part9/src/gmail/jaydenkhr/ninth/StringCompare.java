package gmail.jaydenkhr.ninth;

public class StringCompare {

	public static void main(String[] args) {
		//String과 StringBuilder의 차이
		
		//1. 생성
		String str = "My name is";
		StringBuilder sb = new StringBuilder("My name is");
		
		//2. 해시코드 출력
		System.out.println("str:" + str.hashCode());
		System.out.println("sb:" + sb.hashCode());
		
		//3. 문자열 추가연산
		str= str + "Adam";
		sb.append("Adam");
				
		//4. 추가 연산을 한 후 해시코드 확인
		System.out.println("stradd:" + str.hashCode());
		System.out.println("sbadd:" + sb.append("Adam").hashCode());
	}

}
