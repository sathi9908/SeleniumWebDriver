package a_3_webdrivercomands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//findElement  -Returns Single WebElement
		
		//1
		
		WebElement serchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));//locator matching with single webelement
		serchbox.sendKeys("apple m book");
		
		//2
		
		WebElement link=driver.findElement(By.xpath("//div[@class='footer']//a"));//locator matching with multiple webelement
		System.out.println(link.getText());
		
		//3
		
		//WebElement button=driver.findElement(By.xpath("//button[normalize-space()='login']"));//element not availabe then throws NoSuchElementException
		
		//findElements---returns multiple webelements
		
		//1
		List<WebElement> elements=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));//Locator mtching with single webelement
		System.out.println(elements.size());//1
		//2

		List<WebElement> links=driver.findElements(By.xpath("//div[@class='footer']//a"));//locator matching with multiple webelement
		System.out.println(links.size());//23
		//3 iterate elements
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
		//4  No Exception - Zero returns
		List<WebElement> images=driver.findElements(By.xpath("//div[@class='footer']//img"));
		
		System.out.println(images.size());
		
		
		
		
		
		
		
	}

}
