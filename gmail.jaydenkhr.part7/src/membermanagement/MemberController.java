package membermanagement;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {
		// 콘솔로부터 입력받는 객체 만들기
		Scanner sc = new Scanner(System.in);

		//1번 누르면 회원가입
		//2번 누르면 회원탈퇴
		//3번 누르면 회원정보조회
		//4번 누르면 회원정보수정
		//5번 누르면 로그인
		//6번 누르면 로그아웃
		//7번 누르면 종료하기
		//나머지는 잘못 입력했다고 메시지를 출력
		
		final String REGISTER = "1";
		final String OUT = "2";
		final String INFO = "3";
		final String UPDATE = "4";
		final String LOGIN = "5";
		final String LOGOUT = "6";
		final String EXIT = "7";
		//아래 case 별로 변수 대체해서 입력하기 
		
		//작업을 위한 인스턴스 생성
		//MemberServiceImpl이 MemberService를 implements 했으므로
		//아래처럼 작성
		MemberService memberService = new MemberControllerImpl();
		
		//무한반복
		while(true) {
			System.out.print("메뉴 입력:");
			//키보드로부터 문자열 입력받기
			String menu = sc.nextLine();
			//분기
			switch(menu) {
			case REGISTER:
				memberService.memberregister(null);
				break;
			case OUT:
				memberService.memberout(null);
				break;
			case INFO:
				memberService.memberinfo(null, null);
				break;
			case UPDATE:
				memberService.memberupdate(null);
				break;
			case LOGIN:
				memberService.memberlogin(null, null);
				break;
			case LOGOUT:
				memberService.memberlogout();
				break;
			case EXIT:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못된 메뉴 선택");
				break;
			}
			
			if(menu.equals("7")) {
				break;
			}
			
			
		}		
		//스캐너 닫기
		sc.close();

	}

}

