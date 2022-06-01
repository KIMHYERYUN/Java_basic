package gmail.jaydenkhr.third;

public class Etc_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	    int i = 1;
	    while(i<11) {
	    	System.out.println("반복1");
		    i = i+1;
	    }
		//for로 해결
		for(int j=1; j<11; j=j+1) {
			//3의 배수가 되면 반복문 종료
			//3이 되면 반복문을 더이상 수행하지 않고 종료
			//따라서 1,2 두번 반복
			if(j%3==0) {
				break;
			}
			System.out.println("반복2");
		}
		
		System.out.println("=========================");
		
		
		for(int j=1; j<11; j=j+1) {
			//3의 배수가 되면 더 이상 내용을 수행하지 않고 다음 반복으로 이동
			//3의 배수가 되면 아래 문장을 수행하지 않기 때문에 출력이 되지 않음
			if(j % 3 == 0) {
				continue;
			}
			System.out.println(j);
		}
	}

}
