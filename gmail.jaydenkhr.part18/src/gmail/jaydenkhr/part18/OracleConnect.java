package gmail.jaydenkhr.part18;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OracleConnect {
	//접속을 위해서 필요한 정보를 문자열 변수로 생성
	//오라클 드라이버 클래스 이름
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	//오라킬 접속 URL
	private static String url = "jdbc:oracle:thin:@192.168.219.104:1521:xe";
	//계정정보
	private static String id = "system";
	private static String pw = "oracle";

	public static void main(String[] args) {
		try {
			//드라이버 클래스 로드
			//예외가 발생하는 경우는 driver가 build path에 추가되지 않았거나 클래스 이름이 잘못됨
			Class.forName(driver);
			//System.out.println("드라이버 클래스 로드 성공");
			
			//데이터베이스 연결
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("접속성공");
			
			/*
			//SQL을 실행할 수 있는 PreparedStatement 인스턴스 생성
			PreparedStatement pstmt = con.prepareStatement("insert into sample(num, name, birthday)" + "values(?, ?, ?)");

			//물음표에 값을 바인딩
			pstmt.setInt(1, 2);
			pstmt.setString(2, "지젤");
			//2000년 10월 30일을 날짜 형식으로 생성
			Calendar cal = new GregorianCalendar(2000, 10, 30);
			//Calendar를 java.sql.Date로 변환
			Date date = new Date(cal.getTimeInMillis());
			pstmt.setDate(3, date);
			
			//select 이외의 구문 실행
			//select 이외의 구문은 영향받은 행의 개수를 리턴합니다.
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("데이터 삽입 성공");
			}else {
				System.out.println("데이터 삽입 실패");
			}
			*/
			/*
			//데이터 수정
			PreparedStatement pstmt2 = con.prepareStatement("update sample" + "set name = ?" + "birthday=?" + "where num = ?");
			//물음표에 값을 바인딩
			pstmt.setString(1,"윈터");
			//2001년 1월 1일을 날짜로 생성
			Calendar cal2 = new GregorianCalendar(2001, 1, 1);
			pstmt2.setDate(2, new Date(cal2.getTimeInMillis()));
			
			pstmt2.setInt(3, 2);
			
			//select 이외의 구문 실행
			int result2 = pstmt2. executeUpdate();
			if(result2>0) {
				System.out.println("데이터 수정 성공");
			}else {
				System.out.println("데이터 수정 실패");
			}
			*/

			//sample 테이블의 전체 데이터를 조회하기
			PreparedStatement pstmt = con.prepareStatement("select * from SAMPLE");
			//select 구문 실행
			ResultSet rs = pstmt.executeQuery();
			
			//0개 이상의 리턴 되는 경우
			//처음부터 끝까지 순회
			
			List<Map<String, Object>> list = new ArrayList<>();
			
			while(rs.next()) {
				//하나의 행을 저장할 인스턴스를 생성(Map, DTO)
				Map<String, Object> map = new HashMap<String, Object>();
				//컬럼 이름이나 인덱스를 이용해서 가져와도 됩니다.
				int num = rs.getInt("num");
				String name = rs.getString(2);
				Date birthday = rs.getDate(3);
				
				map.put("num", num);
				map.put("name", name);
				map.put("birthday", birthday);
				
				list.add(map);
			}
			//리스트에 저장하고 출력
			for(Map<String, Object>map : list){			
				System.out.println(map);
			}

			
			//데이터베이스 해제
			con.close();
			pstmt.close();
			rs.close();
			/*
			pstmt.close();
			*/
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
