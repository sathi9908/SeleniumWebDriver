package b_4_mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement womenmenu=driver.findElement(By.xpath("//a[@title='Women']"));
		
		//Actions act=new Actions(driver);
		
		//act.moveToElement(womenmenu).perform();// perform() includes build().perform()
		
		
		Actions act=new Actions(driver);
		
		Action ac=act.moveToElement(womenmenu).build();// Here we create only action but not performed
		
		ac.perform();
		
		
		
		
		
		
		

	}

}
