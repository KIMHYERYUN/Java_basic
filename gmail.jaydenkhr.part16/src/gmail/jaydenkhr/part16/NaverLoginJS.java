package gmail.jaydenkhr.part16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaverLoginJS {

	public static void main(String[] args) {
		//크롬 드라이버 경로 설정
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//크롬 드라이버를 생성
		WebDriver driver = new ChromeDriver();
		
		//원하는 사이트 접속
		driver.get("https://nid.naver.com/nidlogin.login");
		
		//자바스크립트 실행 객체를 생성
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//네이버 로그인 입력란의 name을 찾아옵니다.
		//id와 pw
		js.executeScript("document.getElementsByName('id')[0].value=\'kimheyryun\'");
		js.executeScript("document.getElementsByName('pw')[0].value=\'1033639Khr!\'");
			
		driver.findElement(By.xpath("//*[@id=\"log.login\"]/span")).click();
	}

}