package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttributeValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//to capture tool tip text
		/*driver.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		String toolTipText = driver.findElement(By.cssSelector("img[title='Wooden TV Unit']")).getAttribute("title");
		System.out.println(toolTipText);*/
		
		//to capture alternative text
		/*driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(2000);
		String alternativeText = driver.findElement
				(By.cssSelector("img[title='Wedding Suits']")).getAttribute("alt");
		System.out.println(alternativeText);*/
		
		//to capture the data entered
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(1000);
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		searchBox.clear();
		searchBox.sendKeys("foundation");
		String valueEntered = searchBox.getAttribute("value");
		System.out.println(valueEntered);
	}

}
