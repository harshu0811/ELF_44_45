package generic_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//p[@class='content']")
	private WebElement confirmationMsg;
	
	@FindBy(tagName = "h1")
	private WebElement headingText;
	
	public WebElement getHeadingText() {
		return headingText;
	}

	public WebElement getConfirmationMsg() {
		return confirmationMsg;
	}
	@FindBy(partialLinkText  = "Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutlink;
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText  = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText  = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText  = "ELECTRONICS")
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText  = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;
	
	@FindBy(partialLinkText  = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadsLink;
	
	@FindBy(partialLinkText  = "JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText  = "GIFT CARDS")
	private WebElement giftCardsLink;
	
	@FindBy(partialLinkText = "Orders")
	private WebElement ordersLink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']/../span[contains(text(),'(')]")
	private WebElement noOfProductsInShoppingCart;
	
	@FindBy(partialLinkText = "Addresses")
	private WebElement addressesLink;

	public WebElement getAddressesLink() {
		return addressesLink;
	}

	public WebElement getNoOfProductsInShoppingCart() {
		return noOfProductsInShoppingCart;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public WebElement getOrdersLink() {
		return ordersLink;
	}
	
	
}
