package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;
import pages.UserPage;


public class TestBase {
	
	protected ChromeDriver driver = initial.getDriver();
	protected LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	protected UserPage userpage = PageFactory.initElements(driver, UserPage.class);

}
