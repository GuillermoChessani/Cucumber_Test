package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFactory {
	WebDriver driver;
	WebElement element;
	
	By txtUserName = By.id("txtUsername");
	By txtPassword = By.id("txtPassword");
	By btnLogin = By.name("Submit");
	By lblWelcome = By.id("welcome");

	public PageFactory(WebDriver driver) {
		this.driver = driver;
	}

	public void setUserName(String varUser) {
		driver.findElement(txtUserName).sendKeys(varUser);
	}

	public void setPassword(String varPass) {
		driver.findElement(txtPassword).sendKeys(varPass);
	}

	public void assertWelcome() {
		driver.findElement(lblWelcome).isDisplayed();
	}
	
	public void clickLogin() {
		driver.findElement(btnLogin).click();
	}
	
}
