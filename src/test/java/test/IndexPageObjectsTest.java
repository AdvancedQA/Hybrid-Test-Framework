package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationpractice.pages.IndexPageObjects;

public class IndexPageObjectsTest {
	
	WebDriver driver;
	IndexPageObjects page;
	//org.apache.logging.log4j.Logger logger = LogManager.getLogger(AddToCartTest.class);
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Seleniem\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		page = new IndexPageObjects(driver);
		
	}
	
	@Test
	public void validateLogin() {
		Assert.assertTrue(page.validateLogin(driver));
	}
	
	@AfterTest
	public void quitWindow() {
		driver.quit();
	}


}
