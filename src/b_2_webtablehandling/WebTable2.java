package b_2_webtablehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		int rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		
		int count=0;
		for(int r=1;r<=rows;r++)
		{
			String status=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
		if(status.equals("Enabled"))
		{
			count++;
		}
	
		
		}
		System.out.println("The number of enabled users:"+count);
		System.out.println("the number of disabled users:"+(rows-count));
		
		driver.close();

	}

}
