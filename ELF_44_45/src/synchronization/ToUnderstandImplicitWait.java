package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		FluentWait fw = new FluentWait(driver).
				pollingEvery(Duration.ofMillis(100))
				.withTimeout(Duration.ofSeconds(15));
												  //Duration.ofSeconds()
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='Skinny Men Blue Jeans']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("560098");
		WebElement checkButton = driver.findElement(By.id("Check"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkButton));
//		while(!checkButton.isEnabled()) { }
		checkButton.click();
	}

}
