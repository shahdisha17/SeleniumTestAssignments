package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlaunch {
	public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Firefoxbrowser\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	String fbTitle= driver.getTitle();
	
	if(fbTitle.equals("Facebook - Log In or Sign Up")) {
		System.out.println("Correct Title");
	}else {
		System.out.println("Incorrect title");
	}
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	driver.quit();
}
}