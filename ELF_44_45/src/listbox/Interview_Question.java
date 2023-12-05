package listbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Interview_Question {

	public void selectLastOption(WebElement dropDownElement) {
		Select listbox = new Select(dropDownElement);
		int totalNoOfOptions = listbox.getOptions().size();
		listbox.selectByIndex(totalNoOfOptions-1);
	}
}
