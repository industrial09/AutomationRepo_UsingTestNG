package mainScripts;

import org.junit.Test;
import org.testng.Assert;

import pages.TestMethods;

public class LoginTests extends TestMethods{
	/*@BeforeTest
	public void setUp() {
		setup();
	}
	
	@AfterTest
	public void tearDown() {
		teardown();
	}*/
	
	//Remember to try this with TestNG plugin and use above TestNG anotations
	@Test
	public void validateLogOutButtonDisplayed() {
		Assert.assertTrue(validateLogOutBtnIsPresent(), "LogOut button is not present after entering user, pswd and clicking on Login");
	}
	
	@Test
	public void validateSaveButtonDisplayed(){
		Assert.assertTrue(validateSaveBtnIsPresent(), "LogOut button is not present after entering user, pswd and clicking on Login");
	}
}
