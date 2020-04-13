package cts.miniproject.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	public class LoginPageWithPageFactory {

	WebDriver deriver;

	@FindBy(how=How.ID,using="user-name")
	@CacheLookup
	WebElement username;

	@FindBy(how=How.XPATH,using="//input[@id='password']")
	@CacheLookup
	WebElement password;

	@FindBy(how=How.XPATH,using="//input[@class='btn_action']")
	@CacheLookup
	WebElement submit_button;

	public LoginPageWithPageFactory(WebDriver deriver) {
	this.deriver=deriver;
	}

	public void typeUserNameAndPassword(String userid,String pass) {
	username.sendKeys(userid);
	password.sendKeys(pass);
	}

	public void clickOnLoginButton() {
	submit_button.click();
	}

	}
