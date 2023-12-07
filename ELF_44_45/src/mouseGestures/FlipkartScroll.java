package mouseGestures;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		addItemsToCart("Iphone", driver);
		addItemsToCart("poco", driver);
		addItemsToCart("realme", driver);
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		Actions ref = new Actions(driver);
		ref.scrollByAmount(0, 1517).perform();
		driver.findElement(By.xpath("//a[contains(text(),'iPhone')]/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
	}
	
	public static void addItemsToCart(String productName, WebDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(By.name("q")).sendKeys(productName,Keys.ENTER);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@loading='eager']")));
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[contains(@data-tkid,'SEARCH')]")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentWindowHandle);
		for(String windowId : allWindowHandles) {
			driver.switchTo().window(windowId).findElement(By.xpath("//button[text()='Add to cart']")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Place Order']")));
			driver.close();
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.name("q")).clear();
	}

}
