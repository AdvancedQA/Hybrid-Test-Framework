package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationpractice.pages.ProductSelectionPage;

public class ProductSelectionPageTest {
	
	WebDriver driver;
	ProductSelectionPage page;
	//org.apache.logging.log4j.Logger logger = LogManager.getLogger(AddToCartTest.class);
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Seleniem\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		page = new ProductSelectionPage(driver);
		
	}
	
	@Test
	public void validateProductSelectionPage() {
		Assert.assertTrue(page.validateProductSelectionPage(driver));
	}
	
	@AfterTest
	public void quitWindow() {
		driver.quit();
	}

}
