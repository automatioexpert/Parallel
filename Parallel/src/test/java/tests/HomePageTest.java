package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest  extends TestBase{

	LoginPage login = new LoginPage();
	HomePage home = new HomePage();

	@Test(priority = 0)
	public void login() throws InterruptedException {
		login.login("standard_user", "secret_sauce");
		System.out.println("Login test passed..!!");

		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void addProductToCartTest() throws InterruptedException {
		Thread.sleep(3000);
		//String products = home.getProductHeaderText();
		//Assert.assertEquals(products, "Products");
		home.addToCart();
		home.goToCartPage();
		System.out.println("addProductToCartTest passed");

	}

}
