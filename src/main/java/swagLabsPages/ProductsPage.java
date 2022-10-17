package swagLabsPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//THIS IS THE PRODUCT PAGE
public class ProductsPage {
	WebDriver driver;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") WebElement atcBackpack;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") WebElement atcBikeLight;
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a") WebElement goToCart;
	
	//ATC= ADD TO CART
	public void clickATC() {
		atcBackpack.click();
		atcBikeLight.click();
	}
	
	public void clickCart() {
		goToCart.click();
	}
	
	public void verifyLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Totals link on the page: " + links.size());
		
		for (int i=0; i<links.size(); i++) {
		System.out.println("Link names: " + links.get(i).getText());
		}
	}
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
