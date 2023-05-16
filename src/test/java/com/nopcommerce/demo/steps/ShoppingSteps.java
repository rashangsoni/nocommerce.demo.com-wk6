package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

//public static class MyStepdefs {
public class ShoppingSteps {

    @When("^I click on computer tab$")
    public void iClickOnComputerTab() throws InterruptedException {
        new HomePage().clickOnComputerTab();

    }

    @And("^I click on desktop option$")
    public void iClickOnDesktopOption() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^Select A to Z sorting option from dropdown menu$")
    public void selectAToZSortingOptionFromDropdownMenu() throws InterruptedException {
        new ComputerPage().selectValueFromShortingDropDown("Name: A to Z");
        String expectedComputerMessage = "Build your own computer";
        new ComputerPage().clickAddtoCartByProductName("Build your own computer");
        String actualComputerMessage = new BuildYourOwnComputerPage().getBuildYourOwnComputerText().toString();
        Assert.assertEquals(expectedComputerMessage, actualComputerMessage, "Unable to click on add to card");
    }


    @And("^I select the processor (\\d+)\\.(\\d+) GHz Intel Pentium Dual-Core E(\\d+)$")
    public void iSelectTheProcessorGHzIntelPentiumDualCoreE(int arg0, int arg1, int arg2) throws InterruptedException {
        new BuildYourOwnComputerPage().selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");

    }

    @And("^I select the ram (\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectTheRamGB$(int arg0, int arg1, int arg2) throws InterruptedException {
        new BuildYourOwnComputerPage().selectRam("8GB [+$60.00]");
    }

    @And("^I select hdd (\\d+) GB \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectHddGB$(int arg0, int arg1, int arg2) throws InterruptedException {
        new BuildYourOwnComputerPage().selectHDD("400 GB [+$100.00]");
    }

    @And("^I select os Vista Premium$")
    public void iSelectOsVistaPremium() throws InterruptedException {
        new BuildYourOwnComputerPage().selectOs("Vista Premium");
    }

    @And("^I select Microsoft Software$")
    public void iSelectMicrosoftSoftware() throws InterruptedException {
        new BuildYourOwnComputerPage().selectMicrosoftOfficeSoftwareOption();

    }

    @And("^I select Total commander software$")
    public void iSelectTotalCommanderSoftware() throws InterruptedException {
        new BuildYourOwnComputerPage().selectTotalCommanderSoftwareOption();
    }

    @Then("^Total price should be \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void totalPriceShouldBe$(int arg0, int arg1, int arg2) throws InterruptedException {
        String expectedMessage = "$1,475.00";
        String actualMessage = new BuildYourOwnComputerPage().getTotalPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Wrong Configuration");
    }

    @And("^I click on computer add to cart button$")
    public void iClickOnComputerAddToCartButton() throws InterruptedException {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }


    @Then("^Product should be successfully added to shopping cart$")
    public void productShouldBeSuccessfullyAddedToShoppingCart() throws InterruptedException {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = new BuildYourOwnComputerPage().getSuccessfullyAddedToCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Not added in cart");
    }

    @And("^I click on close notification bar$")
    public void iClickOnCloseNotificationBar() throws InterruptedException {
        new BuildYourOwnComputerPage().closeNotificationBar();
    }

    @And("^I click on shopping cart link on notification bar$")
    public void iClickOnShoppingCartLinkOnNotificationBar() throws InterruptedException {
        new BuildYourOwnComputerPage().mouseHoverToShoppingCartAndClickOnCart();
    }

    @Then("^I should navigate to shopping cart page$")
    public void iShouldNavigateToShoppingCartPage() throws InterruptedException {
        String expectedMessage = "Shopping cart";
        String actualMessage = new ShoppingCartPage().getShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to click on cart");
    }

    @And("^I change the order qty\\. to (\\d+)$")
    public void iChangeTheOrderQtyTo(int arg0) throws InterruptedException {
        new ShoppingCartPage().changeValueOfQuantity("2");

    }

    @And("^I click on update shopping cart button$")
    public void iClickOnUpdateShoppingCartButton() throws InterruptedException {
        new ShoppingCartPage().updateShoppingCart();
    }

