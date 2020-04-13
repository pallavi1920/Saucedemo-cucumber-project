package stepDefination;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cts.saucelabs.pages.CheckoutPageWithPageFactory;
import cts.saucelabs.pages.LoginPageWithPageFactory;
import cts.saucelabs.pages.PlaceorderPageWithPageFactory;
import cts.saucelabs.pages.ProductsPageWithPageFactory;
import cts.saucelabs.pages.RemoveitemsPageWithPageFactory;
import cts.saucelabs.utility.BrowserFactory;
import cts.saucelabs.utility.ConfigReader;
import cts.saucelabs.utility.ExcelDataConfig;
import cts.saucelabs.utility.Screenshot1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * class created to write test cases for login,navigating to url,doing some operations and logout.
 * @author kalyani
 * @author Pallavi
 * @author Priyanka
 * @author Shalini
 *
 */

public class SaucelabsTestPage {
	ConfigReader config= new ConfigReader();
	ExcelDataConfig configExcel=new ExcelDataConfig(config.getExcelpath());
	WebDriver driver;
	LoginPageWithPageFactory login;
	ProductsPageWithPageFactory product;
	CheckoutPageWithPageFactory checkout;
	RemoveitemsPageWithPageFactory removeitems;
	PlaceorderPageWithPageFactory placeorder;
	/**
	 * method to get ExtentReports
	 */
	
	public static ExtentReports report = new ExtentReports("./Reports/ExtentReport.html");
	
	ExtentTest test = report.startTest("logInTest");
	Screenshot1 ob=new Screenshot1();	
	Logger logger;

	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {

	BrowserFactory b=new BrowserFactory();
	logger = Logger.getLogger("LoginTestPage");
	PropertyConfigurator.configure("Log4j.properties.txt");
	
	driver=b.startBrowser("chrome", config.getApplicationURL());
	logger.info("Chrome Opened");
	login= PageFactory.initElements(driver, LoginPageWithPageFactory.class);
	}
		
	
	@When("^I enter valid \"([^\"]*)\"$")
	/**
	* To enter Username and Password for login
	* @param usernameNumber
	* @throws Throwable
	*/
	public void i_enter_valid(String usernameNumber) throws Throwable {
	
	Object[][] data=configExcel.passData();
	String username="";
	String password="";

		if(null!= usernameNumber ) {
		int userCount = Integer.parseInt(usernameNumber.trim());
	
		username = (String )data[userCount-1][0];
		password = (String )data[userCount-1][1];	
		test.log(LogStatus.PASS, "Authentication sucessfully");
		
	
		/*if(null!= usernameNumber && usernameNumber.trim().equalsIgnoreCase("1")) {
			username = (String )data[0][0];
			password = (String )data[0][1];	

		}
		if(null!= usernameNumber && usernameNumber.trim().equalsIgnoreCase("2")) {
			username = (String )data[1][0];
			password = (String )data[1][1];	
			test.log(LogStatus.PASS, "Authentication Failed");
		}
		if(null!= usernameNumber && usernameNumber.trim().equalsIgnoreCase("3")) {
			username = (String )data[2][0];
			password = (String )data[2][1];	
			test.log(LogStatus.PASS, "Authentication Failed");
		}*/
		
		
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password); 
	}
	}
	@When("^user should be able to login$")
	
	/**
	* For Successful Login
	* @throws Throwable
	*/
	
	public void user_should_be_able_to_login() throws Throwable {
	login.clickOnLoginButton();
	Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
	logger.info(driver.getCurrentUrl());
	test.log(LogStatus.PASS, "Authentication sucessfully");
	logger.info("User is able to login sucessfully");
	ob.getScreenshot(driver);
	
}
	
	@When("^user selects multiple items to add to cart$")
	
	/**
	* To add Multiple items to cart
	* @throws Throwable
	*/
	
	public void user_selects_multiple_items_to_add_to_cart() throws Throwable {
		product=PageFactory.initElements(driver, ProductsPageWithPageFactory.class);
		product.clickOnBackpackImage();
		product.clickOnLightImage();
		product.clickOnBoltImage();
		product.clickOnJacketImage();
		 logger.info("User added items to cart");
		 
	}


	@Then("^user opens cart$")
	
	/**
	* To open cart and to view the items
	* @throws Throwable
	*/
	
	public void user_opens_cart() throws Throwable {
	product.clickOnCartButton();
	Thread.sleep(1000);
	logger.info("Cart is opened");
		 
	}
	@Given("^clicks on checkout button$")
	
	/**
	* For Checking out
	* @throws Throwable
	*/
	
	public void clicks_on_checkout_button() throws Throwable {
	checkout=PageFactory.initElements(driver, CheckoutPageWithPageFactory.class);
	checkout.clickOnCheckoutButton();
		checkout.clickOnContinueButton();
		Thread.sleep(1000);
		logger.info("Clicked on checkout button");
		
	}
		
	@Then("^enters the personal details$")
	
	/**
	* To enter the Personal Details
	* @throws Throwable
	*/
	
	public void enters_the_personal_details() throws Throwable {
		driver.findElement(By.id("first-name")).sendKeys("pallavi");
		driver.findElement(By.id("last-name")).sendKeys("Kasthala");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
		checkout.clickOnContinueButton();
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
		logger.info(driver.getCurrentUrl());
		logger.info("Details are Taken Sucessfully");
	}
	
	@Then("^user removes items from the cart$")
	
	/**
	 * To remove items from cart
	 * @throws Throwable
	 */
	
	public void user_removes_items_from_the_cart() throws Throwable {
		removeitems=PageFactory.initElements(driver, RemoveitemsPageWithPageFactory.class);
		removeitems.clickOnBoltImage();
		removeitems.clickOnJacketImage();
		logger.info("User removed unnecessary items from cart");
		
	}
	

@Then("^check the products and click on finish$")

/**
* To Complete the checkout and click on finish
* @throws Throwable
*/	

public void check_the_products_and_click_on_finish() throws Throwable {
	placeorder=PageFactory.initElements(driver, PlaceorderPageWithPageFactory.class);
	placeorder.clickOnFinishButton();
	Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html", driver.getCurrentUrl());
	logger.info(driver.getCurrentUrl());
	logger.info("Order is placed Sucessfully");
	ob.getScreenshot(driver);
}
	
	@Then("^application should be closed$")
	
	/**
	* To close the Application
	* @throws Throwable
	*/
	
	public void application_should_be_closed() throws Throwable {
		logger.info("Application closed");
		TimeUnit.SECONDS.sleep(5);
		driver.quit();
		report.endTest(test);
		report.flush();
}
}

