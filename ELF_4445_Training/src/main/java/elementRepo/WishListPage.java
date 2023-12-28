package elementRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{

	public WishListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//td[@class='product']")
	private List<WebElement> productNames;

	public List<WebElement> getProductNames() {
		return productNames;
	}
}
