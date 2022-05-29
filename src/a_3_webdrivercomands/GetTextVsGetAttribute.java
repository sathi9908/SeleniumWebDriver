package a_3_webdrivercomands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement emailinputbox=driver.findElement(By.xpath("//input[@id='Email']"));
		
		emailinputbox.clear();// clears the text value in text box
		emailinputbox.sendKeys("admin@yourstore.com");
		
		
		
		System.out.println("result of gettext():"+emailinputbox.getText());//no output in return
		System.out.println("result of getAttribute():"+emailinputbox.getAttribute("value"));
		
		WebElement buttontext=driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
	
		System.out.println("result of gettext():"+buttontext.getText());
		System.out.println("result of getAttribute():"+buttontext.getAttribute("value"));
		
	}
	

}
