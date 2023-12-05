package childElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
		
		WebElement indianBattingTable = driver.findElement(By.xpath("//span[text()='India']/../../../..//table[contains(@class,'scorecard-table')]"));
		
		List<WebElement> playersName = indianBattingTable.findElements(By.xpath("tbody/tr[@class='']/td[1]/div/a"));
		List<WebElement> playersScore = indianBattingTable.findElements(By.xpath("tbody/tr[@class='']/td[3]/strong"));
	
		for(int i=0; i<playersName.size(); i++) {
			System.out.print(playersName.get(i).getText()+"		-	");
			System.out.println(playersScore.get(i).getText());
		}
	}

}
