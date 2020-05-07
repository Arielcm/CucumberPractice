package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "username")
	private WebElement user;
	@FindBy(name = "password")
	private WebElement pass;
	
	private String titlepage="ParaBank | Welcome | Online Banking";
	
	public boolean LoginPageIsDisplayed() {
		return this.getTitle().equals(titlepage);
	}
	
	public void completeLogin(String userS, String passS) {
		this.completeText(user, userS);
		this.completeText(pass, passS);
		this.submit(user);
	}
	
}
