package a_8_alertshandling;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatePopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
			
		// Syntax: http://username:password@test.com
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	}

}


