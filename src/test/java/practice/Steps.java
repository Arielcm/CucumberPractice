package practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps extends TestBase{
	
	@Given("I am in the login page")
	@Given("I am in the login page of the Para Bank Application")
	public void i_am_in_the_login_page_of_the_Para_Bank_Application() {
		loginpage.LoginPageIsDisplayed();
	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_credentials(String username, String password) {
		loginpage.completeLogin(username, password);
	}

	@Then("I should be taken to the Overview page")
	public void i_should_be_taken_to_the_Overview_page() {
		userpage.waitElement();
		userpage.UserPageIsDisplayed();
        userpage.logout();
	}
}
