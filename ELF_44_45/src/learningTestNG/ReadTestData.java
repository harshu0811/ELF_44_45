package learningTestNG;

import org.testng.annotations.Test;

import generic_lib.Excel_Lib;

public class ReadTestData {

	@Test
	public void run() {
		
		Excel_Lib.readStringData("", 1, 2);
	}

}
