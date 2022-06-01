package gmail.jaydenkhr.part15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HaniHTMLParsing {

	public static void main(String[] args) {
		//한겨레 신문사 Main 기사의 타이틀 가져오기
		
		//1.http://hani.co.kr의 HTML 가져오기
		String html = null;
		
		try {
			URL url = new URL("http://hani.co.kr");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setConnectTimeout(300000);
			con.setUseCaches(false);
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder sb = new StringBuilder();
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line);
				sb.append("\n");
			}
			html = sb.toString();
			
		}catch(Exception e) {
			System.out.println("1:" + e.getLocalizedMessage());
		}
		if(html != null) {
			try {
				//HTML을 Document 객체로 변환
				//import는 org.jsoup로 시작하는 것을 import
				Document doc = Jsoup.parse(html);
				
				//Main 기사 찾아오기
				//검사-클릭-음영처리 부분-오른쪽 마우스-copy-selector
				Elements elements = doc.select("#main-top > div.main-top > div.main-top-article > h4 > a");
				
				//순회
				for(int i=0; i < elements.size(); i=i+1) {
					Element element = elements.get(i);
					//태그 안의 내용
					System.out.println(element.text());
					//태그 안의 속성 가져오기
					System.out.println(element.attr("href"));
				}
			}catch(Exception e) {
				System.out.println("2:" + e.getLocalizedMessage());
			}
		}
	}

}
