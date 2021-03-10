package seleniumBasics;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TotalLinksAmazon {

	public static void main(String[] args) {
		
		BaseUtil bu = new BaseUtil();
		WebDriver driver = bu.init_Browser("Chrome");
		bu.launchURL("https://www.amazon.com/");
		
		ElementUtil eu = new ElementUtil(driver);
		List<WebElement> totalLinks = eu.getElements(PageConstants.links);
		System.out.println(totalLinks.size());
		
		 //total link text
		List<String> totalListText= eu.getElementsListText(PageConstants.links);
		System.out.println(totalListText);
		
		//total footer links
		List<WebElement> footerLinks = eu.getElements(PageConstants.footerLinks);
		System.out.println(footerLinks.size());
		
		//Print footer links texts
		List<String> footerLinksText =eu.getElementsListText(PageConstants.footerLinks);
		for (String k:footerLinksText) { 
			  System.out.println(k); 
			}
		
		//Print footer links based on attribute
		List<String> totalAttributeList = eu.getElementsAttribute(PageConstants.footerLinks, "href");
		
		  for (String s:totalAttributeList) { 
			  System.out.println(s); 
			}
		 
	}
}


