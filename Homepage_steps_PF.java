package StepsDefinitions;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Homepage_steps_PF extends BaseClass_PF{
	
	WebDriver driver;
	Homepage_PF homepage; 
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		 System.out.println("In stepdefinition-User is on the browser");
		 
		}

	@When("User opens the Dietician Website")
	public void user_opens_the_dietician_website() {
	  driver.navigate().to("http://dieticianUI.com");
	   }

	@Then("User should see the public page")
	public void user_should_see_the_public_page() {
	    System.out.println("in stepdefinition-User should see the public page");
	}
	

	@Given("User is on the public page")
	public void user_is_on_the_public_page() {
	    System.out.println("in stepdefinition-User is on the public page");
	}
	@When("User navigates to this page from any browser")
	public void user_navigates_to_this_page_from_any_browser() {
	   System.out.println("in stepdefinition-User navigates to this page from any browser");
	}

	@Then("User should see a logo with the company name on the home page")
	public void user_should_see_a_logo_with_the_company_name_on_the_home_page() {
		homepage.logo.isDisplayed();
	   
	}
	
	@Then("It should display the image")
	public void it_should_display_the_image() {
	   homepage.image.isDisplayed();
	}

	@Given("User on Homepage")
	public void user_on_homepage() {
	   System.out.println("in stepdefinition-User on Homepage");
	}

	@When("User navigates to the homepage")
	public void user_navigates_to_the_homepage() {
	   System.out.println("in stepdefinition-User navigates to the homepage");
	}

	@Then("User should see a menu bar which contains few tabs along with a search icon, my account icon and a menu bar icon")
	public void user_should_see_a_menu_bar_which_contains_few_tabs_along_with_a_search_icon_my_account_icon_and_a_menu_bar_icon() {
	   System.out.println("in stepdefinition-User should see a menu bar which contains few tabs along with a search icon, my account icon and a menu bar icon");
	}

}



