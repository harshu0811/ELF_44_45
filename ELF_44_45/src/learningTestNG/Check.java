package learningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Check {   //TestNG class
	
	@Test(priority=-1, invocationCount = 2, threadPoolSize=0)
	public void BMW() {   
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bmw-bavariamotors.in/");
		driver.quit();
	}
	
	@Test(priority=2, invocationCount=5, threadPoolSize=4, enabled=false)
	public void benz() {
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
