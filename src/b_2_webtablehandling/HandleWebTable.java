package b_2_webtablehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//number of rows
		
		int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("number of rows are:"+rows);
		//number of columns
		int colms=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("the number of columns are:"+colms);
		
		// retrive specific row and column data
		
		String value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]")).getText();
		System.out.println(value);
		
		// retrive all data
		/*for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=colms;c++)
			{
				 value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.print(value+"    ");
			}
			System.out.println();
		}*/
		
		
		//print contact and country of amzon
		
		for(int r=2;r<=rows;r++)
		{
			 String company=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[1]")).getText();
		if(company.equals("Amazon"))
		{
			String contact=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[2]")).getText();
			String country=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[3]")).getText();
		System.out.println(company+"  "+contact+"   "+country);
		}
		
		}
		
		
		
		
		
	}

}
