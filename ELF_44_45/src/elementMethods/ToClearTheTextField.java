package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheTextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		WebElement usernameTextBox = driver.findElement(By.id("username"));
		usernameTextBox.clear();
		Thread.sleep(1000);
		usernameTextBox.sendKeys("sumanth");
		WebElement passwordTextbox = driver.findElement(By.id("password"));
		passwordTextbox.clear();
		passwordTextbox.sendKeys("Testing@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
		
	}

}
