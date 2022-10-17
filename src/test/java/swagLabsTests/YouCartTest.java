package swagLabsTests;

import org.testng.annotations.Test;

import swagLabsPages.YourCartPage;

public class YouCartTest extends ProductsTest{
  @Test
  public void test3() {
	  YourCartPage page = new YourCartPage(driver);
	  page.clickCheckout();
  }
}
