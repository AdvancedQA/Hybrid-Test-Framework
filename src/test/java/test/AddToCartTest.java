package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationpractice.pages.AddToCartPage;

public class AddToCartTest {
		
		WebDriver driver;
		AddToCartPage page; 
		//org.apache.logging.log4j.Logger logger = LogManager.getLogger(AddToCartTest.class);
		
		@BeforeTest
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Seleniem\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php?id_product=2&controller=product");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			page = new AddToCartPage(driver);
		}
		
		@Test
		public void validateAddToCart() {
			Assert.assertTrue(page.validateAddToCart(driver));
		}
		
		@AfterTest
		public void quitWindow() {
			driver.quit();
		}

}
