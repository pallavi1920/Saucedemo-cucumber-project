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
	 * class created to remove items from cart
	 */
	
	public class RemoveitemsPageWithPageFactory {

		WebDriver driver;
		/**
		* locating Bolt
		*/
		@FindBy(how=How.XPATH,using="//div[4]//div[2]//div[2]//button[1]")
		@CacheLookup
		WebElement Bolt;
		/**
		 * locating Jacket
		 */
		@FindBy(how=How.XPATH,using="//div[6]//div[2]//div[2]//button[1]")
		@CacheLookup
		WebElement Jacket;
		/**
		 * locating cart button
		 */
		@FindBy(how=How.XPATH,using="//*[name()='path' and contains(@fill,'currentCol')]")
		@CacheLookup
		WebElement cart_image;
		/**
		 * method to remove items from cart
		 * @param driver
		 */
		public RemoveitemsPageWithPageFactory(WebDriver driver) {
			this.driver=driver;
			
		}
		/**
		 * method to click on Bolt image
		 */
		public void clickOnBoltImage() {
		Bolt.click();
		}
		/**
		 * method to click on Jacket image
		 */
		public void clickOnJacketImage() {
		Jacket.click();
		}
		/**
		 * method to click on cart image
		 */
		public void clickOnCartButton() {
		cart_image.click();
		}

		
	}

