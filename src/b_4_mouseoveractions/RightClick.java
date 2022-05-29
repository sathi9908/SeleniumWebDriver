package b_4_mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
				WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
				Actions act=new Actions(driver);
				
				act.contextClick(button).build().perform();//act.contextClick(button).perform();
	
	
	}

}
