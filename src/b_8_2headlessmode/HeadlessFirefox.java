package b_8_2headlessmode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox {

	public static void main(String[] args) {
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
				WebDriver driver=new FirefoxDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
