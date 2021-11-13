package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.Setup;

public class Locators extends Setup{
	
	public final String usernameId = "name";
	public final String passwordID = "password";
	public final String logInButtonId = "login";
	public final String logOutButtonId = "logout";
	public final String saveButtonId= "save";
	
	public void enterData(WebElement el, String data) {
		WebElement element = el;
		element.sendKeys(data);
	}
	
	public void clickOnElement(WebElement el) {
		el.click();
	}
	
	public boolean validateElementIsPresent(WebElement el) {
		boolean state = false;
		if(el.isDisplayed()) state = true;
		return state;
	}
}
