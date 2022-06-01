package gmail.jaydenkhr.fourth;

public class ArrayCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 처음부터 데이터를 가지고 생성하기
		//점수(실수) 3개를 배열로 저장하기
		double [] scores = {90.5, 80, 91.7};
		
		//이름 3개를 배열로 저장하기
		String [] names = {"KIM", "PARK", "HUR"};
		
		//출력하기
        System.out.println(names);
		
		//2.데이터 접근
		//scores의 데이터 개수(.length)를 확인
		System.out.println("scores의 개수:" + scores.length);
		//names의 데이터 개수(.length)를 확인
		System.out.println("names의 개수:" + names.length);
		//세부 데이터 접근
		//scores의 2번째 데이터를 확인
		System.out.println("scores[1]: "+scores[2]);
		//names의 0번째 데이터를 확인
		System.out.println("names[0]: "+names[0]);

		//인덱스 오류 = java.lang.ArrayIndexOutOfBoundsException
		//System.out.println("scores[3]:" + scores[3]);
		
		//이름이 없어서 발생하는 오류
		//System.out.println(kors.length);
		
		//NullPointerException - 세부데이터가 없어서 발생하는 예외
		//int [] kors = null;
		//System.out.println(kors.length);
		
		
		//3. 전체 데이터 접근
		
		//1) 인덱스를 상수 형태로 직접 작성 - 데이터가 많아지면 사용하는 것이 불가능
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		//2) 일반적인 반복문을 이용한 방법 - 상수를 이용하는 방법
		///-1. for 이용
		for(int i=0; i<3; i=i+1) {
			System.out.println(names[i]);
		}
		///-2. while 이용
		int i = 0;
		while(i<3) {
			System.out.println(names[i]);
			i = i + 1;
		}
		
		//아래 방법은 데이터의 갯수가 바뀌더라도 자동수정 가능
		//3) 일반적인 반복문을 이용한 방법 - 반복횟수를 데이터 개수로 이용하는 방법
	    for(int j=0; j < names.length; j=j+1) {
	    		System.out.println(names[j]);
		}
	    
	    //4) 일반적인 반복문을 이용한 방법 - 데이터 개수를 변수에 저장해서 이용하는 방법
	    //데이터 개수를 변수에 저장
	    //3번 방법보다 4번 선호
	    //names.length에 비해서 names의 과정을 거치지 않아 메모리 접근 횟수가 줄어서 속도가 빠름
	    int len = names.length;
	    for(int j=0; j<len; j=j+1) {
	    	System.out.println(names[j]);
	    }
	    
	    //5) 빠른 열거를 이용하는 방법 : 경유지 없이 출력
	    //빠른 열거는 이전에 접근했던 위치에서 접근
	    //names의 데이터를 순서대로 name에 대입해서 사용
	    for(String name : names) {
	    	System.out.println(name);
	    }
	}
	}



