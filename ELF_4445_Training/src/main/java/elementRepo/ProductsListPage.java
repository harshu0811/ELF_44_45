package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsListPage extends BasePage {

	public ProductsListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy (xpath =  "//h2[@class='product-title']")
	private WebElement productName;

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	

}
