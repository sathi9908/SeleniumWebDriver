package b_4_mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			
			driver.switchTo().frame("iframeResult");
			
			WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
			field1.clear();
			field1.sendKeys("welcome");
			
			WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
			
			Actions act=new Actions(driver);
			
			act.doubleClick(button).perform();//double click action
			
			

	
		
		
		}

}
