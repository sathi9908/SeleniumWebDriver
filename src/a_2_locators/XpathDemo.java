 package a_2_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//absolute xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		//Relative xpath
		//driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//*[@name='submit_search']")).click();
		
		// or
		//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button-search']")).click();
		

		// and
		//driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
		
		//contains() ,starts-with()
		//driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-shirt");
		//driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();
		
		//text()
		//driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		
		//chained xpath
		driver.findElement(By.xpath("//form[@id='searchbox']/input[@id='search_query_top']")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//form[@id='searchbox']/button[@name='submit_search']")).click();
		
		
	
	}

}
