package Scripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import elementRepo.BasePage;
import elementRepo.ElectronicsPage;
import elementRepo.ProductPage;
import elementRepo.ProductsListPage;
import elementRepo.WishListPage;
import generic_lib.BaseScript;

/***
 * 
 * @author Harshavardhan G R
 * 
 */

public class DWS_TC_005_Test extends BaseScript {
	// Test Scenario : Verify user is able to add the product from a category to
	// Wish list section.
	@Test(groups = "group2")
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

		// Step9: Select Product

		// capturing product name
		String productName = productlistPage.getProductName().getText();
		productlistPage.getAddToCartButton().click();
		Reporter.log(productName + " is selected");
		ProductPage productpage = new ProductPage(driver);

		// step10: click on add to wish list button

		productpage.getAddToWishListButton().click();
		softassert.assertTrue(basepage.getConfirmationMsg().getText().contains("wishlist"),
				"confirmation msg not displayed");
		Reporter.log("clicked on Add to wish list button");

		// step11: click on wish list link

		basepage.getWishlistLink().click();
		Reporter.log("clicked on wishlist link");
		Assert.assertTrue(basepage.getHeadingText().getText().contains("Wishlist"));
		WishListPage wishlistpage = new WishListPage(driver);

		// step12: verifying product is present in wish list
		List<WebElement> productslist = wishlistpage.getProductNames();
		boolean flag = false;
		for (WebElement product : productslist) {
			if (product.getText().equalsIgnoreCase(productName)) {
				flag = true;
				break;
			}
			if (flag)
				Reporter.log(productName + " is present in Wishlist", true);
			else
				Reporter.log(productName + " is not present in wishlist");
		}

	}
}
