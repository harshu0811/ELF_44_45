package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollNaukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Resume writing")).click();
	}
}
