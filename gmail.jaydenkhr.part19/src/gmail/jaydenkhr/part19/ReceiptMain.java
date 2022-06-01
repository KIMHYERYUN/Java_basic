package gmail.jaydenkhr.part19;

public class ReceiptMain {

	public static void main(String[] args) {
		MemberDAO dao = MemberDAOImpl.sharedInstance();
		
		/*
		//회원가입 테스트
		Member member = new Member();
		member.setMemberid("90x619");
		member.setMemberpw("900619");
		member.setMembername("김혜련");
		member.setMemberphone("01026089019");
		member.setMemberemail("90x619@gmail.com");
		member.setMembernickname("하롱베이");
		member.setMemberaddr("서울시 양천구");
		member.setMembercardnumber(12345678);
		
		//데이터 삽입 메서드 호출
		int r = dao.memberregister(member);
		if(r>0) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		*/
		
		/*
		//id 존재하는지 확인
		String result = dao.idcheck("90x619");
		System.out.println(result);
		
		result = dao.idcheck("admin");
		System.out.println(result);
		*/
		
		/*
		//nickname 존재하는지 확인
		String result = dao.nicknamecheck("하똥");
		System.out.println(result);
		*/
		/*
		result = dao.nicknamecheck("하롱베이");
		System.out.println(result);
		*/
		
		//로그인 테스트: 맞는 아이디와 비밀번호를 입력하면 nickname이 리턴되고
		//잘못 입력하면 null 이 리턴됨
		
		/*
		//로그인 테스트 : 아이디, 비밀번호 입력시 nickname 리턴되고 잘못입력하면 null이 리턴됨
		String result = dao.login("90x619", "1234");
		System.out.println(result);
		
		result = dao.login("90x619", "900619");
		System.out.println(result);
		*/
		
		/*
		Member result = dao.getMember("하롱베이");
		System.out.println(result);
		result = dao.getMember("하똥");
		System.out.println(result);
		*/
		
		/*
		//회원정보수정
		Member member = new Member();
		member.setMemberid("jaydenkhr");
		member.setMemberpw("1033639");
		member.setMembername("제이든");
		member.setMemberphone("01031767727");
		member.setMemberaddr("서울양천");
		
		int r = dao.membermodify(member);
		if(r>=0) {
			System.out.println("데이터 수정 성공");
		}else {
			System.out.println("데이터 수정 실패");
		}
		*/
		
		//회원정보 삭제
		Member member = new Member();
		member.setMembernickname("하롱베이");
		
		int r = dao.memberdelete(member);
		if(r>=0) {
			System.out.println("데이터 삭제 성공");
		}else {
			System.out.println("데이터 삭제 실패");
		}
	}
}
