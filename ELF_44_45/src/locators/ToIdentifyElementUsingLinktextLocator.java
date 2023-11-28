package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyElementUsingLinktextLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.woodenstreet.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Study & Office")).click();
		
		driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("INDO WESTERN")).click();
	}

}
