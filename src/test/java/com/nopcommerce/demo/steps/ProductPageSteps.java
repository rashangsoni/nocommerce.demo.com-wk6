package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class ProductPageSteps {

    @When("^I click on computer page$")
    public void iClickOnComputerPage() {
        new HomePage().clickOnComputerTab();
    }

    @And("^I click on sort by Z to A$")
    public void iClickOnSortByZToA()
    {
        new ComputerPage().clickOnDesktop();
    }

    @Then("^All products should be arranged in alphabetical order$")
    public void allProductsShouldBeArrangedInAlphabeticalOrder() throws InterruptedException {
        String actualOrder = new ComputerPage().sortDesktopByPositionZtoA().toString();
        String expectedOrder = new ComputerPage().getAllProductNamesAfterShorting().toString();
        Assert.assertEquals(expectedOrder, actualOrder);

    }

}

