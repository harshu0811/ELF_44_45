package Scripts;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import elementRepo.BasePage;
import elementRepo.CheckOutPage;
import elementRepo.ElectronicsPage;
import elementRepo.OrderPlacedPage;
import elementRepo.ProductsListPage;
import elementRepo.RegisterPage;
import elementRepo.ShoppingCartPage;

/***
 * 
 * @author Harshavardhan G R
 * 
 */
 
public class DWS_TC_006_Test {

	// Test Scenario : Verify user is able to register and log in with the
	// registered credentials and add a product to cart and buy it..
	@Test(groups = "group2")
	public void registerAndLoginAndBuy() {
		// expected data
		String actualmsg = "Your order has been successfully processed!";
		String actualElectronicsPageText = "HOME / ELECTRONICS";
		String actualProductListPageText = "HOME / ELECTRONICS / CELL PHONES";

		// step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// capturing date, hr, min, sec and concatenating
		LocalDateTime ldt = LocalDateTime.now();
		String temp = "" + ldt.getDayOfMonth() + ldt.getHour() + ldt.getMinute() + ldt.getSecond();

		// step2: Enter Test URL

		driver.get("https://demowebshop.tricentis.com");
		Reporter.log("Test URL Entered");
		BasePage basepage = new BasePage(driver);

		// step3: click on Register Link

		basepage.getRegisterLink().click();
		Reporter.log("RegisterLink Clicked");
		RegisterPage registerpage = new RegisterPage(driver);

		// step4: enter valid Credentials

		registerpage.getMaleradioButton().click();
		registerpage.getFirstNameTextBox().sendKeys("Harsha");
		registerpage.getLastNameTextBox().sendKeys("G R");
		registerpage.getEmailTextBox().sendKeys("harsh" + temp + "@gmail.com");
		registerpage.getPasswordTextBox().sendKeys("Harsh008");
		registerpage.getConfirmPasswordTextBox().sendKeys("Harsh008");

		// step5: Click on Register Button

		registerpage.getRegisterButton().click();
		Reporter.log("RegisterButton clicked");

		// step6: Check HomePage is displayed

		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(basepage.getLogoutlink().isEnabled(), "Home Page not Displayed");
		if (basepage.getLogoutlink().isEnabled())
			Reporter.log("Home page is displayed");

		// step7: Click on a Category

		basepage.getElectronicsLink().click();
		ElectronicsPage electronicspage = new ElectronicsPage(driver);
		Assert.assertEquals(actualElectronicsPageText, electronicspage.getPageText().getText().toUpperCase());
		Reporter.log("Electronics page is displayed");
		electronicspage.getCellPhonesLink().click();
		Assert.assertEquals(actualProductListPageText, electronicspage.getPageText().getText().toUpperCase());
		Reporter.log("CellPhones is displayed");
		ProductsListPage productlistPage = new ProductsListPage(driver);

		// Step8: Select Product and Add to Cart

		productlistPage.getAddToCartButton().click();
		softassert.assertTrue(basepage.getConfirmationMsg().getText().contains("shopping cart"),
				"confirmation msg not displayed");
		Reporter.log(productlistPage.getProductName().getText() + " is added to cart");

		// step9: Click on Shopping Cart

		basepage.getShoppingCartLink().click();
		Assert.assertTrue(basepage.getHeadingText().getText().contains("Shopping cart"));
		Reporter.log("Shopping Cart is Displayed");
		ShoppingCartPage shoppingcartpage = new ShoppingCartPage(driver);

		// step10: Select on I agree with the terms of service and I adhere to them
		// check box

		shoppingcartpage.getTermsOfServiceCheckBox().click();
		Reporter.log("clicked on terms of services checkbox");

		// step11: Click on Checkout button

		shoppingcartpage.getCheckoutButton().click();
		Reporter.log("clicked on Checkout button");
		Assert.assertTrue(basepage.getHeadingText().getText().contains("Checkout"));
		Reporter.log("Checkout Page opened");
		CheckOutPage checkoutpage = new CheckOutPage(driver);

		// step 12: Enter Valid Billing Address Details

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

		// step13: Click on Continue Button

		checkoutpage.getBillingContinueButton().click();
		Reporter.log("Billing Address continue button clicked");

		// step14: Select a Shipping address and Click on Continue

		checkoutpage.getShippingAddressContinue().click();
		Reporter.log("Shipping Address continue button clicked");

		// step15: Select a Shipping Method and click on Continue

		checkoutpage.getShippingMethodContinue().click();
		Reporter.log("Shipping method continue button clicked");

		// step16: Select a Payment Method and Click on Continue

		checkoutpage.getPaymentMethodContinue().click();
		Reporter.log("Payment method continue button clicked");

		// step17: Click on Continue button of payment information

		checkoutpage.getPaymentInformationContinue().click();
		Reporter.log("Payment information continue button clicked");

		// step18: Click on "Confirm" button in Confirm Order

		checkoutpage.getConfirmOrderConfirm().click();
		Reporter.log("Confirm Button clicked");
		OrderPlacedPage orderplacedpage = new OrderPlacedPage(driver);

		// step19: Verify the order is placed or not

		String expectedmsg = orderplacedpage.getOrderConfirmationText().getText();
		Assert.assertEquals(actualmsg, expectedmsg);
		basepage.getLogoutlink();
		driver.quit();
	}
}
