package automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumimplementation.SeleniumImplementation;

public class AddToCartPage {
	
	@FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
	WebElement txtQuantity;
	@FindBy(xpath = "//*[@id=\"group_1\"]")
	WebElement selectSize;
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	WebElement btnAddToCart;
	@FindBy(css = "div#layer_cart a > span")
	WebElement btnCheckOut;
	
	SeleniumImplementation selenium;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new SeleniumImplementation();
	}
	
	public boolean validateAddToCart(WebDriver driver) {
		
		selenium.clear(txtQuantity);
		selenium.setText("3", txtQuantity);
		selenium.selectByVisibleText(selectSize, "M");	
		selenium.click(btnAddToCart);
		selenium.clickByJavaScriptExecutor(btnCheckOut, driver);
		
		String expectedTitle = "Order - My Store";
		String title = driver.getTitle();
		
		if (expectedTitle.equals(title)) {
			return true;
		}
		
		return false;	
	}
}
