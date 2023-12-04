package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickUsingSendkeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaafashion.com/?ptype=homepage");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("B","i","k","e",Keys.ENTER);
	}

}
