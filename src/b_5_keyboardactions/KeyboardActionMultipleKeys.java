package b_5_keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionMultipleKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		input1.sendKeys("WELCOME TO SELENIUM");
		
		Actions act=new Actions(driver);
		
		//input1 --> CTRL +A   Select the text
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		

    	//input1 --> CTRL + C   Copy the text
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Press TAB key to navigate to second input box  input2

		act.sendKeys(Keys.TAB);
		act.perform();
		
		
		//input2  --> CTRL +V   Past the text
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

	}

}
