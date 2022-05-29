package b_7_scrollingpage;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
public static void main(String[] args) {
	
	
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			 

			//1. Scroll down page by pixel
			/*js.executeScript("window.scrollBy(0,3000)","");
			long value=(Long)js.executeScript("return window.pageYOffset;");
			System.out.println("the number of pixel moved:"+value);//3000*/
			
			
			//2. Scroll down page till the element is visible
			
			/*WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
			js.executeScript("arguments[0].scrollIntoView();",flag);
			long value=(Long)js.executeScript("return window.pageYOffset;");
			System.out.println("the number of pixel moved:"+value);//4946*/
			
			//3.till end of page
			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			long value=(Long)js.executeScript("return window.pageYOffset;");
			System.out.println("the number of pixel moved:"+value);//6000
			
			
			
			
			
			
			
	
	
	
	
	
	
	
}
}
