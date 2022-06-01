package gmail.jaydenkhr.third;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //3개 점수 저장
		int score1 = 90;
		int score2 = 100;
		int score3 = 85;
		
		//3개를 출력하기
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		//묶어서 하나의 이름으로 저장 - 배열
		//배열은 반복문을 이용해서 모든 데이터에 접근할 수 있기 때문에 처리하는 문장 간결함
		//score.length는 총 갯수(3개)
		int [] scores = {90, 100, 85};
		//첫번째 방법
		for(int i=0; i<scores.length; i=i+1) {
			System.out.println(scores[i]);
		}
		//두번째 방법
		for(int score : scores) {
			System.out.println(score);
		}
		
	}

}
