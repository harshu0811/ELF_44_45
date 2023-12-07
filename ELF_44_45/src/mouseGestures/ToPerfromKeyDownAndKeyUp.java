package mouseGestures;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerfromKeyDownAndKeyUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://parivahan.gov.in/parivahan/");
		Actions actions = new Actions(driver);
		List<WebElement> allNavElements = driver.findElements(By.xpath("//li[@data-type='menu_item' and @data-level='1']"));
		
		for(WebElement navElement : allNavElements) {
			actions.keyDown(Keys.SHIFT).perform();
			navElement.click();
			actions.keyUp(Keys.SHIFT).perform();
		}
		
	}

}
