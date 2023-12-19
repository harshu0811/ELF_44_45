package learningTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider {

	@DataProvider
	public void testData() {
		
	}
	
	@DataProvider
	public String[] passTestData() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(new File("./testData/testData.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		int colCount = workbook.getSheet("DWS").getRow(0).getPhysicalNumberOfCells() - 1;
		String [] data = new String[colCount];
		for(int i=0; i<colCount; i++) {
			data[i] = workbook.getSheet("DWS").getRow(0).getCell(i+1).toString();
		}
		return data;
	}
	
	@Test(dataProvider = "passTestData")
	public void testingUsernameTextField(String testData) {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(testData);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
