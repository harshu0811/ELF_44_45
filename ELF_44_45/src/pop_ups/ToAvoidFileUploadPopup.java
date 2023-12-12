package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		WebElement uploadButton = driver.findElement(By.id("resumeUpload"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(uploadButton).scrollByAmount(0, 100).perform();
		Thread.sleep(2000);
		uploadButton.sendKeys("D:\\Sumanth ELF\\CourseContentSelenium.pdf");
		
	}
}