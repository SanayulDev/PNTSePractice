package swagLabsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]") WebElement checkoutButton;
	
	public void clickCheckout() {
		checkoutButton.click();
	}
	
	public YourCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
