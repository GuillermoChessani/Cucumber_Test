package steps;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class NewTest {
	
	login_steps_POM lsp = new login_steps_POM();
	
  @Test
  public void test() {
	  login_steps_POM lsp = new login_steps_POM();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  lsp.driver.close();
  }
}
