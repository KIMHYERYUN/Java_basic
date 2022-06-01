package gmail.jaydenkhr.third;

public class ConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //키보드로 입력받을 수 있는 인스턴스 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//문자열 입력받기
		System.out.print("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("이름: " +name);
		
		//정수 입력받기
		System.out.print("점수를 입력하세요");
		int score = sc.nextInt();
		System.out.println("점수: "+score);
		
		//숫자에서 문자열 넘어갈 시 버퍼 생성
		//숫자 입력을 받고 문자열을 입력받을 때는 nextLine 추가
	    sc.nextLine();
		//문자열 입력받기
		System.out.print("별명을 입력하세요");
		String nick = sc.nextLine();
		System.out.println("이름: " +nick);
		
		
		sc.close();
	}

}
