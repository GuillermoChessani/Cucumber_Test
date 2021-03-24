package Pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageFactory {
	private static WebDriver driver;
	WebElement element;
	public static String varUser = "Admin";
	public static String varPass = "admin123";
	public static String varMail = "admin@hotmail.com";
	
	WebDriverWait wait;
	
	By txtUserName = By.name("txtUsername");
	By txtPassword = By.name("txtPassword");
	By btnLogin = By.name("Submit");
	By linkForgotPassword = By.linkText("Forgot your password?");
	By txtAuthentication_userName = By.id("securityAuthentication_userName");
	By btnReset = By.id("btnSearchValues");
	By btnCancel = By.id("btnCancel");
	
	By welcomeLink = By.id("welcome");

    
	By linkAdmin = By.xpath("//b[.='Admin']");
	By aUser = By.xpath("//a[.='steven.edwards']");
	
	// --------------------------	DASHBOARD	------------------------------
	
	// --------------------------	ASSIGN LEAVE	------------------------------
		By btnAssignLeave = By.xpath("//span[.='Assign Leave']");
		By txtEmployeeName = By.id("assignleave_txtEmployee_empName");
		By cmbLeaveType = By.id("assignleave_txtLeaveType");
		By calFromDate = By.id("assignleave_txtFromDate");
		By lblFromDate = By.xpath("//*[@for='assignleave_txtFromDate']");
		By calToDate = By.id("assignleave_txtToDate");
		By lblToDate = By.xpath("//*[@for='assignleave_txtToDate']");
		By txtComment = By.id("assignleave_txtComment");
		By btnSubmitAssignLeave = By.id("assignBtn");
			// --------------------------	APPLY LEAVE	------------------------------
		By btnApplyLeave = By.xpath("//span[.='Apply Leave']");
		By cmbApplyType = By.id("applyleave_txtLeaveType");
		By calApplyFromDate = By.id("applyleave_txtFromDate");
		By lblApplyFromDate = By.xpath("//*[@for='applyleave_txtFromDate']");
		By calApplyToDate = By.id("applyleave_txtToDate");
		By lblApplyToDate = By.xpath("//*[@for='applyleave_txtToDate']");
		By txtApplyComment = By.id("applyleave_txtComment");
		By btnSubmitApplyLeave = By.id("applyBtn");
		
		
	
	
	public PageFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName() {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtUserName)).sendKeys(varUser);
	}

	public void setPassword() {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword)).sendKeys(varPass);
	}
	
	public void setInvalidPassword() {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtPassword)).sendKeys("Invalid");
	}
	
	public void clickLogin() {
		
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnLogin)).click();
	
	}
	
	public void clickForgotPassword() {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(linkForgotPassword)).click();
	}
	
	public void setUserNameAuthentication() {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtAuthentication_userName)).sendKeys(varMail);
	}
	
	public void clickResetPassword() {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnReset)).click();
	}
	
	public void clickCancelPassword() {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(btnCancel)).click();
	}
	
	public void assertWelcome(){
		Assert.assertEquals(true, driver.findElement(welcomeLink).isDisplayed());
		
	}
	
	
	// --------------------------	DASHBOARD	------------------------------
	
	// --------------------------	ASSIGN LEAVE	------------------------------
		public void clickAssignLeave() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnAssignLeave)).click();
		}
		
		public void setEmployeeName() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(txtEmployeeName)).sendKeys("John Smith");
		}
		
		public void selectLeaveType() {
			Select drpLeaveType = new Select(driver.findElement(cmbLeaveType));
			drpLeaveType.selectByVisibleText("US - Personal");
		}
		
		public void setDateFrom() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(calFromDate)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(calFromDate)).sendKeys("07-10-2020");
			wait.until(ExpectedConditions.visibilityOfElementLocated(lblFromDate)).click();
			
		}
		
		public void setDateTo() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(calToDate)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(calToDate)).sendKeys("14-10-2020");
			wait.until(ExpectedConditions.visibilityOfElementLocated(lblToDate)).click();
			
		}
		
		public void setComments() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(txtComment)).sendKeys("Summer Vacation");
		}
		
		public void submitLeave() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnSubmitAssignLeave)).click();
		}
		
		public void clickLinkAdmin() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(linkAdmin)).click();
		}
		
		public void clickaUser() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(aUser)).click();
		}
		
		// --------------------------	APPLY LEAVE	------------------------------
		
		public void clickApplyLeave() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnApplyLeave)).click();
		}
		
		public void selectApplyLeaveType() {
			Select drpLeaveType = new Select(driver.findElement(cmbApplyType));
			drpLeaveType.selectByVisibleText("US - Personal");
		}
		
		
		public void setDateApplyFrom() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(calApplyFromDate)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(calApplyFromDate)).sendKeys("07-10-2020");
			wait.until(ExpectedConditions.visibilityOfElementLocated(lblApplyFromDate)).click();
			
		}
		
		public void setDateApplyTo() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(calApplyToDate)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(calApplyToDate)).sendKeys("14-10-2020");
			wait.until(ExpectedConditions.visibilityOfElementLocated(lblApplyToDate)).click();
			
		}
		
		public void setCommentsApply() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(txtApplyComment)).sendKeys("Summer Vacation");
		}
		
		public void submitLeaveApply() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btnSubmitApplyLeave)).click();
		}
		
		public void clickLinkAdminApply() {
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(linkAdmin)).click();
		}
		
		
		
		}
