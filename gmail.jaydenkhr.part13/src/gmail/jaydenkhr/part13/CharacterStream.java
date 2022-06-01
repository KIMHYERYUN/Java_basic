package gmail.jaydenkhr.part13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterStream {

	public static void main(String[] args) {
		//문자 단위로 기록 - 버퍼를 사용: PrintWriter
		//파일의 경로를 설정 - 현재 디렉토리에 character.txt
		PrintWriter ps = null;
		try {
			ps = new PrintWriter("./character.txt");
			String message = "안녕\n반가워\nbyebye";
			ps.write(message);
			ps.flush();
			
		}catch(Exception e) {
			//현재 시간을 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd");
			String time = sdf.format(date);
			System.out.println(time + ":파일의 경로를 확인해보세요");
			
			//서버에서는 메시지를 파일이나 데이터베이스에 기로 - 시간과 함께
		}finally {
			ps.close();
		}
	

	//줄 단위로 텍스트를 읽기
	//텍스트를 읽을 때 확인사항
	//1.경로확인 - 현재 디렉토리에 character.txt
	//2.한글포함 여부 확인 - 인코딩을 확인(읽은 후 글자가 깨지면 인코딩을 수정)
	//3.파일의 크기가 크면 한번에 읽지 못하거나 시가닝 오래 걸리거나 컴퓨터가 버벅임
	BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("./character.txt")));
			//줄단위로 읽어서 출력
			while(true) {
				String result = br.readLine();
				if(result == null) {
					break;
				}
				System.out.println(result);
			}
			//줄 단위로 읽어서 바로 출력하지 않고 변수에 저장
			String data = "";
			StringBuilder sb = new StringBuilder();
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//문자열에 문자열을 +로 결합하면 메모리 낭비가 발생할 수 있다.
				//data = data + line + "\n";
				//String Builder를 이용해서 추가
				sb.append(line);
				sb.append("\n");
			}//문자열 저장 시 상수 복제해서 저장하기 때문에 메모리 leak 발생해서 낭비
			//문자열로 변환
			data = sb.toString();
			System.out.println(data);
			//문자열에 문자열을 +로 결합하면 메모리 낭비가 발생할 수 있다.
		}catch(Exception e) {
			System.out.println("파일 이름을 확인해보세요");
	
		}finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
}
}




