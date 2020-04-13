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
 * class created to checkout of the website
 */

	public class CheckoutPageWithPageFactory {

	WebDriver driver;
	/**
	 * locating checkout button
	 */
	@FindBy(how=How.XPATH,using="//a[@class='btn_action checkout_button']")
	@CacheLookup
	WebElement checkout_button;
	
	/**
	 * locating firstname
	 */
	@FindBy(how=How.ID,using="first-name")
	@CacheLookup
	WebElement firstname;
	
	/**
	 * locating lastname
	 */
	@FindBy(how=How.ID,using="last-name")
	@CacheLookup
	WebElement lastname;
	
	/**
	 * locating postalcode
	 */
	@FindBy(how=How.XPATH,using="//input[@id='postal-code']")
	@CacheLookup
	WebElement postalcode;
	
	/**
	 * locating Continue button
	 */
	@FindBy(how=How.XPATH,using="//input[@class='btn_primary cart_button']")
	@CacheLookup
	WebElement Continue_button;

	/**
	 * method for initializing objects
	 * @param driver
	 */
	public CheckoutPageWithPageFactory(WebDriver driver) {
	this.driver=driver;
	}
	/**
	 * method for clicking on checkout button
	 */
	public void clickOnCheckoutButton() {
		checkout_button.click();
	}
	/**
	 * method for specifying name and postal code
	 * @param Firstname
	 * @param Lastname
	 * @param Postalcode
	 */
	public void typenameandpostalcode(String Firstname,String Lastname,int Postalcode) {
	firstname.sendKeys("Pallavi");
	lastname.sendKeys("Kasthala");
	postalcode.sendKeys("123456");
	}

	/**
	 * method to click on continue button
	 */
	public void clickOnContinueButton() {
	Continue_button.click();
	}
	
	
	}
