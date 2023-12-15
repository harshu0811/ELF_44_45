package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperAttributes5 {  
	
	@Test
	public void openAccount() {
		int i = 1/0;
		Reporter.log("Account created",true);
	}	
	@Test(priority=5)
	public void deleteAccount() {
		Reporter.log("Account Deleted",true);
	}	
	@Test(priority=2)
	public void updateMobileNumber() {
		Reporter.log("Updated mobile number ",true);
	}	
	@Test(dependsOnMethods= {"QpenAccount","addBenificiary"})
	public void amountTransfer() {
		Reporter.log("Transferring amount",true);
	}	
	@Test(priority=3)
	public void addBenificiary() {
		Reporter.log("Added Benificiary",true);
	}
}

