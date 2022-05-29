package b_3_datepickerhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		//direct approach-sendkeys()method
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/16/2022");//mm/dd/yyyy
		
		//using date picker
		
		String year="2010";
		String month="August";
		String date="16";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens the date picker
		
		while(true)
		{

			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yea=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yea.equals(year))
			{
				
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Previous
			}
			
		}
		
		//date selection
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:alldates )
		{
			String dt=ele.getText();
			
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
			
		}
		
		

	}

}
