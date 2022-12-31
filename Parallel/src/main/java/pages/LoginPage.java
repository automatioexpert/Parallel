package pages;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverFactory;
import base.TestBase;

public class LoginPage extends TestBase {

	// private WebDriver driver;
//
//	public LoginPage(WebDriver driver) {
//		// this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}

	By username = By.id("user-name");
	By password = By.id("password");
	By loginBtn = By.id("login-button");

	/*
	 * @FindBy(id = "user-name") private WebElement username;
	 * 
	 * @FindBy(id = "password") private WebElement password;
	 * 
	 * @FindBy(id="login-button") private WebElement loginBtn;
	 */

	public void login(String un, String pwd) {

		DriverFactory.getInstance().getDriver().findElement(username).sendKeys(un);
		DriverFactory.getInstance().getDriver().findElement(password).sendKeys(pwd);
		DriverFactory.getInstance().getDriver().findElement(loginBtn).click();

	}

}
