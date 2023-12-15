package generic_lib;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseScript {

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("from before suite", true);
		Reporter.log("reporter config");
		Reporter.log("JDBC connection");
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("from before test", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("from before class", true);
		Reporter.log("Browser launch", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("from before method", true);
		Reporter.log("login ", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("from after suite", true);
		Reporter.log("flush reporter");
		Reporter.log("closing JDBC connection");
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("from after test", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("from after class", true);
		Reporter.log("close browser", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("from after method", true);
		Reporter.log("logout ", true);
	}
}
