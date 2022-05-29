package a_7_linkshandling;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		int brokenlinks=0;
		
		
		for(WebElement element:alllinks)
		{
			String url=element.getAttribute("href");
			
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
			}
			
			URL link=new URL(url);
			try
			{
		
			HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
			httpcon.connect();
			if(httpcon.getResponseCode()>=400)
			{ 
				System.out.println(httpcon.getResponseCode()+"  "+url+"  "+"is broken link");
			brokenlinks++;
			}
			else
			{
				System.out.println(httpcon.getResponseCode()+"  "+url+"  "+"is valid link");
				
			}
			}
			catch(Exception e)
			{
				
			}
			
			
		}
		System.out.println("Number of brokrb links:"+brokenlinks);
		driver.quit();

	}

}
