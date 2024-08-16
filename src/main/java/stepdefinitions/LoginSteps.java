package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.Login;
import utils.DriverFactory;
import utils.PropertyReader;

public class LoginSteps {
	WebDriver driver= DriverFactory.getDriver();
	
	Login login;
	
	@Given("User is in login page")
	public void user_is_in_login_page() {
	    login=new Login(driver);
	    String url = new PropertyReader().getprop("url");
	    driver.get(url);
	}

	@Then("user is on login screen")
	public void user_is_on_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("enter Admin")
	public void enter_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("enter admin123")
	public void enter_admin123() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("click login")
	public void click_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to dasboard screen")
	public void user_is_navigated_to_dasboard_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("click my profile")
	public void click_my_profile() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("click logout")
	public void click_logout() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is naviagated to login screen")
	public void user_is_naviagated_to_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}
