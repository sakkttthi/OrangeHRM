package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.Dashboard;
import pages.Login;
import utils.DriverFactory;
import utils.PropertyReader;

public class LoginSteps {
	PropertyReader propRead = new PropertyReader();
	WebDriver driver = DriverFactory.getDriver();
	Login login;
	Dashboard dashboard;

	@Given("User is in login page")
	public void user_is_in_login_page() throws IOException {
		login = new Login(driver);
		propRead.loadProperties();
		String url = propRead.getprop("url");
		driver.get(url);
	}

	@Then("user is on login screen")
	public void user_is_on_login_screen() {
		login.isOnLoginScreen();
	}

	@Given("enter username as {string}")
	public void enter_username_as(String string) {
		String username = propRead.getprop("username");
		login.enterUname(username);
	}

	@Given("enter password as {string}")
	public void enter_password_as(String string) {
		String password = propRead.getprop("password");
		login.enterPass(password);
	}

	@Given("click login")
	public void click_login() {
		login.clickLogin();
	}

	@Then("user is navigated to dashboard screen")
	public void user_is_navigated_to_dashboard_screen() {
		dashboard = new Dashboard(driver);
		dashboard.screenIsDashoard();
	}

	@Given("click my profile")
	public void click_my_profile() {
		dashboard.clickMyProfile();
	}

	@Given("click logout")
	public void click_logout() {
		dashboard.clickLogout();
	}

	@Then("user is navigated to login screen")
	public void user_is_navigated_to_login_screen() {
		login.isOnLoginScreen();
	}

}
