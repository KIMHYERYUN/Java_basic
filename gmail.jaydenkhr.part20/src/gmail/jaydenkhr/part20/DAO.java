package gmail.jaydenkhr.part20;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;


public class DAO {
	protected static Connection con;
	protected static PreparedStatement pstmt;
	protected static ResultSet rs;

	//이 클래스가 처음 사용될 때 1번만 호출되는 코드
	static {
		try {
			//파일 인스턴스
			File f = new File("./db.properties");
			//파일 들여오기
			FileInputStream fis = new FileInputStream(f);
			//속성 인스턴스
			Properties properties = new Properties();
			//속성-파일 매칭
			properties.load(fis);
			//파일에서 속성을 읽기
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String id = properties.getProperty("id");
			String pw = properties.getProperty("pw");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("데이터베이스 접속 성공");
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패");
			System.out.println(e.getLocalizedMessage());						
		}
	}
}