    @Then("^Shopping cart price should change to \\$ (\\d+),(\\d+)\\.(\\d+)$")
    public void shoppingCartPriceShouldChangeTo$(int arg0, int arg1, int arg2) throws InterruptedException {
        String expectedMessage = "$2,950.00";
        String actualMessage = new ShoppingCartPage().getPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Price not Updated");
    }


    @And("^I click on Terms and condition check box$")
    public void iClickOnTermsAndConditionCheckBox() throws InterruptedException {
        new ShoppingCartPage().selectTermsAndCondition();
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() throws InterruptedException {
        new ShoppingCartPage().clickOnCheckOut();
    }

    @Then("^I navigate to sign in page$")
    public void iNavigateToSignInPage() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage =  new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @And("^I click on Guest checkout link$")
    public void iClickOnGuestCheckoutLink() {
        new LoginPage().clickOnGuestCheckout();
    }

    @And("^I navigate to checkout page$")
    public void iNavigateToCheckoutPage() {
    }

    @And("^I fill required details$")
    public void iFillRequiredDetails() throws InterruptedException {
        new CheckOutPage().enterFirstname("Prime");
        new CheckOutPage().enterLastname("Testing");
        new CheckOutPage().enterEmail("primetesting@gmail.com");
        new CheckOutPage().selectCountry("United Kingdom");
        new CheckOutPage().enterCity("Harrow");
        new CheckOutPage().enterAddress1("1, London Road");
        new CheckOutPage().enterZipCode("HA9 0TP");
        new CheckOutPage().enterPhoneNumber("07548689547");

    }

    @And("^I click continue button$")
    public void iClickContinueButton() throws InterruptedException {
        new CheckOutPage().clickOnContinue();
    }

    @And("^I click on next day air service$")
    public void iClickOnNextDayAirService() throws InterruptedException {
        new CheckOutPage().selectNextDayAir();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() throws InterruptedException {
        new CheckOutPage().clickOnShippingContinue();
    }


    @And("^I click on credit cart payment option$")
    public void iClickOnCreditCartPaymentOption() throws InterruptedException {
        new CheckOutPage().clickOnCreditCard();
        new CheckOutPage().clickOnPaymentContinue();
    }

    @And("^I select credit cart type as Master Card$")
    public void iSelectCreditCartTypeAsMasterCard() throws InterruptedException {
        new CheckOutPage().selectCreditCardType("Master card");

    }

    @And("^I fill card details$")
    public void iFillCardDetails() throws InterruptedException {
        new CheckOutPage().enterCardHolderName("Prime testing");
        new CheckOutPage().enterCardNumber("5573615091331588");
        new CheckOutPage().selectExpirationDate("05", "2025");
        new CheckOutPage().enterCardCode("123");

    }

    @And("^I click on payment continue button$")
    public void iClickOnPaymentContinueButton() throws InterruptedException {
        new CheckOutPage().clickOnPaymentInfoContinue();
    }

    @Then("^I verify the credit card as payment method$")
    public void iVerifyTheCreditCardAsPaymentMethod() throws InterruptedException {
        String expectedMessage = "Credit Card";
        String actualMessage =  new CheckOutPage().getPaymentTypeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @Then("^I verify the next day air as delivery method$")
    public void iVerifyTheNextDayAirAsDeliveryMethod() throws InterruptedException {
        String expectedMessage = "Next Day Air";
        String actualMessage = new CheckOutPage().getShippingMethodText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @Then("^I verify the total price as \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iVerifyTheTotalPriceAs$(int arg0, int arg1, int arg2) throws InterruptedException {
        String expectedMessage = "$2,950.00";
        String actualMessage = new CheckOutPage().getTotalPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton() throws InterruptedException {
        new CheckOutPage().clickOnConfirm();
    }

    @Then("^I verify the Thank you message$")
    public void iVerifyTheThankYouMessage() throws InterruptedException {
        String expectedMessage = "Thank you";
        String actualMessage = new HomePage().getThankYouText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @Then("^I verify the order has been successfully processed$")
    public void iVerifyTheOrderHasBeenSuccessfullyProcessed() throws InterruptedException {
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = new HomePage().getSuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @Then("^I navigate to home page$")
    public void iNavigateToHomePage() throws InterruptedException {
        new HomePage().clickOnContinue();
        String expectedMessage = "Welcome to our store";
        String actualMessage = new HomePage().getWelcomeStoreText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }


}