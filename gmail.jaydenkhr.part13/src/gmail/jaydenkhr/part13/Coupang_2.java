package gmail.jaydenkhr.part13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Coupang_2 {

	public static void main(String[] args) {
		//웹로그 분석
		//2. 데이터 갯수 구하기(set 활용)
		BufferedReader br = null;
		
		try {
			//br에 log.txt 파일을 연결해서 인스턴스를 생성해서 대입
			//파일을 현재 작업디렉토리에 복사해서 수행
			br = new BufferedReader(new InputStreamReader(new FileInputStream("./log.txt")));
			//c 드라이브부터 쓰게되면 다른 사람이 open 할 시 에러발생
			//파일의 내용을 전부 읽어서 출력하기
			String data = "";
			StringBuilder sb = new StringBuilder();
			//*
			int cnt = 0;
			///접속한 ip(컴퓨터) 개수를 세기위한 set 자료구조 생성
			Set<String> ipSet = new HashSet<>();
			
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
				//ip를 set에 추가
				ipSet.add(ar[0]);
				
				
				//다른방법(중복되는 데이터 -> 치환 : 일일히 중복 예외되는 패턴을 찾아야함)
				//숫자로 변환되지 않는 데이터를 "0" 으로 치환
				/*
				if(ar[9].equals("-") || ar[9].equals("\"-\"") ) {
					ar[9] = "0";
				}
				*/
				
			}
			//전부 읽었으면 문자열로 변환
			data = sb.toString();
			
			//데이터 개수를 출력
			System.out.println("데이터 개수:" + cnt);
			//IP 개수를 출력
			System.out.println("IP 개수:" + ipSet.size());
			
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
