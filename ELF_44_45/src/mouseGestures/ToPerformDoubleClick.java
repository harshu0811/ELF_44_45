package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");

		WebElement plusButton = driver.findElement(By.id("add"));
		Actions actions = new Actions(driver);
		actions.doubleClick(plusButton).perform();
		actions.doubleClick(plusButton).perform();
		Thread.sleep(2000);
		actions.moveToElement(driver.findElement(By.id("minus"))).doubleClick().perform();
		
	}

}
