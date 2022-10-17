package swagLabsTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import swagLabsPages.logInPage;

public class LogInTest extends DriversTest{
	
  @Test
  public void test1() {
	  logInPage page = new logInPage(driver);
	  page.verifyTitle();
	  SoftAssert assert1 = new SoftAssert();
	  assertEquals(driver.getTitle(), "Swag Labs");
	  
	  page.enterUsername();
	  page.enterPassword();
	  page.clickLogin();

	  assert1.assertAll();
  }
}
