package understandingStale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		
		loginLink.click();
		Thread.sleep(500);
//		loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
	}
}
