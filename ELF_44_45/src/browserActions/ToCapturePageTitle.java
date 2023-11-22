package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturePageTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://bmwindia.co.in/");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
	}

}
