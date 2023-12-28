package Scripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import elementRepo.BasePage;
import elementRepo.ElectronicsPage;
import elementRepo.ProductsListPage;
import elementRepo.ShoppingCartPage;
import generic_lib.BaseScript;

/***
 * 
 * @author Harshavardhan G R
 * 
 */

public class DWS_TC_003_Test extends BaseScript {
	// Test Scenario : Verify user is able to add the product to the Cart section.
	@Test(groups = "group1")
	public void productToCartSection() {

		// expected Data
		String actualElectronicsPageText = "HOME / ELECTRONICS";
		String actualProductListPageText = "HOME / ELECTRONICS / CELL PHONES";

		// step7: Check HomePage is displayed

		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(loginpage.getLogoutlink().isEnabled(), "Home Page not Displayed");
		if (loginpage.getLogoutlink().isEnabled())
			Reporter.log("Home page is displayed");
		BasePage basepage = new BasePage(driver);

		// step8: Click on a Category

		basepage.getElectronicsLink().click();
		ElectronicsPage electronicspage = new ElectronicsPage(driver);
		Assert.assertEquals(actualElectronicsPageText, electronicspage.getPageText().getText().toUpperCase());
		Reporter.log("Electronics page is displayed");
		electronicspage.getCellPhonesLink().click();
		Assert.assertEquals(actualProductListPageText, electronicspage.getPageText().getText().toUpperCase());
		Reporter.log("CellPhones is displayed");
		ProductsListPage productlistPage = new ProductsListPage(driver);

		// Step9: Select Product and Add to Cart

		// capturing product name
		String productName = productlistPage.getProductName().getText();

		productlistPage.getAddToCartButton().click();
		softassert.assertTrue(basepage.getConfirmationMsg().getText().contains("shopping cart"),
				"confirmation msg not displayed");
		Reporter.log(productlistPage.getProductName().getText() + " is added to cart");

		// step10: Click on Shopping Cart

		basepage.getShoppingCartLink().click();
		Assert.assertTrue(basepage.getHeadingText().getText().contains("Shopping cart"));
		Reporter.log("Shopping Cart is Displayed");
		ShoppingCartPage shoppingcartpage = new ShoppingCartPage(driver);

		// step11: verifying product added is present in cart page
		List<WebElement> productslist = shoppingcartpage.getProductNames();
		boolean flag = false;
		for (WebElement product : productslist) {
			if (product.getText().equalsIgnoreCase(productName)) {
				flag = true;
				break;
			}
		}
		if (flag)
			Reporter.log(productName + " is present in cart page");
		else
			Reporter.log(productName + " is not present in cart page");
		softassert.assertAll();

	}
}
