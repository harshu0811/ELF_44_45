package browserActions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageWebBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.oreo.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println("Browser height is : " +size.getHeight());
		System.out.println("Browser width is : " +size.getWidth());
		Thread.sleep(2000);
		Dimension newSize = new Dimension(500, 500);
		driver.manage().window().setSize(newSize);
	}

}
