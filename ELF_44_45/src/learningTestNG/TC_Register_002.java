package learningTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Register_002 {

	@DataProvider(parallel=true)
	public String[][] registrationDetails() throws Exception {
		FileInputStream fis = new FileInputStream(new File("./resources/data.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet dataSheet = workbook.getSheet("DWS Register");
		int totalNoOfUsers = dataSheet.getPhysicalNumberOfRows();
		int totalNoOfUserInfo = dataSheet.getRow(0).getPhysicalNumberOfCells();
		String [][] detailsArr = new String[totalNoOfUsers][totalNoOfUserInfo];
		for(int i=0; i<totalNoOfUsers; i++) {
			for(int j=0; j<totalNoOfUserInfo; j++) {
				detailsArr[i][j] = dataSheet.getRow(i).getCell(j).toString();
			}
		}
		return detailsArr;
	}
	
	@Test(dataProvider="registrationDetails")
	public void register(String [] arr) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-"+arr[0].toLowerCase()+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(arr[1]);
		driver.findElement(By.id("LastName")).sendKeys(arr[2]);
		driver.findElement(By.id("Email")).sendKeys(arr[3]);
		driver.findElement(By.id("Password")).sendKeys(arr[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[5]);
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
	}
}
