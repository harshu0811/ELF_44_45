package dataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Creating FIS
		File abspath = new File("./resources/data.xlsx");		
		FileInputStream fis = new FileInputStream(abspath);
		
		//Step 2 : Respective File object creation
		Workbook workbook = WorkbookFactory.create(fis);
	
		//Step 3 : read methods
		String data1 = workbook.getSheet("Sheet1").getRow(8).getCell(3).getStringCellValue();
		boolean data2 = workbook.getSheet("Sheet1").getRow(14).getCell(6).getBooleanCellValue();
		LocalDateTime data3 = workbook.getSheet("Sheet1").getRow(11).getCell(8).getLocalDateTimeCellValue();
		double data4 = workbook.getSheet("Sheet1").getRow(14).getCell(10).getNumericCellValue(); 
		System.out.println(workbook.getSheet("Sheet1").getRow(8).getCell(2).toString());
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
	}
}
