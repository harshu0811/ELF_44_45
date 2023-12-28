package elementRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "termsofservice")
	private WebElement termsOfServiceCheckBox;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	@FindBy(xpath =  "//a[@class='product-name']")
	private List<WebElement> productNames;

	public List<WebElement> getProductNames() {
		return productNames;
	}

	public WebElement getTermsOfServiceCheckBox() {
		return termsOfServiceCheckBox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	
	

}
