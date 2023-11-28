package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyElementUsingNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("Elf_44_45@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Password123");
		Thread.sleep(1000);
		driver.findElement(By.name("captcha")).sendKeys("aefr2");
	}

}
