package launchBrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgde {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	}

}
