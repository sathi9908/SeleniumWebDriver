package b_5_keyboardactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.SHIFT).perform();
		Thread.sleep(3000);
		

	}

}
