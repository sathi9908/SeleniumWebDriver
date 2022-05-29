package a_8_alertshandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();// opens the alert window
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		
		myalert.sendKeys("Welcome");
		myalert.accept();// close alert window by using OK button
		//myalert.dismiss(); // close alert window by using Cancel button

	}

}
