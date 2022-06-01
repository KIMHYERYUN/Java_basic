package gmail.jaydenkhr.part13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Coupang_3 {

	public static void main(String[] args) {
		//웹로그 분석
		//traffic의 전체 합계 구하기
		BufferedReader br = null;
		
		try {
			//br에 log.txt 파일을 연결해서 인스턴스를 생성해서 대입
			//파일을 현재 작업디렉토리에 복사해서 수행
			br = new BufferedReader(new InputStreamReader(new FileInputStream("./log.txt")));
			//c 드라이브부터 쓰게되면 다른 사람이 open 할 시 에러발생
			//파일의 내용을 전부 읽어서 출력하기
			String data = "";
			StringBuilder sb = new StringBuilder();

			int cnt = 0;

			//접속한 IP(컴퓨터)개수를 세기 위한 Set 자료구조 생성
			Set<String> ipSet = new HashSet<>();
			
			//합계를 구하기 위한 변수
			int trafficSum = 0;

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
				//데이터 개수 1증가
				cnt = cnt + 1;
			
				//읽어낸 문자열을 공백을 기준으로 분할
				String [] ar = line.split(" ");
				//접속한 ip(컴퓨터) 개수를 세기위한 set 자료구조 생성
				
				ipSet.add(ar[0]);
							
			//문자열을 정수로 변경하다가 에러 발생
			//NumberFormatException : 숫자로 변환할 수 없는 데이터 존재
			//데이터 분석에서는 Outlier(이상치)라고 함
			//방법1 : 이 해당 데이터를 제거하고 분석
			//방법1 : 예외처리(try-catch : 예외가 발생해도 넘어가고 기록하도록)
			//잘못되면 넘어가도록 try-catch 사용
			try {
				trafficSum = trafficSum + Integer.parseInt(ar[9]); //문자열을 숫자로 변환 :  Integer.parseInt(문자열) 과 Double.parseDouble(문자열)
			}catch(Exception e) {	
			}
				
			//방법2 : 특정 값으로 치환해서 처리
			//방법2 : 숫자로 변환되지 않는 데이터를 "0"으로 치환
			//if(ar[9].equals("-" || ar[9].equals("\"-\"")){
			//	ar[9] = "0";
			//}
			//트래픽에 해당하는 데이터를 정수로 변환해서 trafficSum에 추가
			//trafficSum = trafficSum + Integer.parseInt(ar[9]);
	
					
			data = sb.toString();
			
			///데이터 개수 출력
			System.out.println("데이터개수:" + cnt);
			System.out.println("ip개수:" + ipSet.size());
			System.out.println("트래픽합계:" + trafficSum);	
			}
	
		

			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
