package gmail.jaydenkhr.part19;

//서버에서 작업을 처리하는 클래스는 인스턴스가 1개만 필요하기 때문에 singletonepattern으로 디자인
public class MemberDAOImpl extends DAO implements MemberDAO {
	//singleton 패턴을 위한 코드
	//프레임워크를 이용하면 자동으로 처리
	private static MemberDAO memberDAO;
	
	private MemberDAOImpl() {}
	
	public static MemberDAO sharedInstance() {
		if(memberDAO == null) {
			memberDAO = new MemberDAOImpl();
		}
		return memberDAO;
	}
	@Override
	public String idcheck(String id) {
		//null이 리턴되면 존재하지 않은 아이디이고 null이 아닌 데이터가 리턴되면 존재하는 아이디
		String result = null;
		try {
			//실행할 SQL 생성 - 중복검사는 매개변수가 존재하는지 확인할 수 있는 SQL 생성
			pstmt = con.prepareStatement("select id from member where id=?");
			//데이터 바인딩
			pstmt.setString(1, id);
			
			//select 구문 실행
			rs = pstmt.executeQuery();
			
			//검색된 내용이 0개 이상이면 while 1개 또는 0개이면 if를 이용
			if(rs.next()) {
				result = rs.getString("id");
			}
			rs.close();
			pstmt.close();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

	@Override
	public String nicknamecheck(String nickname) {
		String result = null;
		try {
			pstmt = con.prepareStatement("select nickname from member where nickname=?");
			pstmt.setString(1, nickname);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getString("nickname");
			}	
			rs.close();
			pstmt.close();			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

	@Override
	public int memberregister(Member member) {
		int result = -1;
		try {
			pstmt = con.prepareStatement("insert into member(memberid, memberpw, membername, memberphone, memberemail, membernickname, memberaddr, membercardnumber) " + "values(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, member.getMemberid());
			pstmt.setString(2, member.getMemberpw());
			pstmt.setString(3, member.getMembername());
			pstmt.setString(4, member.getMemberphone());
			pstmt.setString(5, member.getMemberemail());
			pstmt.setString(6, member.getMembernickname());
			pstmt.setString(7, member.getMemberaddr());
			pstmt.setInt(8, member.getMembercardnumber());
			
			//select 이외의 구문 실행
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		return result;
	}

	@Override
	public String login(String id, String password) {
		String result = null;
		try {
			//sql 생성
			//id와 password가 일치하는 nickname을 찾아오는 SQL
			pstmt = con.prepareStatement("select membernickname from member where memberid=? and memberpw=?");
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			//sql 실행
			rs = pstmt.executeQuery();
			//리턴되는 데이터가 있으면 읽어서 result 저장
			if(rs.next()) {
				result = rs.getString("membernickname");
			}
			
			rs.close();
			pstmt.close();
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

	@Override
	public Member getMember(String nickname) {
		Member member = null;
		try {
			//nickname을 가지고 모든 정보 찾아오는 SQL
			pstmt = con.prepareStatement("select * from member where nickname = ?");
			
			pstmt.setString(1, nickname);
		
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setMemberid(rs.getString("memberid"));
				member.setMemberpw(rs.getString("memberpw"));
				member.setMembername(rs.getString("membername"));
				member.setMemberphone(rs.getString("memberphone"));
				member.setMemberemail(rs.getString("memberemail"));
				member.setMembernickname(rs.getString("membernickname"));
				member.setMemberaddr(rs.getString("memberaddress"));
				member.setMembercardnumber(rs.getInt("membercardnumber"));
			}
			rs.close();
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return member;
	}

	@Override
	//데이터를 구별할 수 있는 속성(primary key, not null 이면서 unique) 조건으로 해서 나머지 데이터 수정
	//매개변수가 DTO가 되고
	//리턴타입은 정수(영향받은 행의 개수), boolean(성공과 실패 여부), void(실패가 없는 경우) 중 하나
	//DAO에서는 int 리턴하고 service에서는 boolean으로 리턴
	//전자정부 프레임워크의 기본 리턴 타입은 void
	//추가, 삭제, 수정 : -1의 값 기억!
	public int membermodify(Member member) {
		int result = -1;
		try {
			//sql 생성
			pstmt = con.prepareStatement("update member set memberpw=?, membername=?, memberphone=?, memberaddr=?"+"where memberid=?");
			//?값 바인딩
			pstmt.setString(1, member.getMemberpw());
			pstmt.setString(2, member.getMembername());
			pstmt.setString(3, member.getMemberphone());
			pstmt.setString(4, member.getMemberaddr());
			pstmt.setString(5, member.getMemberid());
			
			//sql 실행
			result = pstmt.executeUpdate();
			//메모리정리 작성
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

	@Override
	public int memberdelete(Member member) {
		int result = -1;
		try {
			//sql 생성
			pstmt = con.prepareStatement("delete from member where membernickname=?");
			
			//?값 바인딩
			pstmt.setString(1, member.getMembernickname());
			
			//sql 실행
			result = pstmt.executeUpdate();
		
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

}
