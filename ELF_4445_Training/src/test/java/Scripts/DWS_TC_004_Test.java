package Scripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import elementRepo.BasePage;
import elementRepo.CheckOutPage;
import elementRepo.ElectronicsPage;
import elementRepo.OrderPlacedPage;
import elementRepo.ProductsListPage;
import elementRepo.ShoppingCartPage;
import generic_lib.BaseScript;

/***
 * 
 * @author Harshavardhan G R
 * 
 */

public class DWS_TC_004_Test extends BaseScript {
	// Test Scenario : Verify product is removed from Shopping cart after placing
	// order.
	@Test(groups = "group2")
	public void placingOrderandVerifying() {

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

		// step11: Select on I agree with the terms of service and I adhere to them
		// check box

		shoppingcartpage.getTermsOfServiceCheckBox().click();
		Reporter.log("clicked on terms of services checkbox");

		// step12: Click on Checkout button

		shoppingcartpage.getCheckoutButton().click();
		Reporter.log("clicked on Checkout button");
		Assert.assertTrue(basepage.getHeadingText().getText().contains("Checkout"));
		Reporter.log("Checkout Page opened");
		CheckOutPage checkoutpage = new CheckOutPage(driver);

		// step 13: Enter Valid Billing Address Details

		Select select = new Select(checkoutpage.getBillingCountryDropdown());
		select.selectByVisibleText("India");
		checkoutpage.getBillingCity().clear();
		checkoutpage.getBillingCity().sendKeys("Bangalore");
		checkoutpage.getBillingAddress1().clear();
		checkoutpage.getBillingAddress1().sendKeys("kattrigupe");
		checkoutpage.getBillingZipCode().clear();
		checkoutpage.getBillingZipCode().sendKeys("560100");
		checkoutpage.getBillingPhoneNumber().clear();
		checkoutpage.getBillingPhoneNumber().sendKeys("6360561209");

		// step14: Click on Continue Button

		checkoutpage.getBillingContinueButton().click();
		Reporter.log("Billing Address continue button clicked");

		// step15: Select a Shipping address and Click on Continue

		checkoutpage.getShippingAddressContinue().click();
		Reporter.log("Shipping Address continue button clicked");

		// step16: Select a Shipping Method and click on Continue

		checkoutpage.getShippingMethodContinue().click();
		Reporter.log("Shipping method continue button clicked");

		// step17: Select a Payment Method and Click on Continue

		checkoutpage.getPaymentMethodContinue().click();
		Reporter.log("Payment method continue button clicked");

		// step18: Click on Continue button of payment information

		checkoutpage.getPaymentInformationContinue().click();
		Reporter.log("Payment information continue button clicked");

		// step19: Click on "Confirm" button in Confirm Order

		checkoutpage.getConfirmOrderConfirm().click();
		Reporter.log("Confirm Button clicked");
		OrderPlacedPage orderplacedpage = new OrderPlacedPage(driver);
		Reporter.log("Order confirmation page is displayed");

		// step20: click on continue button

		orderplacedpage.getContinueButton().click();
		Reporter.log("OrderSuccessfull page Continue button is clicked");

		// step21: click on shopping cart Link

		basepage.getShoppingCartLink().click();
		Reporter.log("Shopping cart link is clicked");

		// step22: verifying the ordered product is removed from cart
		List<WebElement> productslist = shoppingcartpage.getProductNames();
		boolean flag = false;
		for (WebElement product : productslist) {
			if (product.getText().equalsIgnoreCase(productName)) {
				flag = true;
				break;
			}
		}
		if (flag)
			Reporter.log(productName + " is not removed from cart page");
		else
			Reporter.log(productName + " is removed from cart page");
		softassert.assertAll();
	}
}
