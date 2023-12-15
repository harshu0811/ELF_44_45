package learningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperAttributes6 {   //TestNG class
	
	@Test(priority=-100, dependsOnMethods="benz")
	public void BMW() {   
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bmw-bavariamotors.in/");
		driver.quit();
	}
	
	@Test(priority=2)
	public void benz() {
		int i=1/0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mercedes-benz.co.in/");
		driver.quit();
	}
	
	@Test(priority=0)
	public void volvo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.volvo.com/en/");
		driver.quit();
	}
	
	//priority -> lowest to highest
	
}
