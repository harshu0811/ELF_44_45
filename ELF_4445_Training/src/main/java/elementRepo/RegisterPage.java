package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleradioButton;
	
	@FindBy(id = "gender-female")
	private WebElement femaleradioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id ="ConfirmPassword")
	private WebElement confirmPasswordTextBox;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getMaleradioButton() {
		return maleradioButton;
	}

	public WebElement getFemaleradioButton() {
		return femaleradioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
}
