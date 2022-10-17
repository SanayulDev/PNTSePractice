package swagLabsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name=\"firstName\"]") WebElement firstName;
	@FindBy(xpath = "//*[@id=\"last-name\"]") WebElement lastName;
	@FindBy(xpath = "//*[@id=\"postal-code\"]") WebElement zipCode;
	@FindBy(xpath = "//*[@id=\"continue\"]") WebElement contButton;
	
	public void enterInfo() throws InterruptedException {
		firstName.sendKeys("Test");
		lastName.sendKeys("Tester");
		zipCode.sendKeys("08401");
	}
	
	public void clickContinue() {
		contButton.click();
	}
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
