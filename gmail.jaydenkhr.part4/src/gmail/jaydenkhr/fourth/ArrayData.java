package gmail.jaydenkhr.fourth;

public class ArrayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 3개의 문자열을 입력받아서 배열에 저장
	
		//1. 3개의 문자열을 저장할 수 있는 배열을 생성
		//현재는 3개의 공간만 생성 - 데이터는 모두 null
		String [] myApps = new String[3];
		int len = myApps.length;
		
		//2. 배열의 개수만큼 문자열을 입력받아서 배열에 저장
		//기보드로부터 입력받기 위한 인스턴스 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		for(int i=0; i<len; i=i+1) {
			System.out.println("앱 이름 입력:");
			//문자열을 입력받아서 myApps에 순서대로 저장
			myApps[i] = sc.nextLine();
		}
		
		//3. myApps의 모든 데이터를 출력
		for(int i=0; i<len; i=i+1) {
			System.out.println(myApps[i]);
		}
		
		for(String app : myApps) {
			System.out.println(app) ;
		}
		
		//스캐너 연결 해제
		sc.close();
	}

}
