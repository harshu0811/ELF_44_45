package elementRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends BasePage {

	public OrdersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public List<WebElement> getOrderNumbers() {
		return orderNumbers;
	}

	@FindBy(xpath = "//strong[contains(text(),'Order Number')]")
	private List<WebElement> orderNumbers;
}
