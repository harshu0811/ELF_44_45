package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Billing Address
	
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement billingFirstName;
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement billingLastName;
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement billingEmail;
	
	@FindBy(id = "BillingNewAddress_Company")
	private WebElement billingCompany;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement billingCountryDropdown;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement billingCity;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement billingAddress1;
	
	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement billingAddress2;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement billingZipCode;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement billingPhoneNumber;
	
	@FindBy(id = "BillingNewAddress_FaxNumber")
	private WebElement billingFaxNumber;
	
	@FindBy(xpath =  "//h2[text( )='Billing address']/../..//input[@value='Continue']")
	private WebElement billingContinueButton;

	public WebElement getBillingFirstName() {
		return billingFirstName;
	}

	public WebElement getBillingLastName() {
		return billingLastName;
	}

	public WebElement getBillingEmail() {
		return billingEmail;
	}

	public WebElement getBillingCompany() {
		return billingCompany;
	}

	public WebElement getBillingCountryDropdown() {
		return billingCountryDropdown;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingAddress1() {
		return billingAddress1;
	}

	public WebElement getBillingAddress2() {
		return billingAddress2;
	}

	public WebElement getBillingZipCode() {
		return billingZipCode;
	}

	public WebElement getBillingPhoneNumber() {
		return billingPhoneNumber;
	}

	public WebElement getBillingFaxNumber() {
		return billingFaxNumber;
	}

	public WebElement getBillingContinueButton() {
		return billingContinueButton;
	}
	
	//Shipping Address
	
	@FindBy(id =  "PickUpInStore")
	private WebElement pickInStoreCheckBox;
	
	@FindBy(xpath = "//h2[text( )='Shipping address']/../..//a[ contains(.,'Back' )]")
	private WebElement shippingAddressbackLink;
	
	@FindBy(xpath =  "//h2[text( )='Shipping address']/../..//input[@value='Continue']")
	private WebElement shippingAddressContinue;

	public WebElement getPickInStoreCheckBox() {
		return pickInStoreCheckBox;
	}

	public WebElement getShippingAddressbackLink() {
		return shippingAddressbackLink;
	}

	public WebElement getShippingAddressContinue() {
		return shippingAddressContinue;
	}
	
	 //shipping method
	
	@FindBy(xpath = "//h2[text( )='Shipping method']/../..//a[ contains(.,'Back' )]")
	private WebElement shippingMethodBackLink;
	
	@FindBy(xpath =  "//h2[text( )='Shipping method']/../..//input[@value='Continue']")
	private WebElement shippingMethodContinue;

	public WebElement getShippingMethodBackLink() {
		return shippingMethodBackLink;
	}

	public WebElement getShippingMethodContinue() {
		return shippingMethodContinue;
	}
	
	 //payment method
	
	@FindBy(xpath = "//label[contains(text(),'Cash On Delivery')]/..//input")
	private WebElement cashOnDeliveryRadioButton;
	
	public WebElement getCashOnDeliveryRadioButton() {
		return cashOnDeliveryRadioButton;
	}

	@FindBy(xpath = "//h2[text( )='Payment method']/../..//a[ contains(.,'Back' )]")
	private WebElement paymentMethodBackLink;
	
	@FindBy(xpath =  "//h2[text( )='Payment method']/../..//input[@value='Continue']")
	private WebElement paymentMethodContinue;

	public WebElement getPaymentMethodBackLink() {
		return paymentMethodBackLink;
	}

	public WebElement getPaymentMethodContinue() {
		return paymentMethodContinue;
	}
	
	// payment Information
	
	@FindBy(xpath = "//h2[text( )='Payment information']/../..//a[ contains(.,'Back' )]")
	private WebElement paymentInformationBackLink;
	
	@FindBy(xpath =  "//h2[text( )='Payment information']/../..//input[@value='Continue']")
	private WebElement paymentInformationContinue;

	public WebElement getPaymentInformationBackLink() {
		return paymentInformationBackLink;
	}

	public WebElement getPaymentInformationContinue() {
		return paymentInformationContinue;
	}
	
	 //confirm order
	
	@FindBy(xpath = "//h2[text( )='Confirm order']/../..//a[ contains(.,'Back' )]")
	private WebElement confirmOrderBackLink;
	
	@FindBy(xpath =  "//h2[text( )='Confirm order']/../..//input[@value='Confirm']")
	private WebElement confirmOrderConfirm;

	public WebElement getConfirmOrderBackLink() {
		return confirmOrderBackLink;
	}

	public WebElement getConfirmOrderConfirm() {
		return confirmOrderConfirm;
	}

	
	
	//h2[text( )='Shipping method']/../..//input[@value="Continue"]
	
	//h2[text( )='Shipping method']/../..//a[ contains(.,'Back' )]
}
