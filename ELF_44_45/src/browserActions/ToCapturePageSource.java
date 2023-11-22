package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturePageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String titleOfThePage = driver.getTitle();		
		String sourceCode = driver.getPageSource();
		System.out.println(titleOfThePage);
		System.out.println(sourceCode);
		
	}

}
