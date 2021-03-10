package seleniumBasics;

import org.openqa.selenium.By;

public class PageConstants {
	
	public static final By firstName = By.id("input-firstname");
	public static final By lastName = By.id("input-lastname");
	public static final By email = By.id("input-email");
	public static final By telePhone = By.id("input-telephone");
	public static final By passWord = By.id("input-password");
	public static final By passConf = By.id("input-confirm");
	public static final By subScribe = By.xpath("//input[@type='radio' and @value='0' and @name='newsletter']");
	public static final By privacyPolicy = By.xpath("//input[@type='checkbox']");
	public static final By contiNue = By.xpath("//input[@type='submit']");
	public static final By successPage = By.xpath("//h1[contains(text(),'Your Account Has Been Created')]");
	public static final By successPageContinue = By.xpath("//a[contains(text(),'Continue')]");
	
	//login page
	public static final By loginPageEmail= By.id("input-email");
	public static final By loginPagePassWord= By.id("input-password");
	public static final By loginButton = By.xpath("//input[@type='submit' and @value='Login']");
	
	//Home Page
	public static final By homeButton = By.xpath("//i[@class=\"fa fa-home\"]");
	public static final By searchButton = By.xpath("//input[@type=\"text\" and @name=\"search\"]");
	public static final By searchButtonIcon = By.xpath("//button[@class=\"btn btn-default btn-lg\"]");

	//Amazon Page Links
	public static final By links = By.tagName("a");
	public static final By footerLinks = By.xpath("//li/a[@class='nav_a']");
	//public static final By footerLinksAttribute = By.xpath("href");
	
	//For dropdowns
	public static final By sort = By.id("input-sort");
	public static final By allSortValues = By.xpath("//select[@id='input-sort']");
	public static final By sortWithoutSelect = By.xpath("//select[@id='input-sort']/option");
	
	//OrangeHRM
	public static final By noEmployees = By.id("Form_submitForm_NoOfEmployees");
	public static final By industry = By.id("Form_submitForm_Industry");
	public static final By country = By.id("Form_submitForm_Country");
	public static final By industryListWithoutSelect =By.xpath("//select[@id='Form_submitForm_Industry']/option");
}
