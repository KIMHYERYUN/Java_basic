package gmail.jaydenkhr.fourth;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 정수 5개를 저장하는 배열을 생성 - 초기값을 임의로 부여
		int [] numbers = {90, 86, 100, 13, 1};
		//이 부분을 키보드로부터 입력받는 코드로 변경
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//2. 모든 데이터를 순회하면서 출력하기
		//90 86 100 13 1 형태로 출력 - 줄바꿈은 마지막에 하도록 함
		for(int num : numbers) {
		    System.out.print(num + "\t");	
		}
			System.out.println("");
		//3.선택정렬(Selection)
		//첫번째 자리부터 마지막 -1까지 데이터를
	    //첫번째 자리부터 마지막 -1까지 데이터를 출력
		//int len = numbers.length;
	    //for(int i=0; i<len-1; i=i+1) {
		//System.out.print(numbers[i] + "\t");
		//}			
		//System.out.println("--------------------------");
		//전체가 필요하지 않거나 인덱스가 필요할 때는 빠른 열거를 사용하면 안된다.
		int len = numbers.length;
		//첫번째 자리부터 마지막 -1까지
		for(int i=0; i<len-1; i=i+1) {
			//뒤에 있는 모든것
			for(int j=i+1; j<len; j=j+1) {
				//자신의 데이터와 뒤에있는 데이터를 비교해서 자신이 더 크면
				if(numbers[i] > numbers[j]) {  //부호 바뀌면 내림차순
					//데이터 위치를 교환 - swap
					int temp = numbers[j];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					//빈컵에 콜라넣고 콜라컵에 사이다넣고 사이다컵에 콜라
				}
		    }
		
		}
		
		//4. 정렬된 데이터를 출력
		//모든 데이터를 출력
		for(int imsi : numbers) {
			System.out.print(imsi + "\t");
		}
		System.out.println("");
	
		sc.close();
	}

}
