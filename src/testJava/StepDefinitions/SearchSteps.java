package testJava.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	WebDriver driver;
//
//	@Given("open the browser")
//	public void open_the_browser() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
//	}
//
//	@And("enter the url")
//	public void enter_the_url() {
//		driver.get("https://www.google.com/");
//
//	}
//
//	@When("Search the Aremallenahalli")
//	public void search_the_aremallenahalli() {
//		driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Aremallenahalli");
//	}
//
//	@And("Hit the search")
//	public void hit_the_search() {
//		driver.findElement(By.cssSelector(".gLFyf")).sendKeys(Keys.ENTER);
//
//	}

	@Then("check the results")
	public void chech_the_results() {
		System.out.println(driver.getTitle());

	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();

	}

}
