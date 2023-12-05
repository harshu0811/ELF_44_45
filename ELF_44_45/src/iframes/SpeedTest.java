package iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeedTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.speedtest.net/");
		Thread.sleep(4000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='3rd party ad content']"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("cbb")).click();
		driver.switchTo().defaultContent();
	}
}
