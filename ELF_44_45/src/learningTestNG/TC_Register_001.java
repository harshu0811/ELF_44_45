package learningTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Register_001 {

	@DataProvider(name="data")
	public String[][] registrationDetails() {
		String[][] details = {
								{"male","Shreepad","Daundkar","shreepqr@gmail.com","asd@123","asd@123"},
								{"female","Sayali","pagare","sayali@gmail.com","pqrs@123","pqrs@123"},
								{"male","DayaSindhu","Nagesh","daya@gmail.com","mno@123","mno@123"},
								{"male","Harsha","Vardhan","harsh@gmail.com","fgh@123","fgh@123"},
								{"female","Saloni","Dhotkar","saloni@gmail.com","vbn@123","vbn@123"}
							};
		return details;
	}
	
	@Test(dataProviderClass=learningTestNG.TC_Register_002.class, dataProvider="registrationDetails")
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
