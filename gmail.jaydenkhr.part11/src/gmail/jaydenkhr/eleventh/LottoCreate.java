package gmail.jaydenkhr.eleventh;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoCreate {

	public static void main(String[] args) {
		//랜덤한 1~45까지의 숫자 6개를 저장해서 순서대로 출력
		//6개의 중복되지 않은 데이터를 저장하기에 가장 알맞은 자료구조를 생성
		//배열, List, Set, Map 중에 선택
		
		//배열이나 List를 선택하면 중복된 데이터 허용 -> 중복검사 필요, 저장여부 결정
		
		//Set은 데이터 중복 허용 안하므로 적합
		//Set에는 아래 3가지 경우
		//HashSet(무작위), LinkedHashSet(순서대로), TreeSet(크기를 기억)
		
		Set<Integer> lotto = new TreeSet<>();
		//랜덤한 데이터를 추출하기 위한 인스턴스 생성
		Random r = new Random();
		//Set의 데이터 개수가 6보다 작다면 수행
		while(lotto.size()<6) {
			//1부터 45사이의 랜덤한 숫자를 set에 추가
			//동일한 숫자가 있으면 추가되지 않음
			lotto.add(r.nextInt(45)+1);
		}
		//데이터를 순회하면서 출력
		for(Integer su : lotto) {
			System.out.println(su);
		}

	}

}
