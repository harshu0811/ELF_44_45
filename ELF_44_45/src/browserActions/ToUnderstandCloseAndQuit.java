package browserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/4");
		Thread.sleep(5000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
//		driver.close();
		driver.quit();		
	}
}
