package gmail.jaydenkhr.tenth;

import java.util.Arrays;
import java.util.Comparator;

public class DTOMain {

	public static void main(String[] args) {
		//DTO 클래스의 인스턴스 4개를 저장할 수 있는 배열을 생성
		DTO [] ar = new DTO[4];
		
		ar[0] = new DTO();
		ar[0].setName("KHR");
		ar[0].setAge(32);
		ar[0].setTall(166.7);
		
		ar[1] = new DTO();
		ar[1].setName("HHM");
		ar[1].setAge(32);
		ar[1].setTall(165);
		
		ar[2] = new DTO();
		ar[2].setName("KJY");
		ar[2].setAge(62);
		ar[2].setTall(181.4);
		
		ar[3] = new DTO();
		ar[3].setName("PBJ");
		ar[3].setAge(59);
		ar[3].setTall(162.7);
		
		//배열의 데이터 출력
		//System.out.prinln(Array.toString(ar));
		for(DTO dto : ar) {
			System.out.println(dto);
		}
		
		
		//배열의 데이터 정렬은 Arrays.sort 메서드에
		//배열을 대입하고 Comparator 인터페이스를 이용해서 원하는 비교 메서드를
		//구현하면 배열의 데이터가 정렬이 됩니다.
		
		Arrays.sort(ar, new Comparator<DTO>() {
			@Override
			//나이를 가지고 오름차순
			//내림차순일경우 순서를 바꿈(숫자만), 이름은 compare
			public int compare(DTO o1, DTO o2) {
				return o1.getAge() - o2.getAge();
			}	
		});	
		System.out.println("=================");
		for(DTO dto : ar) {
			System.out.println(dto);
		}

	}

}
