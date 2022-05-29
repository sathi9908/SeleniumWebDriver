package a_6_dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='input-country']"));
		
		Select drpCountry=new Select(drpCountryEle);
		

		//1) Selecting option from DropDown
		drpCountry.selectByVisibleText("India");
		Thread.sleep(3000);
		
		drpCountry.selectByValue("44");
		Thread.sleep(3000);
		
		drpCountry.selectByIndex(10);
		Thread.sleep(3000);
		//2) Finding Number of Options
		
		List<WebElement> alloptions=drpCountry.getOptions();
		System.out.println(alloptions.size()); //242

		//3) Capture all the options and print them
		
		/*for(int i=0;i<alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText());
		}*/
		
		/*for(WebElement options:alloptions)
		{
			System.out.println(options.getText());
		}*/
		//4)select  option without using built-in method
		
		for(WebElement options:alloptions)
		{
			if(options.getText().equals("India"))
			{
				options.click();
				break;
			}
					
		}
	}

}
