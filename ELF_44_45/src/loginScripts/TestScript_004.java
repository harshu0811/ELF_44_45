package loginScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_lib.BaseScript;

public class TestScript_004 extends BaseScript{

	@Test
	public void loginWithOnlyUsername() {
		Reporter.log("from login with only username",true);
	}
}
