package gmail.jaydenkhr.tenth;

import java.util.ArrayList;
import java.util.Comparator;

public class DataFrame {

	public static void main(String[] args) {
		//1. DTO 하나의 행인 클래스 생성 
		//2. DataFrame 만들기
		//boolean, byte, short, char, int, long,float, double, String
		//가로 : DTO 클래스
		//세로 : 배열, ArrayList, LinkedList
		ArrayList<DTO> ar = new ArrayList<>();
		
		//3. 데이터 추가
		DTO dto = new DTO();
		dto.setName("KHR");
		dto.setAge(32);
		dto.setTall(166.7);
		
		//마지막에 데이터 추가
		ar.add(dto);
		
		//새로운 데이터를 만들어서 dto에 대입
		dto = new DTO();
		dto.setName("HHM");
		dto.setAge(5);
		dto.setTall(130.5);
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("PBJ");
		dto.setAge(59);
		dto.setTall(161.5);
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("KJY");
		dto.setAge(62);
		dto.setTall(181.5);
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("KWJ");
		dto.setAge(29);
		dto.setTall(173.9);
		ar.add(dto);
		
		//모든 데이터 확인하기
		//List의 toString은 재정의 되어있어도 모든 데이터의 toString을 하나의
		//문자열로 합쳐서 리턴함 - 데이터를 확인하고자 할때 사용
		System.out.println(ar);
		
		//모든 데이터 순회 - 빠른 열거 이용
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
		System.out.println("==================");
		//데이터개수 - size()
		//데이터 1개 가져오기 - get(int index)
		int len = ar.size();
		for(int i=0; i<len; i=i+1) {
			System.out.println(ar.get(i));
		}
		
		//데이터 수정
		//set(int index, Data data)
		//KWJ의 나이를 31로 수정
		dto = new DTO();
		dto.setName("KWJ");
		dto.setAge(31);
		dto.setTall(173.9);
		
		ar.set(4, dto);
		//처음부터 새로 입력
			
		
		System.out.println("================");
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
		//데이터 삭제
		//remove(int index)
		ar.remove(0);
		System.out.println("================");
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		//데이터 정렬
		//sort(Comparator comparator)
		
		ar.sort(new Comparator<DTO>() {
			@Override
			public int compare(DTO arg0, DTO arg1) {
				//return arg0.getName().compareTo(arg1.getName());
				return arg0.getAge() - arg1.getAge();
			}			
		});
		
		System.out.println("=================");
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
		
	}		

}
