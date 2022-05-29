package a_7_linkshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//1) click on the link  click()
		
		driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		//2) Find Number of links
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//print all link names
		
		for(WebElement e:links)
		{
			System.out.println(e.getText());
		}
		

	}

}
