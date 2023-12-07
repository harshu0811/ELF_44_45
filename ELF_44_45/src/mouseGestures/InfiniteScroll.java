package mouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class InfiniteScroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://onepagelove.com/");
		
		Actions actions = new Actions(driver);
		
		for(;;) {
			try {
				driver.findElement(By.linkText("Howells Studio")).click();
				break;
			}catch (NoSuchElementException e) {
				actions.scrollByAmount(0, 700).perform();
			}
		}
	}

}
