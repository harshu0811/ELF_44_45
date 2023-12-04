package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Purple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.purplle.com/");
		driver.findElement(By.partialLinkText("SHOP CATEGORIES")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Primer")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(" M.A.C ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(" Add to Cart ")).click();
		
	}
}
