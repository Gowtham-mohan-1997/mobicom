package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/featurefile/requestcreation.feature", // Path to the feature file
		glue = { "stepdefinition" }, tags = "@Alltag", plugin = { "pretty",
				"html:target/cucumber-reports/login.html" }, monochrome = true)
public class TestRunner {

}
