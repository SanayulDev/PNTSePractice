package swagLabsTests;


import org.testng.annotations.Test;

import swagLabsPages.CheckoutPage;

public class CheckoutTest extends YouCartTest{
	
  @Test
  public void test4() throws InterruptedException {
	  CheckoutPage page = new CheckoutPage(driver);
	  Thread.sleep(5000);
//	  page.enterInfo("Test", "Data", "08401");
	  page.enterInfo();
	  page.clickContinue();
  }
  
  
}
