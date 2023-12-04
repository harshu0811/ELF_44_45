package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCSSProperties {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement errorMessage = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		System.out.println(errorMessage.getCssValue("color"));
		System.out.println(errorMessage.getCssValue("font-family"));
		System.out.println(errorMessage.getCssValue("font-weight"));
	}

}
