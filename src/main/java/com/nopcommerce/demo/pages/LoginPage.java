package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement guestCheckout;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[[@class='ico-login']]")
    WebElement welcomeLoginText;

    /**
     * get Welcome Text
     *
     * @return
     */
    public String getWelcomeText() {
        log.info("Verify welcome message : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    /**
     * click On Guest Checkout
     */
    public void clickOnGuestCheckout() {
        log.info("Click on guest checkout button : " + guestCheckout.toString());
        clickOnElement(guestCheckout);
    }

    /**
     * click on login link
     */

    public void clickOnLoginLink() {
        log.info("Click on login button : " + loginLink.toString());
        clickOnElement((loginLink));
    }



}