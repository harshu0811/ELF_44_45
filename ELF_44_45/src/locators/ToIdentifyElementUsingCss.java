package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyElementUsingCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(500);
		driver.findElement(By.className("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.className("password")).sendKeys("Testing@123");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

}
