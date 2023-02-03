package testJava.StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\testResources\\Features", glue = {
		"testJava.StepDefinitions" }, monochrome = true,
				plugin = { "pretty", "html:target\\report.html",
						"pretty", "json:target\\cucumber.json",})

public class TestRunner {

}
