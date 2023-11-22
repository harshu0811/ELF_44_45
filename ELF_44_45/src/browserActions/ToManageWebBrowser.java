package browserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageWebBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.linkText("ENGLISH")).click();
	}

}
