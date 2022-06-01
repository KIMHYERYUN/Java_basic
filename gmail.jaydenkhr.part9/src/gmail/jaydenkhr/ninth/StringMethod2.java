package gmail.jaydenkhr.ninth;

public class StringMethod2 {

	public static void main(String[] args) {
		//length와 charAt 메서드를 사용해서 해결
		String str = "Hello String";
		//str 길이를 출력
		int len = str.length();
		System.out.println("str의 길이:" + len);
		//str의 첫글자가 대문자인지 판별
		int result = str.compareTo(str.toLowerCase());
		System.out.println(result);
		if(result < 0) {
			System.out.println("str의 첫글자는 대문자이다");
		}else {
			System.out.println("str의 첫글자는 대문자가 아닌 소문자이다");
		}
		//위 11~18열까지 의 방법은 사용불가
		//이유는 첫글자만 비교하는게 아닌 모든 문자열에 소문자가 더 많다면 더 큰 숫자로 결과 출력
		
		//대문자 판별
		char ch1 = str.charAt(0);
		if(ch1 >= 'A' && ch1 <= 'Z') {
			System.out.println("str의 첫글자는 대문자이다");
		}else {
			System.out.println("str의 첫글자는 대문자가 아닌 소문자이다");
		}
		
		//소문자 판별
		char ch2 = str.charAt(11);
		if(ch2 >='a' && ch2 <='z') {
			System.out.println("str의 마지막 글자는 소문자이다");
		}else {
			System.out.println("str의 마지막글자는 소문자가 아닌 대문자이다");
		}
		
		//영문자 판별
		if(ch1 >= 'A' && ch1 <='Z' || ch1 >= 'a' && ch1 <= 'z') {
			System.out.println("첫글자는 영문자");
		}else {
			System.out.println("첫글자는 영문자가 아님");
		}
	}

}
