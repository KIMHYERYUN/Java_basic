package gmail.jaydenkhr.eleventh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		//속성과 값을 문자열로 저장하는 인스턴스 생성
		Properties prop = new Properties();
		
		//값을 저장
		prop.setProperty("name", "KHR");
		prop.setProperty("age", "32"); //문자열만 저장할 수 있다(숫자 저장x)
		
		//값을 읽기
		System.out.println(prop.getProperty("name"));
		//자바에서는 없는 속성을 읽으면 null
		//속성과 값을 저장하는 자료구조에서는 없는 속성의 값을 대입해봐야 한다
		//null이 리턴되는지 아니면 예외가 발생하는지 확인해봐야 한다
		System.out.println(prop.getProperty("job"));
		
		//파일에 저장
		try {
			//출력할 파일 스트림 생성
			FileOutputStream fos = new FileOutputStream("./data.txt");
			prop.store(fos, "주석");
			//FileNotFoundException -> exception : 에러 제거
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("./data.xml");
			prop.store(fos,  "comment");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
