package b_4_mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		WebElement desktopmenu=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement macmenuitem=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		//mouse hover action
		
		Actions act=new Actions(driver);
		
		act.moveToElement(desktopmenu).moveToElement(macmenuitem).click().perform();
		

	}

}
