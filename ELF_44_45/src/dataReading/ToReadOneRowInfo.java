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

public class ToReadOneRowInfo {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Creating FIS
		File abspath = new File("./resources/data.xlsx");		
		FileInputStream fis = new FileInputStream(abspath);
		
		//Step 2 : Respective File object creation
		Workbook workbook = WorkbookFactory.create(fis);
	
		//Step 3 : read methods
		int cellCount = workbook.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
		String [] arr = new String[cellCount];
		
		for(int i=0; i<cellCount; i++) {
			arr[i] = workbook.getSheet("Sheet2").getRow(0).getCell(i).toString();
		}
		
		for(String val : arr) {
			System.out.println(val);
		}
	}
}
