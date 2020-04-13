package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",
glue= {"stepDefination"},
tags= {"@checkout"},
plugin= {"html:target/cucumber-html.report"})
/**
 * @author Kalyani
 * @author Pallavi
 * @author Priyanka
 * @author Shalini
 * class created to run checkout page
 */

public class CheckoutRunner {
	private TestNGCucumberRunner testRunner;



	@BeforeClass
	public void setUP()
	/**
	 * method to method for initializing the objects
	 */
	{
		testRunner = new TestNGCucumberRunner(CheckoutRunner.class);			
	}

	@Test(description="checkout",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	/**
	 * method to read the test data from features
	 */
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}

	@AfterClass
	/**
	 * method to close the page
	 * @throws InterruptedException
	 */
	public void tearDown() throws InterruptedException
	{		
		testRunner.finish();
		

	}

}
