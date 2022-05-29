package a_2_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();//Maximize the window
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");    //id
		driver.findElement(By.name("submit_search")).click();     //name
		
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();   //linkText
		//driver.findElement(By.partialLinkText("Chiffon Dress")).click();     //partialLinkText
		
		
	}

}
