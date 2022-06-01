package gmail.jaydenkhr.part14;

import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

	public static void main(String[] args) {
		try {
			//Image파일의 url 생성
			URL url = new URL("https://th.bing.com/th/id/OIP.Kgh1GrR2x87H5jDzfDab-AHaIl?w=147&h=180&c=7&r=0&o=5&dpr=2&pid=1.7");
			//연결하기(연결 객체 생성)
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			//옵션 설정
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			//이미지 파일이므로 BufferedInputStream 생성
			//읽기-BufferedInputStream
			//쓰기-PrintStream
			BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
			//파일에 기록할 스트림 생성
			PrintStream ps = new PrintStream("./비행기.jpg");
			
			while(true) {
				//버퍼를 생성
				byte [] b = new byte[512];
				//버퍼 크기만큼 읽기
				int len = bis.read(b);
				//읽은 데이터가 없으면 종료
				if(len <= 0) {
					break;
				}
				//읽은 데이터 기록(읽은 만큼만 기록 : len)
				ps.write(b, 0 ,len);
			}
			ps.flush();
			ps.close();
			
			bis.close();
			con.disconnect();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
		
		}
	}

}
