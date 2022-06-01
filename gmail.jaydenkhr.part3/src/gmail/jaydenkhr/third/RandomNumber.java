package gmail.jaydenkhr.third;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //랜덤 인스턴스 생성
		java.util.Random r = new java.util.Random();
		//1부터 45의 숫자를 6번 가져옴
		for(int i=0; i<6; i=i+1) {
			int x = r.nextInt(45);
			System.out.println(x+1);
		}
		//아무숫자를 6번 가져옴
		for(int i=0; i<6; i=i+1) {
			int x = r.nextInt();
			System.out.println(x+1);
	}

}
}
