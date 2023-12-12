package hadlingHiddenAndDisabledElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionsOnDisabledTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(2000);
		driver.executeScript("arguments[0].value='Hi Welcome';", disabledBox);
	}

}
