package gmail.jaydenkhr.third;

public class Star {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문 안에 반복문 1개 사용
		//'*****엔터'를 형성
        for(int i=0; i<5; i=i+1) {
        	System.out.print("*");
        }
        System.out.println("");
        
        System.out.println("=====================");
        
        //반복문 안에 반복문 2개 사용
        //*****엔터를 다섯번 형성
        for(int i=0; i<5; i=i+1) {
        	for(int j=0; j<5; j=j+1) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        System.out.println("=====================");
        //*의 개수 점점 하나씩 증가
        //*      0      0
        //**     1      0 1
        //***    2      0 1 2
        //****   3      0 1 2 3
        //*****  4      0 1 2 3 4
        for(int i=0; i<5; i = i+1) {
        	for(int j=0; j<i+1; j=j+1) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        //반대의 경우, 반복문 안의 수식만 변경
        System.out.println("=====================");
        for(int i=0; i<5; i = i+1) {
        	for(int j=0; j<5-i; j=j+1) {
        		System.out.print("*");
        	}
        	System.out.println("");       
     	}
        System.out.println("=====================");
        
        //9,7,5,3,1개 순으로 나타내기
        for(int i=0; i<5; i=i+1) {
        	for(int j=0; j<9-2*i; j=j+1) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        System.out.println("=====================");
        
        //1,2,3,2,1개 순으로 나타내기
        for(int i=0; i<5; i=i+1) {
        	//패턴의 변화가 발생하는 지점을 찾아서 나누어서 작성
        	if(i<3) {
        		for(int j=0; j<i+1; j=j+1) {
        			System.out.print("*");
        		}
        	}else {
        		for(int j=0; j<5-i; j=j+1) {
        			System.out.print("*");
        		}
        	}
        	System.out.println("");
        		}
        	}
        
	}

	

