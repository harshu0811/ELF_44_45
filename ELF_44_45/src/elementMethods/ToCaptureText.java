package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.clear();
		emailTextBox.sendKeys("sumanth@gmail.com");
		WebElement passwordTextBox = driver.findElement(By.id("Password"));
		passwordTextBox.clear();
		passwordTextBox.sendKeys("Testing@123");
		driver.findElement(By.cssSelector("input[value='Log in']")).submit();
		Thread.sleep(2000);
		String errorMessage = driver.findElement(By.cssSelector("div[class='validation-summary-errors']")).getText();
		System.out.println(errorMessage);
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(1000);
//		String text = driver.findElement(By.tagName("body")).getText();
//		System.out.println(text);
	}

}
