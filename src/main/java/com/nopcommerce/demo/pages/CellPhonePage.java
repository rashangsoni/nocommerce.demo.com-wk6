package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonePage.class.getName());
    public CellPhonePage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement ProductName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span[normalize-space()='$349.00']")
    WebElement PriceName;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement updateQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;

    //    @CacheLookup
//    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
//    WebElement shoppingCartNotificationBar;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeNotificationBar;


    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;

    /**
     * get Cell Phone Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getCellPhoneText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get Cell Phone Text : " + cellPhone.toString());
        return getTextFromElement(cellPhone);
    }

    /**
     * click On List ViewIcon
     */
    public void clickOnListViewIcon() {
        log.info("Click on List View Icon  : " + listView.toString());
        clickOnElement(listView);
    }

    /**
     * select Phone FromList
     *
     * @param phone
     * @throws InterruptedException
     */
    public void selectPhoneFromList(String phone) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on Phone option  : " );
        clickOnElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'" + phone + "')]"));
    }

    /**
     * get Product NameText
     *
     * @return
     * @throws InterruptedException
     */
    public String getProductNameText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get Product name Text  : " + ProductName.toString());
        return getTextFromElement(ProductName);
    }

    /**
     * get PriceText
     *
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get Price Text  : " + PriceName.toString());
        return getTextFromElement(PriceName);
    }

    /**
     * update Quantity
     *
     * @param value
     * @throws InterruptedException
     */
    public void updateQuantity(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Update the order qty.  : " + updateQuantity.toString());
        clearTextFromField(updateQuantity);
        sendTextToElement(updateQuantity, value);
    }

    /**
     * click On Add ToCart
     *
     * @throws InterruptedException
     */
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on add to cart button  : " + addToCart.toString());
        clickOnElement(addToCart);
    }

    /**
     * get Successfull Added To CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfullyAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Verify product added successfully in shopping cart  : " + successfullyText.toString());
        return getTextFromElement(successfullyText);
    }

    /**
     * click on shopping cart in notification bar
     *
     * @throws InterruptedException
     */
//    public void mouseHoverAndClickOnShoppingCart1() throws InterruptedException {
//        Thread.sleep(1000);
//        log.info("Click on shopping cart : " + shoppingCartNotificationBar.toString());
//        mouseHoverToElementAndClick2(shoppingCartNotificationBar);
//
//    }
    /**
     * close Notification Bar
     *
     * @throws InterruptedException
     */
    public void closeNotificationBar() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Close the notification bar  : " + closeNotificationBar.toString());
        clickOnElement(closeNotificationBar);
    }

    /**
     * mouse hoover and click on shopping cart
     *
     * @throws InterruptedException
     */
    public void mouseHoverAndClickOnShoppingCart() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on shopping cart : " + shoppingCart.toString());
        mouseHoverToElementAndClick(shoppingCart);

    }
}