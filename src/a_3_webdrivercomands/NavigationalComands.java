package a_3_webdrivercomands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalComands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		driver.get("https://www.amazon.com/");
		
		//driver.navigate().to("https://www.snapdeal.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();

	}

}
