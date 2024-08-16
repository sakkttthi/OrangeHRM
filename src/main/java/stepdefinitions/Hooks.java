package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {
	WebDriver driver;
	DriverFactory df;
	@Before
	public void setup() throws IOException {
		df= new DriverFactory();
		driver = df.initiateDriver();
		driver.manage().window().maximize();
	}

	@After
	public void teardown() {
		df.quitDriver();
	}

}
