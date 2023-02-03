package testJava.StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	public static WebDriver driver;
	LoginPage loginpage;

	@Before
	public void open_the_chrome_browser() {
		System.out.println("===Open browser===");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

	}

	@BeforeStep
	public void before_Step() {
		System.out.println("*****I m inside the before steps*******");
	}

	@Given("enter the url")
	public void enter_the_url() {
		System.out.println("Im entering url");
		driver.get("https://example.testproject.io/web/");

	}

	@When("^enter the (.*) and (.*)$")
	public void enter_the_username_password(String username, String password) throws InterruptedException {
		loginpage = new LoginPage(driver);
		System.out.println("*******This is from POM class******");
		loginpage.PassCreds(username, password);
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);

	}

	@And("click on login")
	public void click_on_login() throws InterruptedException {
		loginpage.ClickOnLogin();
//		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);

	}

	@Then("user navigated into home page")
	public void user_navigated_into_home_page() {
		loginpage.ClickOnLogout();
//		driver.findElement(By.id("logout")).click();9

	}

	@AfterStep
	public void After_Step() {
		System.out.println("*****I m inside the After steps*******");
	}

	@After
	public void close_the_chrome_browser() {
		System.out.println("===Closed the browser===");
		driver.close();
	}

}
