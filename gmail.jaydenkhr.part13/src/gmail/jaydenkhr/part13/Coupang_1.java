package gmail.jaydenkhr.part13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coupang_1 {

	public static void main(String[] args) {
		//웹로그 분석
		//1.접속한 ip와 프로토콜만 추출하시오
		BufferedReader br = null;
		
		try {
			//br에 log.txt 파일을 연결해서 인스턴스를 생성해서 대입
			//파일을 현재 작업디렉토리에 복사해서 수행
			br = new BufferedReader(new InputStreamReader(new FileInputStream("./log.txt")));
			//c 드라이브부터 쓰게되면 다른 사람이 open 할 시 에러발생
			//파일의 내용을 전부 읽어서 출력하기
			String data = "";
			StringBuilder sb = new StringBuilder();
			while(true) {
				//한줄 읽기
				String line = br.readLine();
				//읽은 데이터가 없으면 종료
				if(line == null) {
					break;
				}
				//읽은 데이터가 있으면 sb에 저장
				sb.append(line);
				sb.append("\n");						
			
			
			//읽어낸 문자열을 공백을 기준으로 분할
			String [] ar = line.split(" ");
			System.out.println(ar[0] + ":" + ar[9]);
			}
			//전부 읽었으면 문자열로 변환
			data = sb.toString();
		
			
		}catch(Exception e) {
			System.out.println("파일의 경로를 확인하세요");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
