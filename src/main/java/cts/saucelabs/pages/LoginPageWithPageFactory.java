package cts.saucelabs.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Kalyani
 * @author Pallavi
 * @author Priyanka
 * @author Shalini
 * class created for logging into website with valid credentials
 */

	public class LoginPageWithPageFactory {

	WebDriver driver;
	
	/**
	 * locating username
	 */
	@FindBy(how=How.ID,using="user-name")
	@CacheLookup
	WebElement username;
	
	/**
	 * locating password
	 */	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	@CacheLookup
	WebElement password;
	
	/**
	 * locating login button
	 */	
	@FindBy(how=How.XPATH,using="//input[@class='btn_action']")
	@CacheLookup
	WebElement login_button;
	
	/**
	 * method for initializing the objects
	 * @param driver
	 */
	public LoginPageWithPageFactory(WebDriver driver) {
	this.driver=driver;
	}
	
	/**
	 * method for Specifying userName and password
	 * @param userid
	 * @param pass
	 */
	
	public void typeUserNameAndPassword(String userid,String pass) {
	username.sendKeys(userid);
	password.sendKeys(pass);
	}
	/**
	 * method for clicking on Login button
	 */
	public void clickOnLoginButton() {
	login_button.click();
	}
	
	}
