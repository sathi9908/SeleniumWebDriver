package a_6_dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAutosuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']"));
		System.out.println("total sugested options:"+list.size());
		
		for(WebElement item:list)
		{
			if(item.getText().equals("selenium"))
			{
				item.click();
				break;
			}
		}
		
		
		
		
		
		
		

	}

}
