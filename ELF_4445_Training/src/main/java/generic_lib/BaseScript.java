package generic_lib;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import elementRepo.Addresses;
import elementRepo.LoginPage;
        
public class BaseScript {
	
	public WebDriver driver; 
	public WebDriverWait explicitWait;
	public String url="https://demowebshop.tricentis.com/";
	public LoginPage loginpage;
	public Addresses addresses;

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		Reporter.log("from before suite", true);
		Reporter.log("reporter config");
		Reporter.log("JDBC connection");
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		Reporter.log("from before test", true);
	}

	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		//step1: Launch the browser
		driver=new ChromeDriver();
		Reporter.log("Browser launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		Reporter.log("from before method", true);
		//step2: Enter Test URL
		driver.get(url);
		Reporter.log("Test URL Entered");
		loginpage=new LoginPage(driver);
		//step3: Click on login link
		loginpage.getLoginLink().click();
		Reporter.log("Clicked on Log in Link");
		//step4: Enter email id in Email ID Text Box
		loginpage.getEmailTextBox().clear();
		loginpage.getEmailTextBox().sendKeys("sayalipagare99@gmail.com");
		Reporter.log("Email Entered");
		//step5: Enter Password in Password Text Box
		loginpage.getPasswordTextBox().clear();
		loginpage.getPasswordTextBox().sendKeys("saya21");
		Reporter.log("Password Entered");
		//step6: Click on Login button
		loginpage.getLoginButton().click();
		Reporter.log("Login Button Clicked");
		
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		Reporter.log("from after suite", true);
		Reporter.log("flush reporter");
		Reporter.log("closing JDBC connection");
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		Reporter.log("from after test", true);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		Reporter.log("from after class", true);
		Reporter.log("close browser", true);
		driver.quit();
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		Reporter.log("from after method", true); 
		addresses=new Addresses(driver);
		addresses.getAddressesLink().click();
		List<WebElement> deleteButtons=addresses.getDeleteButtons();
		for(WebElement delete: deleteButtons) {
			delete.click();
			driver.switchTo().alert().accept();
		}
		loginpage.getLogoutlink().click();
	}
}
