package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {

    public static class MyStepdefs {

        @Given("^I am on homepage$")
        public void iAmOnHomepage() {

        }

        @When("^I click on login link$")
        public void iClickOnLoginLink()
        {
            new LoginPage().clickOnLoginLink();
        }

        @Then("^I should navigate to login page successfully$")
        public void iShouldNavigateToLoginPageSuccessfully() {

            String actualWelcomeMsg = new LoginPage().getWelcomeText().toString();
            String expectedWelcomeMsg = "Welcome, Please Sign In!";
            Assert.assertEquals(expectedWelcomeMsg, actualWelcomeMsg);

            String menuName = "Electronics";
            String expectedMessage = "Electronics";
            new ElectronicsPage().selectMenu(menuName);
            String actualMessage = new ElectronicsPage().getElectronicsHeaderText();
            Assert.assertEquals(actualMessage, expectedMessage);
        }
    }

}