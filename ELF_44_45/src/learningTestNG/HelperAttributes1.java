package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperAttributes1 {   //TestNG class

	@Test(priority=1)
	public void run() {    //Test case
		Reporter.log("Hi lets start using TestNG",true);
		Reporter.log("I am from run method",true);//test steps
	}
	
	@Test(priority=1, invocationCount=' ')
	public void add() {
		Reporter.log("I am form add method",true);
	}
	
	@Test
	public void pause() {
		Reporter.log("I am form pause method",true);
	}
}
