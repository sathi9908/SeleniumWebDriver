package a_1_webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*1) Open Web Browser(Chrome/firefox/Edge).
2) Open URL  https://opensource-demo.orangehrmlive.com/
3) Enter username  (Admin).
4) Enter password  (admin123).   
5) Click on Login.
6) Capture title of the home page.(Actual title) 
7) Verify title of the page: OrangeHRM    (Expected)
8) close browser*/

public class FirstTestCase {

	public static void main(String[] args)
	{
		//1) Open Web Browser
		
		//chrome

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//ChromeDriver driver=new ChromeDriver();
		
		//firefox
		
	//System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		//WebDriver driver=new FirefoxDriver();//FirefoxDriver driver=new FirefoxDriver();
		
		//edgebrowser
		//System.setProperty("webdriver.edge.driver","C:\\drivers\\edgedriver_win64\\msedgedriver.exe");
		
				//WebDriver driver=new EdgeDriver();//EdgeDriver driver=new EdgeDriver();
				
		
		
		//2) Open URL  https://opensource-demo.orangehrmlive.com/
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//3) Enter username  (Admin).
		
		//WebElement usernametxt=driver.findElement(By.id("txtUsername"));
		//usernametxt.sendKeys("Admin");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//4) Enter password  (admin123).
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//5) Click on Login.
		
		driver.findElement(By.id("btnLogin")).click();
		
		//6) Capture title of the home page.(Actual title) 
		
		String title=driver.getTitle();
		
		//7) Verify title of the page: OrangeHRM    (Expected)
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println("Login test Passed");
		}
		else
		{
			System.out.println("Login test Failed");
		}
		
		//8) close browser
		
		driver.close();
		
		
		
	}
	

}
