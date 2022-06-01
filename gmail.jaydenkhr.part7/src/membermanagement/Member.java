package membermanagement;

public class Member {
	private String memeberid;
	private String membername;
	private String memberpassword;
	private String membernickname;
	private int memberage;
	private String memberphone;
	
	
	public String getMemeberid() {
		return memeberid;
	}
	public void setMemeberid(String memeberid) {
		this.memeberid = memeberid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberpassword() {
		return memberpassword;
	}
	public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	}
	public String getMembernickname() {
		return membernickname;
	}
	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}
	public int getMemberage() {
		return memberage;
	}
	public void setMemberage(int memberage) {
		this.memberage = memberage;
	}
	public String getMemberphone() {
		return memberphone;
	}
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}
	

}




//회원정보 - 데이터 탕비, 중복, 필수, 길이, 제약조건, 기본값
//아이디-문자열, 중복불가능, 필수, 30자이내
//이름-문자열,중복가능,필수,30자이내
//비밀번호-문자열,중복가능,필수,30자이내
//별명-문자열, 중복불가능, 필수, 30자이내
//생년월일-정수, 중복가능, 필수, 정수, 8자
//전화번호-문자열, 중복가능, 선택, 11자 이내


//필요한 작업 - 작업이름, 입력/출력 데이터
//회원가입 - 회원정보, 성공과 실패 - boolean
//회원탈퇴 - 회원비밀번호, 성공과 실패 - boolean
//회원정보조회 - 회원아이디와 비밀번호, 회원정보 1개
//회원정보수정 - 회원정보, 성공과 실패 - boolean
//로그인 - 아이디와 비밀번호, 성공과 실패 - boolean
//로그아웃 - 입력정보 없음, 없음



