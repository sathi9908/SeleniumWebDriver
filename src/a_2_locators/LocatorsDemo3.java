package a_2_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();//Maximize the window
		//tag & id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		
		//tag &class
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc");
		
		//tag,class & attribute
	// driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("abc");
	 driver.findElement(By.cssSelector(".inputtext[data-testid=royal_email]")).sendKeys("abc");	
	}

}
