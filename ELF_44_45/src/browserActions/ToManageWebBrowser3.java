package browserActions;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageWebBrowser3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.biskfarm.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println("X position is :" + position.getX());
		System.out.println("Y position is :" + position.getY());
		
		Thread.sleep(2000);
		Point targetPosition = new Point(100, 200);
		driver.manage().window().setPosition(targetPosition);
	}
}
