package listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFacebookSignupPageDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayListBox);
		Select monthSelect = new Select(monthListBox);
		Select yearSelect = new Select(yearListBox);
		
		System.out.println(daySelect.isMultiple());
		
		daySelect.selectByVisibleText("25");
		monthSelect.selectByIndex(9);
		yearSelect.selectByValue("2009");
	}
}
