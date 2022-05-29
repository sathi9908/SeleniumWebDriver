package datadriventesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("C:\\Salenium practice\\testdata1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		/*for(int r=0;r<=5;r++)
		{
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<3;c++)
			{
				XSSFCell cell=row.createCell(c);
				cell.setCellValue("welcome");
				
			}
			
		}*/
		
		//Below is not right approach - creating rows multiple times
		
		sheet.createRow(0).createCell(0).setCellValue("1234");
		sheet.createRow(0).createCell(1).setCellValue("sathi");
		
		sheet.createRow(1).createCell(0).setCellValue("4567");
		sheet.createRow(1).createCell(1).setCellValue("mano");
		
		sheet.createRow(2).createCell(0).setCellValue("6789");
		sheet.createRow(2).createCell(1).setCellValue("1hari");
		
		
		
		
		
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
		
		
		
		
		

	}

}
