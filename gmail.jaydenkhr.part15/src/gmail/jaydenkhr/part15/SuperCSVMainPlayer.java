package gmail.jaydenkhr.part15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class SuperCSVMainPlayer {

	public static void main(String[] args) {
		//DTO 생성
		//제약조건(반드시 지켜야 할 조건)을 설정 - CellProcessor
		//NotNull은 필수
		//ParseInt는 정수로 변경
		//ParseDate는 날짜로 변경하는데 형식 설정
		//Optional은 선택사항
		CellProcessor [] processors = new CellProcessor[] {
			new NotNull(),
			new ParseInt(new NotNull()),
			new ParseDate("yyyy-MM-dd"),
			new Optional(),
			new Optional()
		};
		
		//전체 데이터를 저장할 List 생성
		//DTO 리스트 or Map 리스트
		List<Player> list = new ArrayList<>();
		
		//파일 경로 생성
		Path path = Paths.get("./volleyball.csv");
		
		//읽기
		//try()를 사용하면 () 안에서 만든 인스턴스는 AutoClosable 인터페이스를 구현했다면 호출하지 않아도 된다
		try (
			//CSV 파일을 읽을 수 있는 인스턴스 생성
			ICsvBeanReader beanReader = 
				new CsvBeanReader(Files.newBufferedReader(path), 
						CsvPreference.STANDARD_PREFERENCE)) {

			//첫번째 행이 필드의 이름인 경우 행의 이름을 가져오기
			String [] header = beanReader.getHeader(true);

			//출력
			System.out.println(Arrays.toString(header));
			
			//첫번째 행이 필드의 이름이 아닌 경우 직접 배열로 생성
			String [] userDefineHeader = {"name", "age", "birth", "email", "nickname"};
			
		
			//데이터 읽기
			while(true) {
				//하나의 행을 읽어서 Player.class로 변환
				//header이름과 Player의 속성이름을 매핑시켜서 생성
				//processors 제약조건을 적용
				Player player = beanReader.read(Player.class, userDefineHeader, processors);
				//읽은 데이터가 없으면 반복문 종료, 읽은 데이터는 list에 추가
				if(player == null) {
					break;
				}
				list.add(player);			
			}
			//출력
			for(Player player : list) {
				System.out.println(player);
			}	
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}


