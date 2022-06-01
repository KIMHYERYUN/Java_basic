package gmail.jaydenkhr.part13;

import java.io.PrintStream;

public class BufferedStream_2 {

	public static void main(String[] args) {
		//파일에 바이트 단위로 버퍼를 이용해서 기록 - PrintStream
		PrintStream ps = null;
		try {
			//상대 경로를 이용해서 기록할 파일 스트림을 생성
			//현재 작업 디렉토리에서 버퍼스트림.txt 파일을 생성해서 기록
			ps = new PrintStream("./버퍼스트림.txt");
			//기록할 내용 만들기
			String str = "버퍼를 이용한 바이트 스트림";
			
		}catch(Exception e){
		
		}finally {
		
		}
	}

}
