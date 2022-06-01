package gmail.jaydenkhr.tenth;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//배열을 생성
		String [] judos = {"엎어치기", "누르기", "조르기"};
		//데이터 확인 - 디버깅(세부 데이터 확인 하는 것을 말함)
		//배열은 바로 toString을 호출하면 요소의 클래스 이름과 해시코드가 리턴
		System.out.println(judos);
		//Arrays 클래스의 toString을 이용하면 배열 각 요소의 toString 호출
		System.out.println(Arrays.toString(judos));
		
		
		float [] points = null;
		System.out.println(Arrays.toString(points));
		
		
		//judos배열을 복사해서 새로운 배열을 생성
		//java.util.Arrays 클래스의 copyOf라는 메서드를 사용할 수 있음
		String [] copy = Arrays.copyOf(judos, judos.length);
		System.out.println(Arrays.toString(copy));
		//copy의 일부 요소를 바꿀때 원본 변화 여부 확인 - 복제가 된 것이므로 복제본만 변하고 원본 그대로
		copy[0] = "돌려치기";
		System.out.println(Arrays.toString(judos));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(judos[1].equals(copy[1]));
		
		
		//judos의 데이터 정렬
		//judos는 String
		//
		//java.util.Arrays에 All implemented interfaces comparable<String>으로 comparable 인터페이스 구성 필요없음
		Arrays.sort(judos);
		System.out.println(Arrays.toString(judos));
		

	}		

}
