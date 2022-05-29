package a_1_webdriverdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.verboseLogging","true");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
