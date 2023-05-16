$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("electronicstest.feature");
formatter.feature({
  "line": 1,
  "name": "Cell phone Test",
  "description": "As a user i should be able to navigate Cell phone page successfully",
  "id": "cell-phone-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8794534400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify that i should be able to place order for mobile phones successfully",
  "description": "",
  "id": "cell-phone-test;verify-that-i-should-be-able-to-place-order-for-mobile-phones-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on Electronics page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Cell phone page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to see Cell phones text",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click on list view button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select model Nokia Lumia 1020 option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify the product name and price",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I update the order quantity to 2",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I verify the product added successfully into cart",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I close the notification bar",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on shopping cart link on notification bar",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should navigate to shopping cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I verify the order qty. as 2",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify the total price as $ 698.00",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select terms and condition check box",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I navigate to sign in page",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click on register page",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter my details to register",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on registration button",
  "keyword": "And "
});
formatter.match({
  "location": "ElectronicsSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 177110700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnElectronicsPage()"
});
formatter.result({
  "duration": 234351800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnCellPhonePage()"
});
formatter.result({
  "duration": 1086042800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iShouldBeAbleToSeeCellPhonesText()"
});
formatter.result({
  "duration": 1051384900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnListViewButton()"
});
formatter.result({
  "duration": 107333000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1020",
      "offset": 25
    }
  ],
  "location": "ElectronicsSteps.selectModelNokiaLumiaOption(int)"
});
formatter.result({
  "duration": 1858512200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyTheProductNameAndPrice()"
});
formatter.result({
  "duration": 2083959800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 31
    }
  ],
  "location": "ElectronicsSteps.iUpdateTheOrderQuantityTo(int)"
});
formatter.result({
  "duration": 1383473500,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 1124898600,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iVerifyTheProductAddedSuccessfullyIntoCart()"
});
formatter.result({
  "duration": 1055472400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iCloseTheNotificationBar()"
});
formatter.result({
  "duration": 4885688200,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnShoppingCartLinkOnNotificationBar()"
});
formatter.result({
  "duration": 1675425200,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.iShouldNavigateToShoppingCartPage()"
});
formatter.result({
  "duration": 1052810400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 27
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheOrderQtyAs(int)"
});
formatter.result({
  "duration": 1070954500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "698",
      "offset": 30
    },
    {
      "val": "00",
      "offset": 34
    }
  ],
  "location": "ElectronicsSteps.iVerifyTheTotalPriceAs$(int,int)"
});
formatter.result({
  "duration": 1049226900,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iSelectTermsAndConditionCheckBox()"
});
formatter.result({
  "duration": 1076933200,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnCheckoutButton()"
});
formatter.result({
  "duration": 1560695300,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.iNavigateToSignInPage()"
});
formatter.result({
  "duration": 45553400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnRegisterPage()"
});
formatter.result({
  "duration": 421243300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iEnterMyDetailsToRegister()"
});
formatter.result({
  "duration": 5570137300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsSteps.iClickOnRegistrationButton()"
});
formatter.result({
  "duration": 2664292600,
  "status": "passed"
});
formatter.after({
  "duration": 700758200,
  "status": "passed"
});
formatter.uri("testSuite.feature");
formatter.feature({
  "line": 1,
  "name": "Products Test",
  "description": "As a user I should be able to see products in alphabetical order",
  "id": "products-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3481746400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify product added to shopping cart successfully",
  "description": "",
  "id": "products-test;verify-product-added-to-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on computer tab",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on desktop option",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select A to Z sorting option from dropdown menu",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select the processor 2.2 GHz Intel Pentium Dual-Core E2200",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select the ram 8GB [+$60.00]",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select hdd 400 GB [+$100.00]",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select os Vista Premium",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select Microsoft Software",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select Total commander software",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Total price should be $1,475.00",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I click on computer add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Product should be successfully added to shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click on close notification bar",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on shopping cart link on notification bar",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should navigate to shopping cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I change the order qty. to 2",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on update shopping cart button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Shopping cart price should change to $ 2,950.00",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I click on Terms and condition check box",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I navigate to sign in page",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click on Guest checkout link",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I navigate to checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I fill required details",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on next day air service",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on credit cart payment option",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I select credit cart type as Master Card",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I fill card details",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I click on payment continue button",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I verify the credit card as payment method",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "I verify the next day air as delivery method",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "I verify the total price as $2,950.00",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "I click on confirm button",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I verify the Thank you message",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "I verify the order has been successfully processed",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps$MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 100600,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnComputerTab()"
});
formatter.result({
  "duration": 1179697500,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnDesktopOption()"
});
formatter.result({
  "duration": 940966000,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingSteps.selectAToZSortingOptionFromDropdownMenu()"
});
formatter.result({
  "duration": 44367972400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[normalize-space()\u003d\u0027Build your own computer\u0027]\"}\n  (Session info: chrome\u003d113.0.5672.93)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [ef4603a667c01c249996c962b653c4ae, findElement {using\u003dxpath, value\u003d//h1[normalize-space()\u003d\u0027Build your own computer\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 113.0.5672.93, chrome: {chromedriverVersion: 113.0.5672.63 (0e1a4471d5ae..., userDataDir: C:\\Users\\rasha\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56780}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:56780/devtoo..., se:cdpVersion: 113.0.5672.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ef4603a667c01c249996c962b653c4ae\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.getText(Unknown Source)\r\n\tat com.nopcommerce.demo.utility.Utility.getTextFromElement(Utility.java:63)\r\n\tat com.nopcommerce.demo.pages.BuildYourOwnComputerPage.getBuildYourOwnComputerText(BuildYourOwnComputerPage.java:64)\r\n\tat com.nopcommerce.demo.steps.ShoppingSteps.selectAToZSortingOptionFromDropdownMenu(ShoppingSteps.java:28)\r\n\tat ✽.And Select A to Z sorting option from dropdown menu(testSuite.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 25
    },
    {
      "val": "2200",
      "offset": 56
    }
  ],
  "location": "ShoppingSteps.iSelectTheProcessorGHzIntelPentiumDualCoreE(int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 17
    },
    {
      "val": "60",
      "offset": 24
    },
    {
      "val": "00",
      "offset": 27
    }
  ],
  "location": "ShoppingSteps.iSelectTheRamGB$(int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 13
    },
    {
      "val": "100",
      "offset": 23
    },
    {
      "val": "00",
      "offset": 27
    }
  ],
  "location": "ShoppingSteps.iSelectHddGB$(int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iSelectOsVistaPremium()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iSelectMicrosoftSoftware()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iSelectTotalCommanderSoftware()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 23
    },
    {
      "val": "475",
      "offset": 25
    },
    {
      "val": "00",
      "offset": 29
    }
  ],
  "location": "ShoppingSteps.totalPriceShouldBe$(int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnComputerAddToCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.productShouldBeSuccessfullyAddedToShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnCloseNotificationBar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnShoppingCartLinkOnNotificationBar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iShouldNavigateToShoppingCartPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 27
    }
  ],
  "location": "ShoppingSteps.iChangeTheOrderQtyTo(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnUpdateShoppingCartButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 39
    },
    {
      "val": "950",
      "offset": 41
    },
    {
      "val": "00",
      "offset": 45
    }
  ],
  "location": "ShoppingSteps.shoppingCartPriceShouldChangeTo$(int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnTermsAndConditionCheckBox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnCheckoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iNavigateToSignInPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnGuestCheckoutLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iNavigateToCheckoutPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iFillRequiredDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnNextDayAirService()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnCreditCartPaymentOption()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iSelectCreditCartTypeAsMasterCard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iFillCardDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnPaymentContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iVerifyTheCreditCardAsPaymentMethod()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iVerifyTheNextDayAirAsDeliveryMethod()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    },
    {
      "val": "950",
      "offset": 31
    },
    {
      "val": "00",
      "offset": 35
    }
  ],
  "location": "ShoppingSteps.iVerifyTheTotalPriceAs$(int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnConfirmButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iVerifyTheThankYouMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iVerifyTheOrderHasBeenSuccessfullyProcessed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iClickOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingSteps.iNavigateToHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 889749500,
  "status": "passed"
});
});