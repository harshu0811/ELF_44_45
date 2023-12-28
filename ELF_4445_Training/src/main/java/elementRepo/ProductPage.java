package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath =  "//input[@value='Add to wishlist']")
	private WebElement addToWishListButton;

	public WebElement getAddToWishListButton() {
		return addToWishListButton;
	}

}
