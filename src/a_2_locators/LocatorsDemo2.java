package a_2_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();//Maximize the window
		
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));//class
		System.out.println("total nuber of slider images:"+sliders.size());
		
		List<WebElement> links=driver.findElements(By.tagName("a"));//tagName
	    System.out.println("total number of links in page:"+links.size());
	}
	

}
