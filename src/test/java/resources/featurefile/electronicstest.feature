Feature: Cell phone Test
  As a user i should be able to navigate Cell phone page successfully
  @smoke
  Scenario: verify user should navigate to cell phone page
    Given I am on home page
    And I click on Electronics page
    And I click on Cell phone page
    Then I should be able to see Cell phones text

  @regression
  Scenario: Verify that i should be able to place order for mobile phones successfully
    Given I am on home page
    And I click on Electronics page
    And I click on Cell phone page
    Then I should be able to see Cell phones text
    And I click on list view button
    And select model Nokia Lumia 1020 option
    Then I verify the product name and price
    And I update the order quantity to 2
    And I click on add to cart button
    And I verify the product added successfully into cart
    And I close the notification bar
    And I click on shopping cart link on notification bar
    Then I should navigate to shopping cart page
    And I verify the order qty. as 2
    And I verify the total price as $ 698.00
    And I select terms and condition check box
    And I click on checkout button
    Then I navigate to sign in page
    And I click on register page
    And I enter my details to register
    And I click on registration button