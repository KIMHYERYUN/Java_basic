package gmail.jaydenkhr.part16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaverLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//네이버 로그인 페이지 접속
		driver.get("https://nid.naver.com/nidlogin.login");
		
		//대부분의 사이트는 입력란의 xpath를 찾아서 sendkeys를 이용하면 됩니다.
		//네이버의 경우 바로 안되면 name을 찾아서 javascript 코드를 실행하면 됩니다.
		//이렇게 하면 자동 로그인 방지 문자가 화면에 출력됩니다.
		driver.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys("kimheyryun");
		driver.findElement(By.xpath("//*[@id=\"pw\"]")).sendKeys("1033639Khr!");
		driver.findElement(By.xpath("//*[@id=\"log.login\"]/span")).click();
		
	}

}
