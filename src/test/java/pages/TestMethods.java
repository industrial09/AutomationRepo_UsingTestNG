package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestMethods extends Locators{	
	
	public WebDriver driver = setup("chrome");
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	Locators loc = new Locators();
	
	public void enterUSerName(String userName) {
		WebElement el = driver.findElement(By.id(usernameId));
		wait.until(ExpectedConditions.visibilityOf(el));
		loc.enterData(el, userName);
	}
	
	public void enterPasswrod(String pswd) {
		WebElement el = driver.findElement(By.id(passwordID));
		wait.until(ExpectedConditions.visibilityOf(el));
		loc.enterData(el, pswd);
	}
	
	public void clickOnLoginBtn() {
		WebElement el = driver.findElement(By.id(loc.logInButtonId));
		wait.until(ExpectedConditions.visibilityOf(el));
		loc.clickOnElement(el);
	}
	
	public boolean validateLogOutBtnIsPresent() {
		boolean state= false;
		enterUSerName("Christian");
		enterPasswrod("12345");
		clickOnLoginBtn();
		WebElement el = driver.findElement(By.id(loc.logOutButtonId));
		wait.until(ExpectedConditions.visibilityOf(el));
		state = loc.validateElementIsPresent(el);
		return state;
	}
	
	public boolean validateSaveBtnIsPresent() {
		enterUSerName("Christian");
		enterPasswrod("12345");
		clickOnLoginBtn();
		boolean state= false;
		WebElement el = driver.findElement(By.id(loc.saveButtonId));
		wait.until(ExpectedConditions.visibilityOf(el));
		state = loc.validateElementIsPresent(el);
		return state;
	}
}
