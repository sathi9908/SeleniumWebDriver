package b_8_capturescreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//screenshot of fullpage
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(System.getProperty("user.dir")+"\\screenshots\\homepage.png");
		
		FileUtils.copyFile(src,trg);*/
		
		
		//screenshot of section of the page-selenium4
		/*WebElement pagesection=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src=pagesection.getScreenshotAs(OutputType.FILE);
		File trg=new File(System.getProperty("user.dir")+"\\screenshots\\featuredproduct.png");
		
		FileUtils.copyFile(src,trg);*/
		
		//screenshot of element-selenium4
				WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
				File src=logo.getScreenshotAs(OutputType.FILE);
				File trg=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
				
				FileUtils.copyFile(src,trg);
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
