package a_6_dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBoostrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.hdfcbank.com/");
			//select product type
			
			
			
			driver.findElement(By.xpath(" //a[normalize-space()='Select Product Type']")).click();
	
			List<WebElement> prodtypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
			System.out.println("number of options:"+prodtypes.size());
			// select option
			for(WebElement ptype:prodtypes)
			{
				//System.out.println(ptype.getText());
				if(ptype.getText().equals("Loans"))
				{
					ptype.click();
					break;
					
				
			}
	
	}
	}
	}
