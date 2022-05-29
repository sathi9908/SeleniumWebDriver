package a_4_waitcomands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {



		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			//driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //both are same
			
			//WebElement ele=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
			WebElement ele=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Selenium']")));
			
			
			ele.click();
			

	}

}
