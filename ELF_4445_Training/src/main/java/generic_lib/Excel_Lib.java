package generic_lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Lib {

	/***
	 * this method is used to read data form excel sheet
	 * @param sheetName pass the sheet name where the data is present
	 * @param row specify in which row 
	 * @param col
	 * @return
	 */
	public static String readStringData(String sheetName, int row, int col) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File(""));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(row).getCell(col).toString();
	}
}
