package pop_ups;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidAuth {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
	}
}