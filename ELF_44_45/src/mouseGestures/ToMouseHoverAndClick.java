package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseHoverAndClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		
		Thread.sleep(2000);
		WebElement homeAppliances = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.contextClick(homeAppliances).perform();
		driver.findElement(By.linkText("Robotic Vacuum Cleaners")).click();
	}

}
