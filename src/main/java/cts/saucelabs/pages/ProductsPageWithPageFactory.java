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
	 * class created to add items to cart 
	 */
	
	public class ProductsPageWithPageFactory {

		WebDriver driver;
		/**
		 * locating item backpack
		 */
		@FindBy(how=How.XPATH,using="//div[@class='inventory_list']//div[1]//div[3]//button[1]")
		@CacheLookup
		WebElement Backpack;

		/**
		 * locating item Light
		 */
		@FindBy(how=How.XPATH,using="//body[@class='main-body']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]")
		@CacheLookup
		WebElement Light;
		/**
		 * locating item Bolt
		 */

		@FindBy(how=How.XPATH,using="//div[3]//div[3]//button[1]")
		@CacheLookup
		WebElement Bolt;
		/**
		 * locating item Jacket
		 */
		@FindBy(how=How.XPATH,using="//div[4]//div[3]//button[1]")
		@CacheLookup
		WebElement Jacket;
		/**
		 * locating cart image
		 */
		@FindBy(how=How.XPATH,using="//*[name()='path' and contains(@fill,'currentCol')]")
		@CacheLookup
		WebElement cart_image;
		/**
		 * method for initializing objects
		 * @param driver
		 */
		public ProductsPageWithPageFactory(WebDriver driver) {
			this.driver=driver;
			
		}
		/**
		 * method to click on Backpack image
		 */
		public void clickOnBackpackImage() {
			Backpack.click();
			}
			/**
			* method to click on light image
			*/
			public void clickOnLightImage() {
			Light.click();
			}
			/**
			 * method to click on Bolt image 
			 */
			public void clickOnBoltImage() {
				Bolt.click();
			}
			/**
			 * method to click on jacket image
			 */
			public void clickOnJacketImage() {
				Jacket.click();
			}
			/**
			 * method to click on cart button
			 */
			public void clickOnCartButton() {
			cart_image.click();
			}
		
		
	}

