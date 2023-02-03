package testJava.StepDefinitions;

import io.cucumber.java.en.Given;

public class BackGroundSteps {

	@Given("Starting to open browser")
	public void starting_to_open_browser() {
		System.out.println("Starting to test");
	}

}
