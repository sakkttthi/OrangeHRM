package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "src/test/resources/features",
		  glue = {"stepdefinitions"},
		  dryRun = false,
//		  tags = "@LoginTest",
		  plugin = {"pretty", "html:target/cucumber-reports"}
		)

public class Testrunner {
	
}
