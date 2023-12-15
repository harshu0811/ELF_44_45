package learningTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperAttributes4 {  
	
	@Test(timeOut=2000)
	public void game() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://krafton.com/en/");
		driver.quit();
	}
	
	@Test
	public void start() {
		Reporter.log("Hi",true);
	}
}
