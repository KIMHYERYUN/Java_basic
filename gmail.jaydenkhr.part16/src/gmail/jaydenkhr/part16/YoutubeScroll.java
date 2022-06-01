package gmail.jaydenkhr.part16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeScroll {

	public static void main(String[] args) {
		//크롬 드라이버 경로 설정
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//크롬 드라이버를 생성
		WebDriver driver = new ChromeDriver();
		
		//원하는 사이트 접속
		driver.get("https://www.youtube.com/results?search_query=%EC%88%98%ED%95%99");
		
		for(int i=0; i<5; i=i+1) {
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			WebElement body = driver.findElement(By.tagName("body"));
			body.sendKeys(Keys.PAGE_DOWN);
			
			//HTML 가져오기
			String html = driver.getPageSource();
			System.out.println(html);
		}

	}
}
