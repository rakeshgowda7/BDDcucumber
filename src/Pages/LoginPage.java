package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "name")
	WebElement un;
	@FindBy(id = "password")
	WebElement pwd;
	@FindBy(id = "login")
	WebElement login;
	@FindBy(id = "logout")
	WebElement logout;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void PassCreds(String username, String password) {
		un.sendKeys(username);
		pwd.sendKeys(password);

	}

	public void ClickOnLogin() {
		login.click();
	}

	public void ClickOnLogout() {
		logout.click();
	}

}
