package b_8_1_cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//How To capture cookies from browser?
				Set<Cookie>cookies=driver.manage().getCookies();
				System.out.println("Size of cookies:"+cookies.size());//4
				
				// How To print cookies from browser?
				for(Cookie c:cookies)
				{
					System.out.println(c.getName()+":"+c.getValue());
				}
				
				//How To add Cookie to the browser?
				Cookie cookieobj=new Cookie("Mycookie","123456");
				driver.manage().addCookie(cookieobj);
				
				cookies=driver.manage().getCookies();
				System.out.println("Size of cookies after adding new one:"+cookies.size());

				// How To delete specific Cookie from the browser?
				driver.manage().deleteCookie(cookieobj);
				cookies=driver.manage().getCookies();
				System.out.println("Size of cookies after deletion:" +cookies.size());
				
				//How To delete all Cookies from the browser?
				
				driver.manage().deleteAllCookies();
				cookies=driver.manage().getCookies();
				System.out.println("Size of cookies after deletion all cookies:" +cookies.size());
				
				driver.close();
				
				
	}

}
