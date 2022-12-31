package tests;

import org.testng.annotations.Test;

import base.DriverFactory;
import base.TestBase;
import pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage login = new LoginPage();

	@Test(priority = 0)
	public void login() throws InterruptedException {
		login.login("standard_user", "secret_sauce");
		System.out.println("Login test passed..!!");

		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void titleTest() {
		System.out.println(DriverFactory.getInstance().getDriver().getTitle());
	}

	
	
}
