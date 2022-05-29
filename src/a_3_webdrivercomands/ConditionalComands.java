package a_3_webdrivercomands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalComands {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		//isDisplayed(),isEnabled()
		
		WebElement searchstore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("display status:"+searchstore.isDisplayed());//true
		System.out.println("enable status:"+searchstore.isEnabled());//true
		
		//isSelected()---for radio buttons and check buttons
		
		WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//false
		
		male.click();
		
		System.out.println(male.isSelected());//true
		System.out.println(female.isSelected());//false
		female.click();
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//true
	
	
	}

}
