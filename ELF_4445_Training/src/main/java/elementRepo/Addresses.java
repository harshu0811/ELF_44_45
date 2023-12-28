package elementRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addresses extends BasePage{

	public Addresses(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//input[@value='Delete']")
	private List<WebElement> deleteButtons;

	public List<WebElement> getDeleteButtons() {
		return deleteButtons;
	}
	
}
