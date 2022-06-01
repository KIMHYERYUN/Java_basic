package gmail.jaydenkhr.tenth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		//Key는 String으로 하고 Value는 Object로 하는 HashMap을 생성
		//Value를 Object로 하는 이유는 Object에는 모든 종류의 데이터를 대입할 수 있기 대문에
		//대신에 Object로 된 데이터는 출력을 할 때를 제외하고는 강제 형 변환을 통해서
		//원래의 자료형으로 되돌려서 사용해야함
		//1.HashMap 생성
		HashMap<String, Object> map = new HashMap<String, Object>();

		//2.데이터저장
		map.put("name", "KHR");
		map.put("age", 30);
		map.put("number", "01026089019");
		map.put("address", "서울시 양천구");
		map.put("tall", 167.5);
		map.put("age", 32);		//age 데이터에 다시 저장
		
		//3.데이터 꺼내기
		String name = (String)map.get("name");  //(String)으로 강제형 변환
		int age = (Integer)map.get("age");
		String number = (String)map.get("number");
		String address = (String)map.get("address");
		double tall = (Double)map.get("tall");
		
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("전화번호:" + number);
		System.out.println("주소:" + address);
		System.out.println("키:" + tall);
		
		//4.데이터 추가
		map.put("song","가을타나봐");
		map.put("food","콩국수");
		//map.put("car",{"랭글러", "모하비"});  //배열도 삽입할 수 있따
		//배열 생성 및 초기화
		String [] cars = {"랭글러", "모하비"};
		//map<key형, 배열혈[]>mapName = new HashMap<>;
		map.put("cars", cars[0]);
	
		
		//4-1.데이터 꺼내고 출력
		String song = (String)map.get("song");
		String food = (String)map.get("food");
		
		
		System.out.println("노래:" + song);
		System.out.println("음식:" + food);
		System.out.println("갖고싶은 차:" + Arrays.toString(cars));

		//5.toString 메서드 : 각각 요소의 toString 메서드를 호출한 결과
		System.out.println(map);
		
		//6. 없는 key를 사용하면 null 리턴
		System.out.println(map.get("hobby"));
		
		//7.데이터삭제
		//map.remove("car");
		map.put("car", null);
		//get으로 꺼내면 null 이기 때문에 지운것으로 간주
		//지운것처럼 보이지만 남아있다
		System.out.println(map);
		
		//8.전데 데이터 순회 - key의 이름을 기억하지 않아도 된다.
		Set<String> keys = map.keySet(); //모든 key를 가져온다.
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}