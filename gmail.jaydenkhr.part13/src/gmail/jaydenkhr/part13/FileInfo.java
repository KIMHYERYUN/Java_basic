package gmail.jaydenkhr.part13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		// 절대 경로를 가지고 File 인스턴스를 생성
		File f = new File("C:\\Users\\90x61\\Desktop\\Test.txt");
		//파일 존재여부 화긴
		if(f.exists()) {
				System.out.println("파일이 존재합니다.");
				//파일의 마지막 수정시간 - epoch time
				long time = f.lastModified();
				//epoch time을 Date로 변환
				Date date = new Date(time);	
				//날짜를 원하는 문자열로 만들기
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String result = sdf.format(date);
				System.out.println(time);
				System.out.println(date);
				System.out.println(result);
				//파일의 크기를 출력 - KB 바이트 단위 : 1KB - 1024byte
				long len = f.length();
				System.out.println("파일의 크기:" + (len/1024) + "KB");
					
				//상대 경로인 현재 디렉토리의 절대 경로를 확인
				f = new File("./");
				System.out.println(f.getAbsolutePath());
				//현재 디렉토리에 파일을 복사하고 수행
				f = new File("./Test.txt");
				System.out.println(f.exists());
				//System.out.println(f.remove()); 도 가능
					
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}

}
