package review2;

public class Main_1 {

	public static void main(String[] args) {
		//HelloWorld 모두 대문자로 출력하기
		String st1 = "HelloWorld";
		System.out.println(st1.toUpperCase());
		
		//"Hello World"에서 중간 공백을 제거하고 출력
		//trim은 좌우 공백 제거
		//중간 공백은 직접 제거해야함
		//HelloWorld 출력
		String st2 = "Hello World";
		String [] result = st2.split(""); 
		System.out.println(result[result.length-1]);
		
		//rose와 eros : anagram(spell은 같고 순서가 다름)
		//아나그램이라고 판정하고 rose와 orse는 아나그램이 아니라고 판정
		
		//"GGCDGCCGDDGCCGCCGDDCKGCCGKK" 문자열에서 GCCG 의 위치를 전부 출력하기
		//단 GCCG 한 블럭이 나오면 이 블럭은 제외하고 검사해야 합니다.
		//GCCGCCG 가 있으면 앞의 GCCG 만 허용됩니다.
		//염기서열 분석임
	}

}
