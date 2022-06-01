package gmail.jaydenkhr.part15;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMain {

	public static void main(String[] args) {
		/*
		//JSON Object
		String json = "{\"name\":\"khr\", \"age\":32}";
		//문자열 전체를 JSON으로 변환
		JSONObject obj = new JSONObject(json);
		//System.out.println(obj);
		String name = obj.getString("name");
		int age = obj.jetInt("age");
		System.out.print(name);
		System.out.print(age);
		*/
		
		/*
		//정수 배열로 만들어진 json 문자열
		String json1 = "[10, 30, 20]";
		
		JSONArray ar = new JSONArray(json);
		//배열은 반복문을 수행
		for(int i=0; i<ar.length(); i=i+1) {
			//i번째 데이터를 정수로 가져오기
			int su = ar.getInt(i);
			System.out.println(su);
		}
		*/
		
		
		String json = "{\"count\":20, \"list\":[\"name\":\"khr\", \"name\":\"hhm\"]}";
		//객체 - {count:20, list[{name:khr},{name:hhm}]};
		
		JSONObject obj = new JSONObject(json);
		//count는 정수이므로 바로 읽을 수 있음
		int count = obj.getInt("count");
		System.out.println(count);
		
		//list는 대괄호가 되어 있음
		JSONArray list = obj.getJSONArray("list");
		
		//배열순회
		for(int i=0; i<list.length(); i=i+1) {
			//배열의 요소들을 객체로 가져오기
			JSONObject temp = list.getJSONObject(i);
			//name 키의 데이터를 문자열로 가져오기
			String name = temp.getString("name");
			System.out.println(name);
		}
		
	}

}
