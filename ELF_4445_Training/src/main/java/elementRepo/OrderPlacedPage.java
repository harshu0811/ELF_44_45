package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPlacedPage extends BasePage {

	public OrderPlacedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//h1[text()='Thank you']/../..//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(partialLinkText = "Click here for order details.")
	private WebElement orderDetailsLink ;
	
	@FindBy(xpath = "//li[contains(text(),'Order number')]")
	private WebElement orderNumber;
	
	@FindBy(xpath = "//strong[contains(text(),'Your order')]")
	private WebElement orderConfirmationText;

	public WebElement getOrderConfirmationText() {
		return orderConfirmationText;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getOrderDetailsLink() {
		return orderDetailsLink;
	}

	public WebElement getOrderNumber() {
		return orderNumber;
	}
}
