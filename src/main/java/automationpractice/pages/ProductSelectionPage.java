package automationpractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumimplementation.SeleniumImplementation;

public class ProductSelectionPage {
	
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
	WebElement itemImage;
	@FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]")
	WebElement btnMore;
	
    SeleniumImplementation selenium;
	
	public ProductSelectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium = new SeleniumImplementation();
	}
	
    public boolean validateProductSelectionPage(WebDriver driver) {
		
	    selenium.performMouseHower(itemImage, driver);
	    selenium.click(btnMore);
		
		String expectedTitle = "Blouse - My Store";
		String title = driver.getTitle();
		
		if (expectedTitle.equals(title)) {
			return true;
		}
		
		return false;
	}

}
