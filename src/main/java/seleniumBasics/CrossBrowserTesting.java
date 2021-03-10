package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String browser="safari";
		switch (browser) {
		case "Chrome": 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Chromebrowser\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			break;
		case "Firefox" :
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Firefoxbrowser\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    break;
		case "Edge" :
			System.setProperty("webdriver.edge.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Edgebrowser\\msedgedriver.exe");
		    driver = new EdgeDriver();  
		    break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Browser is not available");
			break;
		}
		
		driver.get("https://www.facebook.com/");
		String fbTitle= driver.getTitle();
		
		if(fbTitle.equals("Facebook - Log In or Sign Up")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("email")).click();
		
		driver.quit();

	}

}
