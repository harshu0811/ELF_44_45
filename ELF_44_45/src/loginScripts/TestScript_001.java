package loginScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScript;

public class TestScript_001 extends BaseScript{

	@Test
	public void loginWithValidCred() {
		Reporter.log("from login with valid credentials",true);
	}
}
