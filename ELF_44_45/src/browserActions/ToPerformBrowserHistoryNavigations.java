package browserActions;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.britannia.co.in/");
		driver.get("https://www.parleproducts.com/");
		driver.navigate().to("https://www.sunfeastworld.com/");
		
		Thread.sleep(2000);
		Navigation navigation = driver.navigate();
		navigation.back();
		Thread.sleep(2000);
		navigation.back();
		Thread.sleep(2000);
		navigation.forward();
		Thread.sleep(2000);
		navigation.refresh();
	}
}
