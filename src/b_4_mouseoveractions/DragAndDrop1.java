package b_4_mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement item1=driver.findElement(By.xpath("//ul[@id='gallery']//li[1]"));
		WebElement item2=driver.findElement(By.xpath("//ul[@id='gallery']//li[3]"));
		
		WebElement Trash=driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(item1, Trash).perform();
		act.dragAndDrop(item2, Trash).perform();

	}

}
