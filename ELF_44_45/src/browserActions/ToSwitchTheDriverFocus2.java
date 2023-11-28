package browserActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverFocus2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allWindowsId = driver.getWindowHandles();
	
		for(String windowID : allWindowsId ) {
			driver.switchTo().window(windowID);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
		}
		driver.close();
	}

}
