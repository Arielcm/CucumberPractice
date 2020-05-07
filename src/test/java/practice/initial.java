package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class initial {

	private static WebDriver driver;
	
	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	}
	
	@After()
	public void quitBrowser() {
	    driver.quit();
	}
	
	public static ChromeDriver getDriver() {
		return (ChromeDriver) driver;
	}
}
