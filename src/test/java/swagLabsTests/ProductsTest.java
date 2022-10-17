package swagLabsTests;

import org.testng.annotations.Test;

import swagLabsPages.ProductsPage;

public class ProductsTest extends LogInTest{
	
  @Test
  public void test2() {
	  ProductsPage page = new ProductsPage(driver);
	  page.verifyLinks();
	  page.clickATC();
	  page.clickCart();
  }
}
