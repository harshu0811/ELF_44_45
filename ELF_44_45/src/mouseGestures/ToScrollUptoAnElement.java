package mouseGestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToScrollUptoAnElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/bangalore");
		
		WebElement marathalli = driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		
		ScrollOrigin ref = ScrollOrigin.fromElement(marathalli);
		actions.scrollFromOrigin(ref, 0, 150).perform();		
	}

}
