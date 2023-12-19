package learningTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenApp {

	@DataProvider
	public String[] urls() {
		String [] arr = {
							"https://www.zomato.com/bangalore",
							"https://www.swiggy.com/",
							"https://www.foodpanda.com/",
							"https://www.eatfit.in/"
						};
		return arr;
	}
	
	@Test(dataProvider = "urls")
	public void launch(String appToBeLaunched) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(appToBeLaunched);
	}
}
