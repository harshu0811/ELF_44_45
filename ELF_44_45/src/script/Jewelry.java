package script;

import org.testng.annotations.Test;

import elementRepo.WelcomePage;
import utility_Classes.Base_Class;


public class Jewelry extends Base_Class {

	@Test
	public void addAProductFromJeweley() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getJewelry().click();
	}
}
