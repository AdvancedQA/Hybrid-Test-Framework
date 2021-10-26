package automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import seleniumimplementation.SeleniumImplementation;

public class IndexPageObjects {

	By userId = By.xpath("//*[@id=\"email\"]");
	By password = By.xpath("//*[@id=\"passwd\"]");
	By submit = By.xpath("//*[@id=\"SubmitLogin\"]");
	
	SeleniumImplementation selenium;
	
	public IndexPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new SeleniumImplementation();
	}
	
	public boolean validateLogin(WebDriver driver) {
		
		WebElement userName = driver.findElement(userId);
		userName.sendKeys("sashi.imeshika@gmail.com");
		WebElement pass = driver.findElement(password);
		pass.sendKeys("imeshika");
		WebElement signin = driver.findElement(submit);
		signin.click();
		
		String expectedTitle = "My account - My Store";
		String title = driver.getTitle();
		
		if (expectedTitle.equals(title)) {
			return true;
		}
		
		return false;
	}

}
