
		package a_4_waitcomands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {



		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			
			
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			//driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //both are same
			
			
			
			By eleLocator=By.xpath("//h3[text()='Selenium']");
			
			 waitForElementPresent(driver,eleLocator,10).click();//calling method
			
			
			

	}
		//re-usable method of explicit wait
		public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return driver.findElement(locator);
			
			
			
		}

}

		
		

	


