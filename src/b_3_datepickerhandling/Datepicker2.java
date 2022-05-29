package b_3_datepickerhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		Select datepicker_month =new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		datepicker_month.selectByVisibleText("Oct");
		
		Select datepicker_year =new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		
		datepicker_year.selectByVisibleText("1990");
		
		//date selection
		String date="10";
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:alldates)
		{
		String dt=ele.getText();
		if(date.equals(dt))
		{
			ele.click();
			break;
		}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
