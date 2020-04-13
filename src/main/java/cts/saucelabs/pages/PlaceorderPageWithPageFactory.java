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
 * class created to place order after selecting items
 *  */

public class PlaceorderPageWithPageFactory {

WebDriver driver;
/**
 * locating continue button
 */
@FindBy(how=How.XPATH,using="//input[@class='btn_primary cart_button']")
@CacheLookup
WebElement continue_button;

/**
 * locating finish
 */
@FindBy(how=How.XPATH,using="//a[@class='btn_action cart_button']")
@CacheLookup
WebElement finish;

/**
 * method for initializing objects
 * @param driver
 */
public PlaceorderPageWithPageFactory(WebDriver driver) {
this.driver=driver;
}

/**
 * method for clicking on continue button
 */
public void clickonContinuebutton() {
continue_button.click();
}
/**
 * method for clicking on finish button
 */
public void clickOnFinishButton() {
finish.click();
}

}
