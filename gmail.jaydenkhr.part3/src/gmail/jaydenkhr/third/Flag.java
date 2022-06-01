package gmail.jaydenkhr.third;

public class Flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //2가지 상태 번갈아 가면서 10번 수행하기
		boolean flag = true;
		for(int i=0; i<10; i=i+1) {
			if(flag == true) {
				System.out.println("깃발 들어");
			}else {
				System.out.println("깃발 내려");
			}
			flag = !flag; //true와 false를 번갈아가면 flag 저장
		}
		//////////////////////////////////////////////////////
		
		//인덱스 변수를 인용해서 반복문이 끝까지 수행되었는지 확인
		//j 5까지 올라오므로 마지막 숫자 출력
		int j;
		for(j=0;j<5; j=j+1) {
			System.out.println("반복문이 마지막까지 했는지 확인");
		}
	    System.out.println(j);
	    
	    int k;
	    for(k=0;k<5;k=k+1) {
	    	if(k % 4 ==1) {
	    		break;
	    	}
	    	System.out.println("반복문이 마지막까지 했는지 확인");
	    	}
	    System.out.println(k);
	
	    // 변수를 이용해서 반복문의 중단 여부를 판단

        boolean f = true;
	    int l;
	    for(l=0; l<5; l=l+1) {
	    	if(l % 4 == 10) {
	    		f = false;
	    		break;
	    	}
	    	System.out.println("반복문이 마지막까지 했는지 확인");
	    }
	    
	    if(f == true) {
	    	System.out.println("중간에 반복문을 멈추지 않았음");
	    }else {
	    	System.out.println("중간에 반복문을 중단했습니다.");
	    }
	
	}
}

