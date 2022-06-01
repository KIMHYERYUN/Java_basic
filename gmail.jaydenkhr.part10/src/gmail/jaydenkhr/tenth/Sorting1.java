package gmail.jaydenkhr.tenth;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting1 {

	public static void main(String[] args) {
		//사용자 정의 클래스의 정렬 또는 내림차순 정렬 
		//1.클래스에 comparable 인터페이스 구현하거
		//2.comparator 인터페이스를 구현한 객체를 sort 메서드의 두번째 매개변수로 대입
		//자바는 완전한 객체지향 언어로 comparator 인터페이스를 구현한 객체를 대입하지만
		//함수형 프로그래밍 언어들은 함수만 만들어서 대입
		
		//1.자바에서 클래스를 상속받거나 인터페이스를 구현해서 사용하는 방법
		//클래스를 상속받는 클래스를 만들고 인스턴스를 생성하는 방법
		//class 클래스 이름 extends(implements) 클래스이름(인터페이스이름){
		//			필요한 메서드 재정의 - 추상 메서드는 반드시 재정의
		//}
		//new 클래스 이름()

		//2.anonymous class를 이용하는 방법
		//new상위 클래스이름(){
		//		필요한 메서드 재정의
		//}
		


		String [] ar = {"아몬드봉봉", "쿠키앤치즈", "녹차", "치즈케이크", "망고"};
		//문자열 내림차순 정렬 - Arrays.sort 메서드 이용
		//Comparator를 구현한 클래스 만들기
		//미지정자 이름은 클래스 이름만 가능(아래 string, integer 같은)
		class Temp implements Comparator<String>{
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); // 양수면 o1, 음수면 o2
				//return 01.compareTo(02) * -1;  //부호가 반대면 -1를 곱하거나 순서를 바꿔도 됨
			}
		}
		Arrays.sort(ar, new Temp());
		System.out.println(Arrays.toString(ar));
		
		
		
		Integer [] br = {99, 4, 1, 10, 57, 24};
		class Imsi implements Comparator<Integer>{
			@Override
			public int compare(Integer o1, Integer o2) {
				//return o1-o2; //오름차순
				return o2-01; //내림차순
				//return o2.compareTo(o1);
			}
		}
		Arrays.sort(br, new Imsi());
		System.out.println(Arrays.toString(br));
		
		
		//정수를 내림차순 정렬 - Anonymous 이용
		Integer [] cr = {99, 4, 1, 10, 57, 24};
		Arrays.sort(cr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return 02-01;
			}
		});		
		System.out.println(Arrays.toString(br));
	}
}
	


