package gmail.jaydenkhr.part18;


import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
//SingerDAO 인터페이스의 메서드를 구현할 클래스
public class SingerDAOImpl implements SingerDAO {
//서버에서 사용되는 클래스인 경우 Singleton으로 디자인하는 것이 일반적
//Framework를 이용하면 이 작업은 Framework가 자동으로 수행
	
	private SingerDAOImpl() {}
	
	private static SingerDAO singerDAO;
	
	public static SingerDAO sharedInstance() {
		if(singerDAO == null) {
			singerDAO = new SingerDAOImpl();
		}
		return singerDAO;
	}
	private static String driver;
	private static String url;
	private static String id;
	private static String pw;
	
	
	//Connection 은 맨 처음 한 번 연결해놓고 계속 사용하는 경우가 일반적
	private static Connection con;
	
	//static 초기화 : 클래스가 처음 사용될 때 한번만 수행되는 코드
	static {
		try {
			File f = new File("./db.properties");
			FileInputStream is = new FileInputStream(f);
			Properties properties = new Properties();
			properties.load(is);
			
			//프로퍼티 파일의 내용을 읽어서 변수에 저장
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			id = properties.getProperty("id");
			pw = properties.getProperty("pw");
			
			Class.forName(driver);
			//데이터베이스 연결
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("static 초기화 성공");
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());	
		}
	}
	
	@Override
	public List<Singer> getList() {
		List<Singer> list = new ArrayList<Singer>();
		
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from singer");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Singer singer = new Singer();
				singer.setNum(rs.getInt("num"));
				singer.setName(rs.getString("name"));
				singer.setBirthday(rs.getDate("birthday"));
				singer.setSongs(rs.getString("songs"));
				singer.setName(rs.getString("hometown"));
				list.add(singer);
			}
		}catch(Exception e) {
			
		}
		
		return list;
	}

	@Override
	public Singer getSinger(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//데이터 삽입
	//기본키를 입력받는지 그렇지 않은지에 따라 달라짐
	//기본키를 입력을 받는 경우는 기본키를 받아서 중복체크를 해야함
	public int insertSinger(Singer singer) {
		// TODO Auto-generated method stub
		//결과를 리턴하기 위한 변수
		//정수를 리턴할때는 -1로 초기화하는 경우가 많음
		//데이터베이스에서는 영향받은 행의 개수를 리턴하기 때문에 음수가 나올 가능성은 없음
		int result = -1;
		//예외처리 목적 : 예외발생하더라도 계속 수행하도록 만듦(서버-여러 클라이언트 요청으로 하나의 클라이언트 잘못된 요청으로 영향받지 않기위해), 예외발생 기록		
		//디버깅 : 개발입장, 릴리즈 모드 : 배포입장
		try {
			//autocommit 해제
			con.setAutoCommit(false);
			//PreparedStatement를 생성
			//입력받을 때는 ?로 표시, 직접 입력도 가능
			//num은 시퀀스를 이용해서 삽입하므로 시퀀스 이용하는 내용을 설정하고 나머지 3개는 매번 내용이 바뀌므로 ?로 처리
			PreparedStatement pstmt = con.prepareStatement("insert into singer(num,name,birthday,songs,hometown" + "values(singer_seq.nextval, ?, ?, ?, ?)");	
			//?에 값을 바인딩
			//첫번째 물음표
			pstmt.setString(1, singer.getName());
			//두번째 물음표
			pstmt.setDate(2,  singer.getBirthday());
			//세번째 물음표
			pstmt.setString(3, singer.getSongs());
			//네번째 물음표
			pstmt.setString(4, singer.getHometown());
			
			//실행
			result = pstmt.executeUpdate();
			
			//pstmt 정리
			pstmt.close();
			//commit 해제후 다시 불러옴
			con.commit();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
			//예외처리에 대한 부분 기록 필요 - common concern : 추후 오류 착안, 분석 등 활용가능성 높음(개발자 입장)
		return result;
	}

	@Override
	public int updateSinger(Singer singer) {
		int result = -1;
		try {
			con.setAutoCommit(false);
			
			PreparedStatement pstmt = con.prepareStatement("update singer set name =?, birthday= ?, songs= ?, hometown=?" + "where num =?");
			
			pstmt.setString(1, singer.getName());
			pstmt.setDate(2, singer.getBirthday());
			pstmt.setString(3, singer.getSongs());
			pstmt.setString(4, singer.getHometown());

			result = pstmt.executeUpdate();
			
			pstmt.close();
			con.commit();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

	@Override
	public int deleteSinger(int num) {
		int result = -1;
		try {
			con.setAutoCommit(false);
			
			PreparedStatement pstmt = con.prepareStatement("delete from singer where num = ?");
			pstmt.setInt(1, num);
			
			result = pstmt.executeUpdate();
			pstmt.close();
			con.commit();	
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}	
	
}
