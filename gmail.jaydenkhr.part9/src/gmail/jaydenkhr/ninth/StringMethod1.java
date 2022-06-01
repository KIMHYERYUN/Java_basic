package gmail.jaydenkhr.ninth;

public class StringMethod1 {

	public static void main(String[] args) {
		//문자열의 일치 여부 확인
		String str1 = "adam";
		String str2 = "ADAM";
		String str3 = "Adam ";
		
		//둘다 대문자로 변경
		System.out.println(str1.toUpperCase().equals(str2.toUpperCase()));
		//둘다 소문자로 변경하지만 str3 공백으로 false
		System.out.println(str1.toLowerCase().equals(str3.toLowerCase()));
		//둘다 공백 없애고 대문자로 변경하면 true
		System.out.println(str1.trim().toUpperCase().equals(str3.trim().toUpperCase()));
		
		//compare to는 크기 비교
		//대소문자 변환을 하지 않은 상태에서 크기 비교를 하면 소문자가 크다고 나옴
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str3));
		//크기 비교한 결과 앞의 것이 크면 앞의 것이 크다고 같으면 같다고 비교 대상이 크면 뒤의 것이 크다고 출력
		int result = str1.compareTo(str2);
		if(result > 0) {
			System.out.println("str1이 더 크다");
		}else if(result == 0) {
			System.out.println("str1과 str2는 같다");
		}else {
			System.out.println("str2가 더 크다");
		}

	}

}
