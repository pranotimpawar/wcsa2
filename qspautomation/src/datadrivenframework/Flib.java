package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	     //generic reusable method
		public String readExceldata(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowCount);
			Cell cell = row.getCell(cellCount);
			String data = cell.getStringCellValue();
			return data;
			
		}
		//generic reusable method to get the row countfrom excel file
		public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rc = sh.getLastRowNum();
			return rc;
			
		}
        //generic reusable method to write the data in excel file
		public void writeDataExcel(String excelPath,String sheetName,int rowcount,int cellCount,Date data) throws EncryptedDocumentException, IOException
		{
	        FileInputStream fis = new FileInputStream(excelPath);
	    	Workbook wb = WorkbookFactory.create(fis);
	    	Sheet sh = wb.getSheet(sheetName);
	    	Row row = sh.getRow(rowcount);
     		
	    	Cell cell = row.createCell(cellCount);
    		cell.setCellValue(data);
		
     		FileOutputStream fos = new FileOutputStream(excelPath);
	    	wb.write(fos);	
		}

}
