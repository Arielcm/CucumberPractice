package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public void completeText(WebElement element,String string) {
		element.sendKeys(string);
	}
	
	public void submit(WebElement element) {
		element.submit();
	}
	
	public static void waitElement(WebDriver driver, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
