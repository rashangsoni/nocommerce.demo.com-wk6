package com.nopcommerce.demo.steps;


import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.UUID;

public class ElectronicsSteps {

    String name = UUID.randomUUID().toString();
    String email = name + "@gmail.com";
    String register = "Register";

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @And("^I click on Electronics page$")
    public void iClickOnElectronicsPage() {
        new HomePage().mouseHoverToElectronicTab();


    }
    @And("^I click on Cell phone page$")
    public void iClickOnCellPhonePage() {
        new HomePage().mouseHoverToCellPhonesAndClick();

    }

    @Then("^I should be able to see Cell phones text$")
    public void iShouldBeAbleToSeeCellPhonesText() throws InterruptedException {
        String expectedMessage = "Cell phones";
        String actualMessage = new CellPhonePage().getCellPhoneText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @And("^I click on list view button$")
    public void iClickOnListViewButton() {
        new CellPhonePage().clickOnListViewIcon();
    }

    @And("^select model Nokia Lumia (\\d+) option$")
    public void selectModelNokiaLumiaOption(int arg0) throws InterruptedException {
        new CellPhonePage().selectPhoneFromList("Nokia Lumia 1020");
    }

    @Then("^I verify the product name and price$")
    public void iVerifyTheProductNameAndPrice() throws InterruptedException {
        String expectedMessage = "Nokia Lumia 1020";
        String actualMessage = new CellPhonePage().getProductNameText();
        Assert.assertEquals(expectedMessage, actualMessage);


        String expectedMessagePrice = "$349.00";
        String actualMessagePrice = new CellPhonePage().getPriceText();
        Assert.assertEquals(expectedMessagePrice , actualMessagePrice);
    }

    @And("^I update the order quantity to (\\d+)$")
    public void iUpdateTheOrderQuantityTo(int arg0) throws InterruptedException {
        new CellPhonePage().updateQuantity("2");

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() throws InterruptedException {
        new CellPhonePage().clickOnAddToCart();

    }

    @And("^I verify the product added successfully into cart$")
    public void iVerifyTheProductAddedSuccessfullyIntoCart() throws InterruptedException {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage =  new CellPhonePage().getSuccessfullyAddedToCartText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }


    @And("^I close the notification bar$")
    public void iCloseTheNotificationBar() throws InterruptedException {
        new CellPhonePage().closeNotificationBar();
        new ShoppingCartPage().mouseHoverToShoppingCart();
        new ShoppingCartPage().mouseHoverToGoToCartAndClick();
        String expectedMessage = "Shopping cart";
        String actualMessage = new ShoppingCartPage().getShoppingCartText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }


    @And("^I verify the order qty\\. as (\\d+)$")
    public void iVerifyTheOrderQtyAs(int arg0) throws InterruptedException {
        String expectedMessage = "2";
        String actualMessage = new ShoppingCartPage().getNumberOfQuantityValue();
        Assert.assertEquals(actualMessage, expectedMessage);
    }




    @And("^I verify the total price as \\$ (\\d+)\\.(\\d+)$")
    public void iVerifyTheTotalPriceAs$(int arg0, int arg1) throws InterruptedException {
        String expectedMessage = "$698.00";
        String actualMessage = new ShoppingCartPage().getPriceText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @And("^I select terms and condition check box$")
    public void iSelectTermsAndConditionCheckBox() throws InterruptedException {
        new ShoppingCartPage().selectTermsAndCondition();
    }

    @And("^I should be able to checkout and navigate to registration page successfully$")
    public void iShouldBeAbleToCheckoutAndNavigateToRegistrationPageSuccessfully() throws InterruptedException {
        new ShoppingCartPage().clickOnCheckOut();
    }


    @And("^I verify the welcome, please sign in text$")
    public void iVerifyTheWelcomePleaseSignInText() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


    @And("^I click on register page$")
    public void iClickOnRegisterPage() {
        new HomePage().clickOnRegisterTab();
    }

    @And("^I enter my details to register$")
    public void iEnterMyDetailsToRegister() throws InterruptedException {
        new RegisterPage().enterFirstname("Prime");
        new RegisterPage().enterLastname("Testing");
        new RegisterPage().enterEmail(email);
        new RegisterPage().enterPassword("Admin@123");
        new RegisterPage().enterConfirmPassword("Admin@123");

    }

    @And("^I click on registration button$")
    public void iClickOnRegistrationButton() throws InterruptedException {
        new RegisterPage().clickOnRegisterButton();
        String expectedMessage = "Your registration completed";
        String actualMessage = new RegisterPage().getRegistrationCompletedText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }



}