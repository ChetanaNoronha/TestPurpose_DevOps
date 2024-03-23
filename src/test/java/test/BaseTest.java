package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	String url = "https://fb.com";// from dev2

	@BeforeTest
	public void setup() {
		// open the browser
		driver = new ChromeDriver(); //open the Chrome browser
	}

	@AfterTest
	public void teardown() {
		// close the browser
		driver.get(url);
	}
}
