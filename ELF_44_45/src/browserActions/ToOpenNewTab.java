//package browserActions;
//
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ToOpenNewTab {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.hersheyland.com/home");
//		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.ferrerorocher.com/in/en/");
//	}
//
//}
