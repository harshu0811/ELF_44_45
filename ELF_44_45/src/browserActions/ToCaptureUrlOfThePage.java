package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrlOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.audi.in/in");
		String titleOfThePage = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println(titleOfThePage);
		System.out.println(url);
	}

}
