package gmail.jaydenkhr.third;

public class FibonacciNumber_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 순으로 행렬
		//첫번째 수와 두번째 수는 무조건 1
		//세번째 수부터는 앞의 2개의 수를 더한 값
        //12번째 수는?
		
		//12번째 피보나치 수열의 값을 저장할 변수
		int fibo=1;
		
		//이전 2개 항의 값을 저장할 변수 -초기값
		int n_1 = 1;
		int n_2 = 1;
		
		//3번째부터 규칙 적용	
		for(int n=3; n<=12; n=n+1) {
			//이전 2개 항의 합을 가지고 다음 항의 값 결정
			fibo = n_1 + n_2;
		    //바로 이전 항의 값을 그 이전 항에 대입
		    n_1 = n_2;
		    //계산된 결과를 이전항에 대입
		    n_2 = fibo;
	}

	System.out.println(fibo);

	}

}
