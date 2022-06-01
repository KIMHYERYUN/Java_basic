package gmail.jaydenkhr.part19;

public interface MemberDAO {
	//회원가입 
	
	//아이디 중복확인
	//아이디를 매개변수로 받아서 존재여부를 리턴
	//데이터 존재하면 자신의 데이터를 리턴하고 존재하지 않으면 null을 리턴
	public String idcheck(String id);
	
	//별명 중복확인
	//데이터 존재하면 자신의 데이터를 리턴하고 존재하지 않으면 null을 리턴
	public String nicknamecheck(String nickname);

	//회원가입 - 데이터 추가
	//추가하기 위해서는 DTO나 Map을 매개변수를 주고 리턴은 void, boolean, int가 가능
	//실패 가능성이 전혀 없다면 void(유효성 검사를 철저히 해서 삽입)
	//성공과 실패 여부만을 알려주고자 하면 boolean
	//영향받은 행의 개수를 알려주고자 하면 int - 데이터베이스 리턴값	
	public int memberregister(Member member);
	
	//로그인 처리
	//아이디와 비밀번호를 입력받아서 구별되는 정보를 리턴
	//별명을 리턴하기도 하고 아이디를 리턴하기도 함
	//여기서 리턴받은 데이터를 메모리에 저장해서 로그인 여부를 판단하고 자신의 데이터를 가져옴
	public String login(String id, String password); 

	//회원정보 가져오기(id, nickname return 타입 선택)
	public Member getMember(String nickname);
	
	//회원정보 수정
	//전체 데이터 정보를 받아서 기본키나 unique한 속성을 가지고 나머지를 수정
	public int membermodify(Member member);
	
	//회원정보 삭제
	//삭제는 삽입과 수정작업과 리턴타입은 동일하나 매개변수는 DTO를 사용하기도 하고
	//primary key나 unique한 속성을 이용하기도 함
	public int memberdelete(Member member);
	
	//삽입, 삭제, 수정 모양은 비슷하다
	//public int  이름(Member member);
	//조회
	//public String 이름(Mmeber id);
	//가져오기
	//public Member getMmember(String)
}
