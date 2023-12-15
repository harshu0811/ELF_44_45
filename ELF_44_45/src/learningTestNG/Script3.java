package learningTestNG;

import org.testng.annotations.Test;

import generic_lib.BaseClass;

public class Script3 {

	@Test
	public void createAccount() {
		BaseClass ref = new BaseClass();
		ref.browseSetup();
		ref.login();
		
		
		
		
		
		
		
		ref.logout();
		ref.browserTearDown();
	}
}
