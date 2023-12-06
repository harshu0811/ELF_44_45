package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Explore {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.purplle.com/");
		driver.findElement(By.xpath("//div[contains(@class,'pro-name')]")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("mainImage"))).perform();
		actions.moveByOffset(20, 0).perform();
		actions.release(driver.findElement(By.xpath("//span[@class='irs-slider from']")));
	}

}
