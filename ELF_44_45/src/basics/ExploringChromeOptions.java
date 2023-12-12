package basics;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExploringChromeOptions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--start-maximized");
		settings.addArguments("--disable-notifications");
		settings.setCapability("--incognito",true);
		
//		FirefoxOptions options = new  FirefoxOptions();
//		options.setCapability("dom.webnotifications.enabled", true);
		
		ChromeDriver driver = new ChromeDriver(settings);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");
		Thread.sleep(4000);
		
		
	}
}
