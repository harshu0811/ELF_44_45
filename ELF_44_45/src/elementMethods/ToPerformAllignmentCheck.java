package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformAllignmentCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement emailTextbox = driver.findElement(By.id("Email"));
		WebElement passwordTextbox = driver.findElement(By.id("Password"));
		
//		Point emailBoxLoc = emailTextbox.getLocation();
//		Point passwordBoxLoc = passwordTextbox.getLocation();
//		System.out.println("X value of email " + emailBoxLoc.getX());
//		System.out.println("X value of password " + passwordBoxLoc.getX());
//		
//		if(emailBoxLoc.getX()==passwordBoxLoc.getX()) {
//			System.out.println("Email box & Password box is alligned properly towards left");
//		}else {
//			System.out.println("Email box & Password box is not alligned properly towards left");
//		}
		Rectangle emailRect = emailTextbox.getRect();
		
		System.out.println(emailRect.getWidth());
		
		emailRect.setWidth(200);
		
		System.out.println(emailRect.getWidth());
		
		System.out.println(emailTextbox.getRect().getWidth()); 
	}
}
