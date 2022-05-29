package b_4_mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement rome=driver.findElement(By.id("box6"));
		WebElement italy=driver.findElement(By.id("box106"));
		
		act.dragAndDrop(rome, italy).perform();// drag and drop
		
		WebElement wsh=driver.findElement(By.id("box3"));
		WebElement us=driver.findElement(By.id("box103"));
		act.dragAndDrop(wsh, us).perform();
		
		

	}

}
