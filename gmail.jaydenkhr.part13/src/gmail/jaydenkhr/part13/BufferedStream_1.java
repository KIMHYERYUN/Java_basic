package gmail.jaydenkhr.part13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BufferedStream_1 {

	public static void main(String[] args) {
		//파일에 바이트 단위로 버퍼를 이용해서 기록 - PrintStream
		PrintStream ps = null;
		try {
			//상대 경로를 이용해서 기록할 파일 스트림을 생성
			//상대 경로에는 \가 없음
			//현재 작업 디렉토리에서 버퍼스트림.txt 파일을 생성해서 기록
			ps = new PrintStream("./버퍼스트림.txt");
			//기록할 내용 만들기
			String str = "작업 디렉토리에 가서 파일 확인";
			//기록 - 문자열을 기록하는 메서드가 존재
			ps.println(str);
			
		}catch(Exception e){
			System.out.println("파일의 경로를 확인하세요");		
		}finally {
			//스트림 닫기
			ps.close();
		}
		
		//파일에서 바이트 단위로 버퍼를 사용해서 읽기 = BufferedInputStream
		BufferedInputStream bis = null;
		try {
			//절대 경로를 이용해서 생성하기
			//컴퓨터 시스템별 다름
			//MS-Window : 드라이브 이름부터 시작, 디렉토리 구분기호 \
			//그 외 : /부터 시작,디렉토리 구분기호 /
			//파일경로 : 직접, cmd에 파일 드래그하면 주소 복사
			FileInputStream fis = new FileInputStream("C:\\Users\\90x61\\eclipse-workspace\\gmail.jaydenkhr.part13\\버퍼스트림.txt");
			//fis를 이용해서 버퍼를 사용하는 ByteInputStream을 만든다
			bis = new BufferedInputStream(fis);
			//한번에 읽기
			byte [] b = new byte[bis.available()];
			//읽어서 저장하기
			//read에 매개변수가 있으면 읽은 개수를 리턴
			int len = bis.read(b);
			//읽어낸 바이트 배열을 문자열로 만들기
			String result = new String(b, 0, len);
			//읽은 내용을 출력
			System.out.println(result);
	
		}catch(Exception e) {
				System.out.println("파일의 경로를 확인하세요");		
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
