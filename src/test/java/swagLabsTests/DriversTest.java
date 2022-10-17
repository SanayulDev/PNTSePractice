package swagLabsTests;

import org.testng.annotations.BeforeTest;

import swagLabsPages.Drivers;

import org.testng.annotations.AfterTest;

public class DriversTest extends Drivers{

  @BeforeTest
  public void startBrowser() {
	  getDrivers("chrome");
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();

	  
  }

  @AfterTest
  public void closeBrowser() {
	  driver.close();
	  driver.quit();
  }

}
