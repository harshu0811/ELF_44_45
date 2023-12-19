package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.sun.tools.javac.util.List;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
//	@FindBys(value = { 
//			@FindBy(id= ""),
//			@FindBy(name = "")
//			})
//	
//	@FindAll(value = {
//			@FindBy(css = ""),
//			@FindBy(className = "")
//	})
	
	@FindBy(id = "newsletter-email")   
	private List<WebElement> newsLetterTextBox;
	
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement newsLetterSubscribeButton;

	public List<WebElement> getNewsLetterTextBox() {
		return newsLetterTextBox;
	}

	public WebElement getNewsLetterSubscribeButton() {
		return newsLetterSubscribeButton;
	}
	
}
