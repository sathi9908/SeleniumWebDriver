package b_8_2headlessmode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessEdge {

	public static void main(String[] args) {
		EdgeOptions options=new EdgeOptions();
		options.setHeadless(true);
		
		
		System.setProperty("webdriver.edge.driver","C:\\drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
