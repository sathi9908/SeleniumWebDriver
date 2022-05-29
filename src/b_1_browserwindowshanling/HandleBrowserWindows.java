package b_1_browserwindowshanling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//String windowID=driver.getWindowHandle();
		
		//System.out.println(windowID);//CDwindow-43E7B207F887E03FBA7A0CD3D7C08D4F
										//CDwindow-CD2B617022B24C4F2777901F4D126F79
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();  
		Set<String> windowIDs=driver.getWindowHandles();
		
		//approach1
		
		/*List<String> windowIDslist=new ArrayList(windowIDs);
		
		String parentwindowID=windowIDslist.get(0);
		String childwindowID=windowIDslist.get(1);
		
		System.out.println(parentwindowID);
		System.out.println(childwindowID);
		
		driver.switchTo().window(childwindowID);
		System.out.println("title of child page:"+driver.getTitle());
		
		driver.switchTo().window(parentwindowID);
		System.out.println("title of parent page:"+driver.getTitle());
		*/
		//approach2---using looping statament
		/*for(String winid:windowIDs)
		{
			//System.out.println(winid);
			driver.switchTo().window(winid);
			System.out.println(driver.switchTo().window(winid).getTitle());
		}*/
		
		//close specific browser windows
		for(String winid:windowIDs)
		{
			
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM"));
			{
			driver.close();
			}
		}
		
		
		
		
		

	}

}
