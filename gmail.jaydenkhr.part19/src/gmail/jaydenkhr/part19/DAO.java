package gmail.jaydenkhr.part19;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DAO {
	//데이터베이스 연동에 필요한 속성 선언
	//실제 사용은 하위 클래스에서 하므로 protected로 선언
	protected static Connection con;
	protected static PreparedStatement pstmt;
	protected static ResultSet rs;
	
	//클래스가 처음 사용될 때 1번만 수행되는 코드
	//여기서는 instance 변수는 사용할 수 없음
	static {
		try {
			//파일경로 생성
			File f = new File("./db.properties");
			System.out.println("1");
			//숫자를 찍는이유 : 에러발생 곳 확인 
			//파일을 읽을 수 있는 InputStream 생성
			FileInputStream fis = new FileInputStream(f);
			System.out.println("2");
			//properties와 파일을 연결
			Properties properties = new Properties();
			System.out.println("3");
			properties.load(fis);
			System.out.println("4");
			
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String id = properties.getProperty("id");
			String password = properties.getProperty("pw");
			System.out.println("5");
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, password);
			System.out.println("6");
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
