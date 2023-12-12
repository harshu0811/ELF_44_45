package pop_ups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopup2 {

	//to select future date
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime ldt = LocalDateTime.now();
		String monthName = ldt.getMonth().name();
		monthName = ""+monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.agoda.com/");
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		Thread.sleep(1000);
		for(;;) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			try {
				driver.findElement(By.xpath("//div[text()='"+monthName+" "+(year+1)+"']/..//span[text()='"+(day-2)+"']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='"+monthName+" "+(year+1)+"']/..//span[text()='"+(day-1)+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
	}
}