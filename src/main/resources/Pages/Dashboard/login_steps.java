package steps;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class login_steps {
	WebDriver driver = null;
	
	public login_steps() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("------------------LOGIN STEPS NORMAL");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println("User is on login page");
		
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		System.out.println("User enter username and password");
//		throw new io.cucumber.java.PendingException();
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("Submit")).click();
		System.out.println("User click login button");
//		throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		WebElement message = driver.findElement(By.id("welcome")); 
		assertEquals(true,message.isDisplayed());
		System.out.println("User is navigated to the home page");
//		throw new io.cucumber.java.PendingException();
	}

}
