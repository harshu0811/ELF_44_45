package listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingListbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		driver.findElement(By.id("day")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='9']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("month")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='May']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("year")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='2000']")).click();
	
	}
}
