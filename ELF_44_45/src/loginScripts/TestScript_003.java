package loginScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScript;

public class TestScript_003 extends BaseScript{

	@Test
	public void loginWithoutCred() {
		Reporter.log("from login without credentials",true);
	}
}
