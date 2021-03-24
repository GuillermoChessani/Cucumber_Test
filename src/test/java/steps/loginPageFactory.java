package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPageFactory {
	@FindBy(id = "txtUsername")	WebElement txt_Username;
	@FindBy(id = "txtPassword")	WebElement txt_Password;
	@FindBy(name = "Submit") WebElement btnLogin;
	@FindBy(id = "welcome")	WebElement lblWelcome;
	@FindBy(id = "spanMessage") WebElement lblInvalidCredentials;
	
	WebDriver driver;
	
	public loginPageFactory(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String username) {
		txt_Username.sendKeys(username);
	}

	public void setPassword(String password) {
		txt_Password.sendKeys(password);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void assertValidLogin() {
		lblWelcome.isDisplayed();
	}
	
	public void assertInvalidLogin() {
		lblInvalidCredentials.isDisplayed();
	}

}
