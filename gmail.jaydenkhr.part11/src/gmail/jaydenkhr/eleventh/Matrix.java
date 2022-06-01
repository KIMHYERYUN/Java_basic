package gmail.jaydenkhr.eleventh;

import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
		//여자배구 선수 명단을 팀별로 저장
		//여러 개의 팀이 존재하고 각 팀에는 여러 명의 선수가 존재
		
		//각 팀 선수 명단
		String [] kixx = {"강소휘", "김지원", "오세연", "문지윤"};
		String [] hillstate = {"고예림", "김가영", "야스민", "김연견", "한미르"};
		String [] altos = {"최수빈", "라샘", "김하경", "조송화"};
		
		//2개의 배열을 하나의 배열로 생성 - 동일한 성격을 갖는 데이터는 하나로 관리
		String [][] volleyballs = {kixx, hillstate, altos};
				
		//데이터 출력 - 팀 선수 명단을 줄 단위로 출력

		//구분할 수 있게 팀이름 작성
		for(int i=0; i<volleyballs.length; i=i+1) {
			String [] players = volleyballs[i];
			
			if(i == 0) {
				System.out.print("GS 칼텍스:" + "\t");
			}else if(i ==1) {
				System.out.print("현대건설:" + "\t");
			}else {
				System.out.print("IBK 기업은행:" + "\t");
			}
		
			//위 대신 아래것을 사용하면 순서를 모르게됨
			//for(String [] players : volleyballs) {
			for(String player : players) {
				System.out.print(player + "\t");
			}
			System.out.println();
		}
		System.out.println("=======================");
		//변할 가능성이 있는 데이터를 2차원 배열로 만드는 것은 바람직하지 못함
		//1차원 배열과 배열의 특징을 나타내는 속성을 MAP으로 묶고
		//이 MAP을 배열로 묶어주는 것을 권장함
		
		Map<String, Object> map1 = new HashMap<>();
		//팀 이름을 나타내는 속성
		map1.put("name", "GS 칼텍스");
		//실제 데이터를 나타내는 속성
		map1.put("data", kixx);
		
		Map<String, Object> map2 = new HashMap<>();
		//팀 이름을 나타내는 속성
		map2.put("name", "현대건설");
		//실제 데이터를 나타내는 속성
		map2.put("data", hillstate);
		
		Map<String, Object> map3 = new HashMap<>();
		//팀 이름을 나타내는 속성
		map3.put("name", "IBK 기업은행");
		//실제 데이터를 나타내는 속성
		map3.put("data", altos);

		//일차원 배열을 Map에 저장한 후 다시 배열을 만들기
		//Map 안에 데이터의 특징을 저장할 수 있기 때문에
		//배열의 데이터가 변경이 되더라도 출력 부분을 수정할 필요가 없다.
		Map [] maps = {map1, map2, map3};
		
		for(Map map : maps) {
			System.out.print(map.get("name") +"\t");
			//배열 꺼내기
			String [] ar = (String [])map.get("data");
			for(String player : ar) {
				System.out.print(player + "\t");
			}
			System.out.println();
			
		}
	}

}
