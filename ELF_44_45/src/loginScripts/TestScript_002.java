package loginScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScript;

public class TestScript_002 extends BaseScript{

	@Test
	public void loginWithInValidCred() {
		Reporter.log("from login with Invalid credentials",true);
	}
}
