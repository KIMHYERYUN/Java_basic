package gmail.jaydenkhr.eleventh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataFrameMapUse {

	public static void main(String[] args) {
		//Map을 이용해서 하나의 행을 표현하면 DTO클래스가 필요없음
		//여기서 주의할점은 KEY를 문자열로 작성하기 때문에 KEY이름을 정확하게 기억해야 한다
		//get을 이용해서 가져온 후 사용할 때 강제형변환을 해주어야 한다
		List<Map<String, Object>> list = 
				new ArrayList<>();
		
		//1개의 데이터를 생성해서 추가하기
		Map<String, Object> map = new HashMap<>();
		map.put("store", "나이키");
		map.put("month", 10);
		map.put("date", 13);
		map.put("day", '화');
		map.put("count", 1);
		map.put("item", "런닝조끼");
		map.put("unitprice", 59000);
		map.put("cardnumber", 1298739300897609L);
		map.put("howtopay", "3개월할부");
		map.put("pointnumber", 700901);
		list.add(map);
		
		map = new HashMap<>();
		map.put("store", "윌슨");
		map.put("month", 10);
		map.put("date", 27);
		map.put("day", '일');
		map.put("count", 2);
		map.put("item", "테니스라켓, 테니스공");
		map.put("unitprice", 170000);
		map.put("cardnumber", 9087128389872637L);
		map.put("howtopay", "6개월할부");
		map.put("pointnumber", 12083);
		list.add(map);
		
		
		map = new HashMap<>();
		map.put("store", "편의점");
		map.put("month", 10);
		map.put("date", 27);
		map.put("day", '일');
		map.put("count", 3);
		map.put("item", "건전지, 녹차아이스크림, 요거트");	
		map.put("unitprice", 14000);
		map.put("cardnumber", 9087128389872637L);
		map.put("howtopay", "일시불");
		map.put("pointnumber", 26089019);
		list.add(map);
	
		
		//전체 데이터 출력하기
		for(Map<String, Object> temp : list) {
			//Map에 저장된 데이터를 출력할 때는 get으로 꺼내 그대로 사용하면 된다
			System.out.println(temp.get("store") + ":" + temp.get("item"));
		}
		
		System.out.println("====================");
		//일부 데이터 출력하기
		//현재 출력 중인 데이터 번호를 저장할 인덱스 변수 생성
		int i=0;
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		//무한 반복문 생성
		while(true) {
			//페이지당 2개씩 출력할 것이라서 +2
			int size = i + 2;		
			
			for(; i<size; i=i+1) {
				//데이터의 인덱스가 list의 데이터 개수와 같아지면 더 이상 읽을 필요 없음
				if(i == list.size()) {
					break;
				}
				System.out.println(list.get(i));
			}
			//무한 반복문 종료
			if(i == list.size()) {
				break;
			}
			//다음 데이터 입력받기
			System.out.println("다음 페이지 데이터는 ENTER를 누르면 보여집니다.");
			sc.nextLine();
			}
		
		//무한 반복문 종료
		System.out.println("===============");
		System.out.println("데이터 1개 가져오기");
    	System.out.println(list.get(0));
		

		//map 안에 있는 store 오름차순 정렬
		list.sort(new Comparator<Map<String, Object>>(){		
			@Override
			public int compare(
				Map<String, Object> o1, Map<String, Object> o2) {
				//이렇게 내부 데이터를 다른 용도로 사용할 때는 형 변환해서 사용
				String front = (String)o1.get("Store");
				String back = (String)o2.get("Store");
				return front.compareTo(back);
				}
		});
		for(Map<String,Object> temp : list) {
			System.out.println(temp.get("Store"));
		}
	}
}
