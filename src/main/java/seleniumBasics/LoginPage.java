package seleniumBasics;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {
		BaseUtil bu = new BaseUtil();
		WebDriver driver = bu.init_Browser("Chrome");
		
		bu.launchURL("https://demo.opencart.com/index.php?route=account/login");
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(PageConstants.loginPageEmail, "sheetal5764@test.com");
		eu.doSendKeys(PageConstants.loginPagePassWord, "test@123");
		eu.doClick(PageConstants.loginButton);
		

		if(bu.getPageTitle().equals("My Account")) {
			System.out.println("User is on account page");
		}
		else {
			System.out.println("User is not on account page");
		}
	}

}
