Feature: Products Test
  As a user I should be able to see products in alphabetical order

  @sanity @smoke
  Scenario: Verify products are arranged in alphabetical order
    Given I am on homepage
    When I click on computer page
    And I click on sort by Z to A
    Then All products should be arranged in alphabetical order

  @regression
  Scenario: Verify product added to shopping cart successfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktop option
    And Select A to Z sorting option from dropdown menu
    And I select the processor 2.2 GHz Intel Pentium Dual-Core E2200
    And I select the ram 8GB [+$60.00]
    And I select hdd 400 GB [+$100.00]
    And I select os Vista Premium
    And I select Microsoft Software
    And I select Total commander software
    Then Total price should be $1,475.00
    And I click on computer add to cart button
    Then Product should be successfully added to shopping cart
    And I click on close notification bar
    And I click on shopping cart link on notification bar
    Then I should navigate to shopping cart page
    And I change the order qty. to 2
    And I click on update shopping cart button
    Then Shopping cart price should change to $ 2,950.00
    And I click on Terms and condition check box
    And I click on checkout button
    Then I navigate to sign in page
    And I click on Guest checkout link
    And I navigate to checkout page
    And I fill required details
    And I click continue button
    And I click on next day air service
    And I click on continue button
    And I click on credit cart payment option
    And I click on continue button
    And I select credit cart type as Master Card
    And I fill card details
    And I click on payment continue button
    Then I verify the credit card as payment method
    Then I verify the next day air as delivery method
    Then I verify the total price as $2,950.00
    And I click on confirm button
    Then I verify the Thank you message
    Then I verify the order has been successfully processed
    And I click on continue button
    Then I navigate to home page