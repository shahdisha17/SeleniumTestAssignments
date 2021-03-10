package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownVerification {

	public static void main(String[] args) {
		
		BaseUtil bu = new BaseUtil();
		WebDriver driver =bu.init_Browser("Chrome");
		bu.launchURL("https://demo.opencart.com/index.php?route=product/category&path=57");

		ElementUtil eu = new ElementUtil(driver);
		
		eu.doSelectByVisibleText(PageConstants.sort, "Rating (Lowest)");
		
		eu.doSelectByOptions(PageConstants.allSortValues, "Price (High > Low)");
			
		eu.doDopDownWithoutSelect(PageConstants.sortWithoutSelect, "Rating (Lowest)");
		
		
		
		
	}

}


