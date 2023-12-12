package dataReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./resources/data.txt");
		
		int var = fis.read();
		while(var!=-1) {
			System.out.print((char)var);
			var=fis.read();
		}
	}

}
