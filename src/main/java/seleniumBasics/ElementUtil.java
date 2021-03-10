package seleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String getElementText(By locator) {
		return driver.findElement(locator).getText();
	}
	public boolean getElementDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	
	
	public List<String> getElementsListText(By locator) {
		List<String> eleList = new ArrayList<String>();
		
		List<WebElement> elementListText = getElements(locator);
		for(WebElement e: elementListText) {
			if(!e.getText().isEmpty()) {
			eleList.add(e.getText());
			}
		}
		return eleList;
	}
	
	public List<String> getElementsAttribute(By locator, String attrName){
		List<String> attributeList= new ArrayList<String>();
		
		List<WebElement> elementList = getElements(locator);
		for(WebElement e: elementList) {
			if(!e.getAttribute(attrName).isEmpty()) { 
				attributeList.add(e.getAttribute(attrName));
			}
		}
		return attributeList;
	}
	
	
// /*********************************************************************************************
	
	public void doSelectByIndex(By locator , int dropIndex) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(dropIndex);
	}
	
	public void doSelectByValue(By locator , String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void doSelectByVisibleText(By locator , String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public void doSelectByOptions(By locator, String text) {
		Select select = new Select(getElement(locator));
		List<WebElement> allDropList = select.getOptions();
		for(WebElement e: allDropList) {
			String textValue =e.getText();
			if(textValue.equals(text)) {
				e.click();
				break;
			}
		}
	}
	
	public void doDopDownWithoutSelect(By locator, String value) {
		List<WebElement> sortList = getElements(locator);
		for(WebElement e: sortList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	
}
