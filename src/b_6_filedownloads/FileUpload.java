package b_6_filedownloads;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		//Approach1 - using sendKeys()
		//driver.findElement(By.xpath("//div[@class='engage w100 fl tc engage-desktop']//section[1]//div[1]//form[1]//div[1]//div[1]//div[1]//div[1]//input[1]")).sendKeys("C:\\Users\\sathi\\Locators.pdf");
		
		
		//Approach2 - using Robot Class from AWT

				//driver.findElement(By.xpath("//div[@class='engage w100 fl tc engage-desktop']//section[1]//div[1]//form[1]//div[1]//div[1]//div[1]//div[1]//input[1]")).click();
	 
		JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//div[@class='engage w100 fl tc engage-desktop']//section[1]//div[1]//form[1]//div[1]//div[1]//div[1]//div[1]//input[1]")));
		
	StringSelection ss = new StringSelection("C:\\Users\\sathi\\Locators.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	 
	//Robot Class
			Robot rb = new Robot();
			rb.delay(1000);
			
			//CTRL+V
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(2000);
			
			//Press Enter key
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			

			
				
				
	}

}
