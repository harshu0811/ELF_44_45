package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCopyPasteValues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement firstNameTextBox = driver.findElement(By.id("FirstName"));
		Thread.sleep(1000);
		firstNameTextBox.sendKeys("ELF_44_45");
		Thread.sleep(1000);
		firstNameTextBox.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		firstNameTextBox.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys(Keys.CONTROL+"v");
		
	}
}
