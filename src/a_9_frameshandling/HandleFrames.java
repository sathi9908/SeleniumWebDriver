package a_9_frameshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");// switch to 1st frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();//go to main page
		
		driver.switchTo().frame("packageFrame");// switch to 2nd frame
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();//go to main page
		
		driver.switchTo().frame("classFrame");// switch to 3rd frame
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
		
		
		
		
		
		

	}

}
