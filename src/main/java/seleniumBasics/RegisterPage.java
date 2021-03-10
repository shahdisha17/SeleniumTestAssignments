package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	public static void main(String[] args) {
		
		BaseUtil bu = new BaseUtil();
		WebDriver driver = bu.init_Browser("Chrome");
//launch url
		bu.launchURL("https://demo.opencart.com/index.php?route=account/register");
		
//All webelements
		/*
		 * By firstName = By.id("input-firstname"); By lastName =
		 * By.id("input-lastname"); By email = By.id("input-email"); By telePhone =
		 * By.id("input-telephone"); By passWord = By.id("input-password"); By passConf
		 * = By.id("input-confirm"); By subScribe =
		 * By.xpath("//input[@type='radio' and @value='0' and @name='newsletter']"); By
		 * privacyPolicy = By.xpath("//input[@type='checkbox']"); By contiNue =
		 * By.xpath("//input[@type='submit']");
		 */
		
		ElementUtil eleutil= new ElementUtil(driver);
		eleutil.doSendKeys(PageConstants.firstName, "Sheetal");
		eleutil.doSendKeys(PageConstants.lastName, "Cunningham");
		eleutil.doSendKeys(PageConstants.email, "sheetal5764@test.com");
		eleutil.doSendKeys(PageConstants.telePhone, "737537576");
		eleutil.doSendKeys(PageConstants.passWord, "test@123");
		eleutil.doSendKeys(PageConstants.passConf, "test@123");
		eleutil.doClick(PageConstants.subScribe);
		eleutil.doClick(PageConstants.privacyPolicy);
		eleutil.doClick(PageConstants.contiNue);
		
		if(bu.getPageTitle().equals("Your Account Has Been Created!")) {
			System.out.println("Registration is successful");
		}
		else {
			System.out.println("Registration is non-successful");
		}
		
		eleutil.doClick(PageConstants.successPageContinue);
		
		if(bu.getPageTitle().equals("My Account")) {
			System.out.println("User is on account page");
		}
		else {
			System.out.println("User is not on account page");
		}
		
		bu.quitBrowser();
		
	}

}
