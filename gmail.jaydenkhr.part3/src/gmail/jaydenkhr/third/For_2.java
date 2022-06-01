package gmail.jaydenkhr.third;

public class For_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        //int i,j,k; -맨 아래 예시를 위해 생성
        //for에서 2개의 실행문을 ()안에서 작성할 때는 ,로 구분
        for(i=0, j=0; i<3; i = i+1, j = j+1) {
        	System.out.println("For");
        }
        //for 안의 두번째 조건이 True여야만 아래 실행되는 것이 아닌
        //False여야 아래 실행이 안됨
        for(;;) {
        	System.out.println("무한반복");
        }
        //k가 처음에 거짓이 되서 한번도 수행되지 않음
        //for(;k<1;) {
        //	System.out.println("한번도 수행되지 않음");
     	//unreachable code = 'Dead Code'
	 }

}
