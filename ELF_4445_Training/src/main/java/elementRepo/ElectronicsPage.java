package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePage{

	public ElectronicsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//ul[contains(.,'Home')]")
	private WebElement pageText;
	
	public WebElement getPageText() {
		return pageText;
	}

	@FindBy(partialLinkText = "Camera, photo")
	private WebElement cameraPhotoLink;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellPhonesLink;

	public WebElement getCameraPhotoLink() {
		return cameraPhotoLink;
	}

	public WebElement getCellPhonesLink() {
		return cellPhonesLink;
	}
}
