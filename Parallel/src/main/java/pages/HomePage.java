package pages;

import org.openqa.selenium.By;

import base.DriverFactory;
import base.TestBase;

public class HomePage extends TestBase {

	By products = By.cssSelector("span.title");

	By addToCart = By.xpath("(//button[contains(text(),'Add to cart')])[1]");

	By cartLink = By.cssSelector("a.shopping_cart_link");

	public String getProductHeaderText() {

		
		return DriverFactory.getInstance().getDriver().findElement(products).getText();
		//return DriverFactory.driver().findElement(products).getText();

	}

	public void addToCart() {

		DriverFactory.getInstance().getDriver().findElement(addToCart).click();
	}
	
	public void goToCartPage() {
		DriverFactory.getInstance().getDriver().findElement(cartLink).click();
	}
	
	
}
