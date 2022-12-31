package base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private DriverFactory() {

	}

	private static DriverFactory instance = new DriverFactory();

	public static DriverFactory getInstance() {
		return instance;

	}

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {

		return driver.get();
	}

	public void setDriver(WebDriver para) {
		driver.set(para);
	}

	public void closeBrowser() {
		driver.get().close();
		driver.remove();

	}


	public static WebDriver driver() {
	
		return DriverFactory.getInstance().getDriver();
	}
}
