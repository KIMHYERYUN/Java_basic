package gmail.jaydenkhr.part16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DaumLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//네이버 로그인 페이지 접속
		driver.get("https://logins.daum.net/accounts/signinform.do?url=https%3A%2F%2Fwww.daum.net%2F");
		
		//대부분의 사이트는 입력란의 xpath를 찾아서 sendkeys를 이용하면 됩니다.
		//네이버의 경우 바로 안되면 name을 찾아서 javascript 코드를 실행하면 됩니다.
		driver.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys("kimheyryun-_-");
		driver.findElement(By.xpath("//*[@id=\"inputPwd\"]")).sendKeys("1033639Khr!");
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		
	}

}
