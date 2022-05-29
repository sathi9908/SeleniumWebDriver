package a_4_waitcomands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// dynamic wait
				//By default it is set to 0
				//Implicit wait is applicable for the entire session of browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //both are same
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		

	}

}
