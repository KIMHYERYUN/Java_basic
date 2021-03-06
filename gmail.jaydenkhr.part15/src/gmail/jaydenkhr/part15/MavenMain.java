package gmail.jaydenkhr.part15;

public class MavenMain {

	public static void main(String[] args) {
		//MySQL 연동을 위한 라이브러리를 로드하는 프로그램
		System.out.println("MySQL JDBC 로드하기");
		try {
			//MySQL 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MySQL 드라이버 로드 성공");
		}catch(Exception e) {
			System.out.println("MySQL 드라이버 로드 실패");
			System.out.println(e.getLocalizedMessage());
			//프로그램 종료
			System.exit(0);;
		}
		//pom.xml 생성 전 -> 예외처리
		//프로젝트 우측마우스 [configure] - [convert to Maven Project]로 pom.xml 생성
		//build 태그 아래 작성
		//<dependencies> 추가
		//mvnrepository.com에서 mysql 검색 후 버전, dependency 복사
		//실행 -> 로드성공
		
	}

}
