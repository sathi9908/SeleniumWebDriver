package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		 
		FileInputStream file=new FileInputStream("C:\\Salenium practice\\data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		 
		int rows=sheet.getLastRowNum();
		System.out.println("Number of rows:"+rows);
		
		XSSFRow row=sheet.getRow(1);
		int cols=row.getLastCellNum();
		System.out.println("number of cols:"+cols);
		
		//Retreive specific value from specific cell
		
	System.out.println(sheet.getRow(2).getCell(0).toString());
	
	for(int r=0;r<=5;r++)
	{
		XSSFRow currentrow=sheet.getRow(r);
		for(int c=0;c<cols;c++)
		{
			XSSFCell cell=currentrow.getCell(c);
		    System.out.print(cell.toString()+"    ");
		    
		}
		System.out.println();
	}
		
		

	}

}
