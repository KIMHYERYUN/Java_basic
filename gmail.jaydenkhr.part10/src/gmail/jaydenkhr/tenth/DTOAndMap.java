package gmail.jaydenkhr.tenth;

import java.util.LinkedHashMap;
import java.util.Set;

public class DTOAndMap {

	public static void main(String[] args) {
		//1.데이터 생성
		DTO dto = new DTO();
		dto.setName("KHR");
		dto.setAge(32);
		
		//데이터 출력 - DTO는 반복문을 사용할 수 없음
		System.out.println("이름:" + dto.getName());
		System.out.println("나이:" + dto.getAge());
		
		LinkedHashMap<String, Object> map =
				new LinkedHashMap<String, Object>();
		map.put("name", "김혜련");
		map.put("age", 32);
		
		//dto 대신 map을 쓴 이유 : 19~20열 이름 정하기
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}

	}

}
