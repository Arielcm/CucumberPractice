package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{

	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='rightPanel']/div/div/h1")
	private WebElement title;
	@FindBy(xpath = "//*[@id='leftPanel']/ul/li[8]/a")
	private WebElement logout;
	
	private String titlepage="Accounts Overview";
	
	public boolean UserPageIsDisplayed() {
		return title.getText().equals(titlepage);
	}
	
	public void logout() {
		click(logout);
	}
	
	public void waitElement() {
		BasePage.waitElement(driver, title);
	}

}
