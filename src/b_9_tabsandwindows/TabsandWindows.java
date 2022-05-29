package b_9_tabsandwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsandWindows {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		 
		//opening link in another tab -- ALL VERSION
		
		driver.get("https://demo.nopcommerce.com/");
		String reglink=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Register")).sendKeys(reglink);
		
		//New tab  - SELENIUM 4
		/*driver.get("https://www.opencart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.orangehrm.com/");*/
	 
		//new window - SELENIUM 4
		/*driver.get("https://www.opencart.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.orangehrm.com/");*/

	}

}
