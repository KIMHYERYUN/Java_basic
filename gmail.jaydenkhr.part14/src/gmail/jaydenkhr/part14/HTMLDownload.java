package gmail.jaydenkhr.part14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTMLDownload {

	public static void main(String[] args) {
		try {
			//데이터를 가져올 URL을 생성
			URL url = new URL("https://www.sportalkorea.com/news/view.php?gisa_uniq=2021111121213755&section_code=20&newsstand=1");
			//연결하기
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			//옵션설정
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			//읽기 위한 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String html = "";
			StringBuilder sb = new StringBuilder();
			//먼저 한줄을 읽고
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line);
				sb.append("\n");
			}
			html = sb.toString();
			System.out.println(html);
			
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}finally {

		}
	}
}
