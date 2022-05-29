package datadriventesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositeCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String path="C:\\Salenium practice\\caldata";
		
		int rows=XLUtils.getRowCount(path,"Sheet1");
		
		for(int r=1;r<=rows;r++)
		{
			String pric=XLUtils.getCellData(path, "Sheet1", r, 0);
			String  rateofinterest=XLUtils.getCellData(path, "Sheet1", r, 1);
			String  per1=XLUtils.getCellData(path, "Sheet1", r, 2);
			String  per2=XLUtils.getCellData(path, "Sheet1", r, 3);
			String fre=XLUtils.getCellData(path, "Sheet1", r, 4);
			String exp_mvalue=XLUtils.getCellData(path, "Sheet1", r, 5);
			
			//application code
			
			driver.findElement(By.id("principal")).sendKeys(pric);
			driver.findElement(By.id("interest")).sendKeys(rateofinterest);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			
			Select predrp=new Select(driver.findElement(By.id("tenurePeriod")));
			predrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();//calculator button 
			
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test passd");
				XLUtils.setCellData(path, "Sheet1", r, 7, "Passed");
				XLUtils.fillGreenColor(path, "Sheet1", r, 7);
			}	
				else
				{
					System.out.println("Test Failed");
					XLUtils.setCellData(path, "Sheet1", r, 7, "Failed");
					XLUtils.fillRedColor(path, "Sheet1", r, 7);
					
				}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).clear();//clear button
				
		}
		driver.close();
	}

}
