package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Setup {
	public WebDriver setup(String driverType) {
		//Make a general setup for all kind of driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MADELEINY\\Documents\\CHRISTIAN\\Nagarro\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = null;
        if(driverType == "chrome") driver = new ChromeDriver();
        else if(driverType == "firefox") driver = new FirefoxDriver();
        else if(driverType == "IE") driver = new InternetExplorerDriver();
        driver.get("https://example.testproject.io/web/");
        driver.manage().window().maximize();
        return driver;
	}
}
