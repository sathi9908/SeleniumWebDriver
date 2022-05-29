package a_5_handlingcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//1.select specific checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();//monday
		
		//2.select all checkboxes
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println(checkboxes.size());//7
		
		//normal for loop
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//for each loop
		/*
		for(WebElement ele:checkboxes)
		{
			ele.click();
		}
		
		*/
		
		//3.select multiple checkboxes by choice
		/*for(WebElement ele:checkboxes)
		{
			String value=ele.getAttribute("id");
			if(value.equals("monday") || value.equals("sunday"))
			{
			ele.click();
			}
		}*/
		//4. slect last 2 checkboxes
		/*for(int i=checkboxes.size()-2;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//5. slect first 2 checkboxes
		
		/*for(int i=0;i<checkboxes.size();i++)
			if(i<2)
		{
			checkboxes.get(i).click();
		}
		*/
		
		/*for(int i=0;i<checkboxes.size()-5;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//clearing all check boxes
		for(WebElement ele:checkboxes)
		{
			ele.click();
		}
		for(WebElement ele:checkboxes)
		{
			if(ele.isSelected())// if element is already selected then clear checkboxe
				
			ele.click();
		}
		
		for(int i=checkboxes.size()-5;i<checkboxes.size()-3;i++)
		{
			checkboxes.get(i).click();
		}
		
		
	}

}
