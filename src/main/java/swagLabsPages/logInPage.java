package swagLabsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {
	public WebDriver driver;
	
	@FindBy(id = "user-name") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(name = "login-button") WebElement loginBtn;
	
	public void enterUsername() {
		username.sendKeys("standard_user");
	}
	
	public void enterPassword() {
		password.sendKeys("secret_sauce");
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	public void verifyTitle() {
		System.out.println(driver.getTitle());
	}
	
	public logInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
