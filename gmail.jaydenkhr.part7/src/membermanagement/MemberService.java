package membermanagement;

public interface MemberService {
	//회원가입을 위한 처리
	//public 리턴타입 이름(매개변수);
	public boolean memberregister(Member member);
    //회원탈퇴를 위한 처리
	//public 리턴타입 출력이름(매개변수) ;
	public boolean memberout(String password);
	//회원정보조회를 위한 처리
	public Member memberinfo(String id, String password);
	//회원정보수정을 위한 처리
	public boolean memberupdate(Member member);
	//로그인을 위한 처리
	public boolean memberlogin(String id, String password);
	//로그아웃을 위한 처리
	public void memberlogout();
	


}
//필요한 작업 - 작업이름, 입력/출력 데이터
//회원가입 - 회원정보, 성공과 실패 - boolean
//회원탈퇴 - 회원비밀번호, 성공과 실패 - boolean
//회원정보조회 - 회원아이디와 비밀번호, 회원정보 1개
//회원정보수정 - 회원정보, 성공과 실패 - boolean
//로그인 - 아이디와 비밀번호, 성공과 실패 - boolean
//로그아웃 - 입력정보 없음, 없음
