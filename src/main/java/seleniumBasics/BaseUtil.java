package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {

	WebDriver driver;
	/**
	 * 
	 * @param browserName This method is used for browser initialization.
	 */
	public WebDriver init_Browser(String browserName) {
		System.out.println("Current open broweser is : " +browserName);
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Chromebrowser\\chromedriver_win32\\chromedriver.exe");
		 switch (browserName) {
			case "Chrome": 
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Chromebrowser\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
				break;
			case "Firefox" :
				//System.setProperty("webdriver.gecko.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Firefoxbrowser\\geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			    break;
			case "Edge" :
				//System.setProperty("webdriver.edge.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Edgebrowser\\msedgedriver.exe");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();  
			    break;
			case "Safari":
				driver = new SafariDriver();
				break;
			default:
				System.out.println("Browser is not available");
				break;
			}
		return driver;
	}
	
	public void launchURL(String url) {
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getBrowserCurrentURL() {
		return driver.getCurrentUrl();
	}
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
}
