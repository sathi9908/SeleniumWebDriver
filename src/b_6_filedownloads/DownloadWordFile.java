package b_6_filedownloads;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadWordFile {

	public static void main(String[] args) {
		
		//String location="C:\\sathish\\SeleniumWebDriver\\downloads";
		String location=System.getProperty("user.dir")+"\\downloads";
		
		//chrome
		
		/*HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);*/
		
		//edge
		
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		EdgeOptions options=new EdgeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		
		System.setProperty("webdriver.edge.driver","C:\\drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver(options);
		
		//Firefox
		
		/*FirefoxProfile profile=new FirefoxProfile();
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword"); //Mime Type
		profile.setPreference("browser.download.folderList",2 );//0-desktop 1- downloads 2-desired location
		profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(profile);
		
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
				WebDriver driver=new FirefoxDriver(options);*/
		
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		

	}

}
