package dataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleRowsInJaggedFormat {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Creating FIS
		File abspath = new File("./resources/data.xlsx");		
		FileInputStream fis = new FileInputStream(abspath);
		
		//Step 2 : Respective File object creation
		Workbook workbook = WorkbookFactory.create(fis);
	
		//Step 3 : read methods
		int cells1 = workbook.getSheet("Sheet3").getRow(0).getPhysicalNumberOfCells();
		String[] arr1 = new String[cells1];
		for(int i=0; i<cells1; i++) {
			arr1[i] = workbook.getSheet("Sheet3").getRow(0).getCell(i).toString();
		}
		
		int cells2 = workbook.getSheet("Sheet3").getRow(1).getPhysicalNumberOfCells();
		String[] arr2 = new String[cells2];
		for(int i=0; i<cells2; i++) {
			arr2[i] = workbook.getSheet("Sheet3").getRow(1).getCell(i).toString();
		}
		
		int cells3 = workbook.getSheet("Sheet3").getRow(2).getPhysicalNumberOfCells();
		String[] arr3 = new String[cells3];
		for(int i=0; i<cells3; i++) {
			arr3[i] = workbook.getSheet("Sheet3").getRow(2).getCell(i).toString();
		}
		
		int cells4 = workbook.getSheet("Sheet3").getRow(3).getPhysicalNumberOfCells();
		String[] arr4 = new String[cells4];
		for(int i=0; i<cells4; i++) {
			arr4[i] = workbook.getSheet("Sheet3").getRow(3).getCell(i).toString();
		}
		
		String[][] sarr = {arr1,arr2,arr3,arr4};
		
		
	}
}
