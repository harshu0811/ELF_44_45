package utility_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base_Class {

	public WebDriver driver;
	public WebDriverWait explicitWait;

	@Parameters("browser")
	@BeforeClass
	public void browserSetup(@Optional("chrome") String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			Reporter.log("Invalid browser name", true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	@BeforeMethod
	public void loginToApplication() {
		driver.get("");
		//find username element and enter the test data
		//find password element and enter the test data
		//click on login button
	}
}
