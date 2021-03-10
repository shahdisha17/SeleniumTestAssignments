package seleniumBasics;

import org.openqa.selenium.WebDriver;

public class OrangeHRMDropDown {

	public static void main(String[] args) {
		BaseUtil bu = new BaseUtil();
		WebDriver driver =bu.init_Browser("Chrome");
		bu.launchURL("https://www.orangehrm.com/orangehrm-30-day-trial/");

		ElementUtil eu = new ElementUtil(driver);
		eu.doSelectByIndex(PageConstants.noEmployees, 7);
		eu.doSelectByVisibleText(PageConstants.industry, "Automotive");
		eu.doSelectByValue(PageConstants.country, "Albania");
		eu.doSelectByOptions(PageConstants.industry, "Electronics");
		eu.doDopDownWithoutSelect(PageConstants.industryListWithoutSelect, "Computer/Technology-Services");
	}

}
