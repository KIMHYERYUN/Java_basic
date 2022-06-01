package gmial.jaydenkhr.part17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnect {

	public static void main(String[] args) {
		try {
			//드라이버 클래스 로드 - 한번만 수행하면 된다
			//예외가 발생하는 경우는 driver가 buildpath에 추가되지 않았거나 드라이버 클래스 이름이 잘못된 경우
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이브 로드 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패:" + e.getLocalizedMessage());
		}
		//데이터베이스 사용을 위해 연결
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			System.out.println("접속성공");
		}catch(Exception e) {
			System.out.println("연결실패:" + e.getLocalizedMessage());
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}