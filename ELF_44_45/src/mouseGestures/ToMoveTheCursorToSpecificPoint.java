package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveTheCursorToSpecificPoint {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		passwordTextBox.sendKeys("Testing@123");
		Thread.sleep(2000);
		System.out.println(passwordTextBox.getSize().getWidth());
		Actions actions = new Actions(driver);
		actions.moveToElement(passwordTextBox, 290, 0).click().perform();
	}

}
