package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagyesh\\eclipse-workspace\\Chromebrowser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		
		driver.close();
		
		//driver.getTitle();

	}

}
