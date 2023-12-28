package Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic_lib.BaseScript;

/***
 * 
 * @author Harshavardhan G R
 * 
 */

public class DWS_TC_001_Test extends BaseScript{
	
	//Test Scenario: Verify User is able to Login with valid credentials.
	@Test(groups = "group1")
	public void loginWithValidCredentials() {
		//step7: Check HomePage is displayed 
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(loginpage.getLogoutlink().isEnabled(),"Home Page not Displayed");
		if(loginpage.getLogoutlink().isEnabled())
			Reporter.log("Home page is displayed");
		softassert.assertAll();
	}
}
