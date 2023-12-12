package dataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : Creating FIS
		File abspath = new File("./resources/data.properties");		
		FileInputStream fis = new FileInputStream(abspath);
		
		//Step 2 : Respective File object creation
		Properties prop = new Properties();
	
		//Step 3 : read methods
		prop.load(fis);
		System.out.println(prop.getProperty("name"));		
	}
}
