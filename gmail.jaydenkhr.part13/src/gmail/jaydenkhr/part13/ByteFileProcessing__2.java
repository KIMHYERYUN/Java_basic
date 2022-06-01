package gmail.jaydenkhr.part13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileProcessing__2 {

	public static void main(String[] args) {
		//파일에 문자열을 바이트 단위로 기록
		
		//try, catch, finally 모든 블럭에서 사용하기 위해서 바깥에 변수 생성
		FileOutputStream fos = null;
		try {
			//예외 발생 가능성이 있는 코드
			//스레드, 파일 입출력, 네트워크, 데이터베이스 사용은 거의 필수
			
			//기록을 파일로 생성
			fos = new FileOutputStream("./파일이름.txt");
			//기록할 내용 생성
			String str = "기록할 내용을 생성";
			//한글은 바이트 단위로 읽어서 변환하면 깨질 수 있음
			//기록 - 문자열은 바이트 배열로 변경해서 기록
			fos.write(str.getBytes());
			
		}catch(Exception e) {
			//예외 발생했을 때 수행할 코드
			System.out.println("파일경로를 확인하세요");
		}finally {
			//예외 발생 여부에 상관없이 수행할 코드
			try {
				fos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		//파일의 내용을 읽기
		FileInputStream fis = null;
		try {
			 //읽은 내용을 저장할 바이트 배열을 생성
			 fis = new FileInputStream("./파일이름.txt");

			 //전체를 한번에 읽지않고 나누어서 읽기
			 while(true) {
				 //실제 버퍼의 크기는 대부분 8의 배수로 만들고 큰 숫자 사용
				 byte [] b = new byte[12];
				 //b에 b의 크기만큼 읽어서 저장하고 읽은 개수를 리턴
				 //읽은 데이터가 없으면 0 또는 음수 리턴
				 int len = fis.read(b);
				 //읽은 데이터가 없으면 반복문 종료
				 if(len <= 0) {
					 break;
				 }
				 //읽은 데이터가 있으면 문자열로 변환해서 출력
				 //읽은 만큼만 변환(일부분)
				 String str = new String(b, 0, len);
				 System.out.println(str);
				 }
			 
		}catch(Exception e) {
			System.out.println("파일의 경로를 확인하세요");
			
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		

		}
	}
}
