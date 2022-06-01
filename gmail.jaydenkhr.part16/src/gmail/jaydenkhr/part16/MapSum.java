package gmail.jaydenkhr.part16;

import java.util.HashMap;
import java.util.Map;

public class MapSum {

	public static void main(String[] args) {
		//1 - 50
		//2 - 39
		//1 - 80
				
		Map <String, Integer> map = new HashMap<String, Integer>();
		//1번이 있는지 없는지 확인
		Integer i = map.get("1");
		if(i == null) {
			map.put("1", 50);
		}else {
			map.put("1", i+50);
		}
		
		i = map.get("2");
		if(i == null) {
			map.put("2", 39);
		}else {
			map.put("2", i+39);
		}
		
		i = map.get("1");
		if(i == null) {
			map.put("1", 80);
		}else {
			map.put("1", i+80);
		}
		
		System.out.println(map);

		
		
	}

}
