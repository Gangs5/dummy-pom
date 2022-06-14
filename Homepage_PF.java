package StepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF  {
	
	
		@FindBy(id = "custom logo")
	WebElement logo;
	
	@FindBy(id = "custom image")
	WebElement image;

	private WebDriver driver;
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public boolean validateImage() {
		return image.isDisplayed();
	}
	
	public Homepage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, Homepage_PF.class);
	}

}
		