package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class login_steps_POM {
	WebDriver driver = null;
	loginPageFactory pf; 
	
	public login_steps_POM() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("------------------LOGIN STEPS PAGE FACTORY");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("User is on login page");

	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		pf = PageFactory.initElements(driver, loginPageFactory.class );
		pf.setUserName(username);
		pf.setPassword(password);
		System.out.println("User enter username and password");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		pf.clickLogin();
		System.out.println("User click login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		pf.assertValidLogin();
		System.out.println("User is navigated to the home page");
		driver.close();
	}
	
	@Then("an invalid credentials message is displayed")
	public void an_invalid_credentials_message_is_displayed() {
		pf.assertInvalidLogin();
		System.out.println("User provided invalid credentials");
		driver.close();
	}
	

}
