package mouseGestures;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("sumanthqsp@gmail.com");
		driver.findElement(By.id("login")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("Testing@123",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[.='Selenium Training']")).click();
		WebElement sourceEle = driver.findElement(By.linkText("In progress"));
		WebElement targetLoc = driver.findElement(By.xpath("//h2[text()='Selenium']/../../..//button[text()='Add a card']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceEle, targetLoc).perform();
	}

}
