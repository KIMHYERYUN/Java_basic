package gmail.jaydenkhr.third;

public class For_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // "Hello World"를 3번 출력
		int i = 0 ; 
	    while(i<3) {
	    	System.out.println("Hello World");
	    	i = i + 1;
	    }
	    System.out.println("====================");
	    
	    //for을 이용해서 동일한 내용 작성
	    for(int j=0; j<3; j=j+1) {
	    	System.out.println("Hello World");	    	
	    }
	    
	    System.out.println("====================");
	    
	    //image1.png, image2.png, image3.png를 for를 이용해서 출력
	    for(int k=1; k<4; k=k+1) {
	    	System.out.println("image" + k + ".png");
	    }//기존의 변수 재사용 가능 : for 안에서만 변수 적용하기 때문에
	    //위 i는 사용 불가 : 같은 영역이기 때문에
	    for(int k=0; k<3; k=k+1) {
	    	System.out.println("image" + (k+1) + ".png");
	    }
	}

}
