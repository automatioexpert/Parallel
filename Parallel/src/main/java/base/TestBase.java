package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	BrowserFactory bf = new BrowserFactory();

	@BeforeMethod
	public void launchApplication() {
		
		if(DriverFactory.getInstance().getDriver()==null) {
			DriverFactory.getInstance().setDriver(bf.createBrowserInstance("chrome"));
		}

		
		
		WebDriver driver = DriverFactory.getInstance().getDriver();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.saucedemo.com/");
	}

	@AfterMethod
	public void tearDown() {
		
		DriverFactory.getInstance().closeBrowser();
		

	}
}
