$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testcase_account.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the account features for Practice_Automation_Testing website",
  "description": "",
  "id": "testing-the-account-features-for-practice-automation-testing-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Practice.AutomationTesting.in"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#@TS_01_login"
    },
    {
      "line": 4,
      "value": "#Scenario: Validate the login fuctionality"
    },
    {
      "line": 5,
      "value": "#Given Launch the browser and enter the url"
    },
    {
      "line": 6,
      "value": "#When Login page is opened"
    },
    {
      "line": 7,
      "value": "#Then Enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\""
    },
    {
      "line": 8,
      "value": "#And Click the login button"
    }
  ],
  "line": 12,
  "name": "edit and save Billing Address",
  "description": "",
  "id": "testing-the-account-features-for-practice-automation-testing-website;edit-and-save-billing-address",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TS_02_Edit_and_save_Billing_Address"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "open url in a browser07",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "login into application with\"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on the addresses",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click edit billing address",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "fill the billing details",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "click save Addresses",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Assert Billing addresses changes successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "07",
      "offset": 21
    }
  ],
  "location": "BillingAddressstepdefination.open_url_in_a_browser(int)"
});
formatter.result({
  "duration": 30424820500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 28
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 45
    }
  ],
  "location": "BillingAddressstepdefination.login_into_application_with_and(String,String)"
});
formatter.result({
  "duration": 12450481100,
  "status": "passed"
});
formatter.match({
  "location": "BillingAddressstepdefination.click_on_the_addresses()"
});
formatter.result({
  "duration": 6246989700,
  "status": "passed"
});
formatter.match({
  "location": "BillingAddressstepdefination.click_edit_billing_address()"
});
formatter.result({
  "duration": 5108540500,
  "status": "passed"
});
formatter.match({
  "location": "BillingAddressstepdefination.fill_the_billing_details()"
});
formatter.result({
  "duration": 2141719100,
  "status": "passed"
});
formatter.match({
  "location": "BillingAddressstepdefination.click_save_Addresses()"
});
formatter.result({
  "duration": 4601463500,
  "status": "passed"
});
formatter.match({
  "location": "BillingAddressstepdefination.assert_Billing_addresses_changes_successfully()"
});
formatter.result({
  "duration": 8234242500,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "edit and save shipping addresses details",
  "description": "",
  "id": "testing-the-account-features-for-practice-automation-testing-website;edit-and-save-shipping-addresses-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@TS_03_Edit_and_Save_Shipping_Address"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "open url in a browser_08",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "login with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "click on the addresses tab",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "click on edit shipping addresses",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "fill the shipping details",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "click on save addresses button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Assert shipping addresses changed successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "08",
      "offset": 22
    }
  ],
  "location": "ShippingAddressstepdefination.open_url_in_a_browser_(int)"
});
formatter.result({
  "duration": 23344521800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 12
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 29
    }
  ],
  "location": "ShippingAddressstepdefination.login_with_and(String,String)"
});
formatter.result({
  "duration": 12609641700,
  "status": "passed"
});
formatter.match({
  "location": "ShippingAddressstepdefination.click_on_the_addresses_tab()"
});
formatter.result({
  "duration": 7557695201,
  "status": "passed"
});
formatter.match({
  "location": "ShippingAddressstepdefination.click_on_edit_shipping_addresses()"
});
formatter.result({
  "duration": 6743156400,
  "status": "passed"
});
formatter.match({
  "location": "ShippingAddressstepdefination.fill_the_shipping_details()"
});
formatter.result({
  "duration": 1861849200,
  "status": "passed"
});
formatter.match({
  "location": "ShippingAddressstepdefination.click_on_save_addresses_button()"
});
formatter.result({
  "duration": 4605946500,
  "status": "passed"
});
formatter.match({
  "location": "ShippingAddressstepdefination.assert_shipping_addresses_changed_successfully()"
});
formatter.result({
  "duration": 6866099500,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Demosite - register",
  "description": "",
  "id": "testing-the-account-features-for-practice-automation-testing-website;demosite---register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@TS_04_Demosite_Valid_Register"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "open the url in the browser06",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "click demosite- register menu",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "fill all the valid details",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "click submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "06",
      "offset": 27
    }
  ],
  "location": "DemoValidRegstepdefination.open_the_url_in_the_browser(int)"
});
formatter.result({
  "duration": 21744871000,
  "status": "passed"
});
formatter.match({
  "location": "DemoValidRegstepdefination.click_demosite_register_menu()"
});
formatter.result({
  "duration": 7103095100,
  "status": "passed"
});
formatter.match({
  "location": "DemoValidRegstepdefination.fill_all_the_valid_details()"
});
formatter.result({
  "duration": 5290636900,
  "error_message": "org.openqa.selenium.InvalidArgumentException: File not found: C:\\Users\\User\\Pictures\\Screenshots\\Screenshot (1).png\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HEMAN-1997\u0027, ip: \u0027192.168.43.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 75.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200403170909, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 7216, moz:profile: C:\\Users\\Hemanth\\AppData\\Lo..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 0f48a565-a3c0-407b-99a7-2804165e896f\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat com.automation_pages.DemoValidRegPage.fillValiddetails(DemoValidRegPage.java:102)\r\n\tat com.automation_stepdefinition.DemoValidRegstepdefination.fill_all_the_valid_details(DemoValidRegstepdefination.java:30)\r\n\tat ✽.When fill all the valid details(testcase_account.feature:35)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DemoValidRegstepdefination.click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 41,
  "name": "Update details and chane password",
  "description": "",
  "id": "testing-the-account-features-for-practice-automation-testing-website;update-details-and-chane-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@TS_05_update_Account_Details"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "open the url in the browser_09",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "login with the \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "click on the account details",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "upadte details with new password",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "click save changes button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "09",
      "offset": 28
    }
  ],
  "location": "UpdatePasswordstepdefination.open_the_url_in_the_browser_(int)"
});
formatter.result({
  "duration": 21091496500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cUsername\u003e",
      "offset": 16
    },
    {
      "val": "\u003cPassword\u003e",
      "offset": 33
    }
  ],
  "location": "UpdatePasswordstepdefination.login_with_the_and(String,String)"
});
formatter.result({
  "duration": 11047714600,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePasswordstepdefination.click_on_the_account_details()"
});
formatter.result({
  "duration": 4077011701,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePasswordstepdefination.upadte_details_with_new_password()"
});
formatter.result({
  "duration": 1543092700,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePasswordstepdefination.click_save_changes_button()"
});
formatter.result({
  "duration": 7081407800,
  "status": "passed"
});
formatter.uri("testcase_cart.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the cart features for Automation  website",
  "description": "",
  "id": "testing-the-cart-features-for-automation--website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AutomationPracticeSite"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validate the login fuctionality",
  "description": "",
  "id": "testing-the-cart-features-for-automation--website;validate-the-login-fuctionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_step.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 29269536000,
  "status": "passed"
});
formatter.match({
  "location": "Login_step.login_page_is_opened()"
});
formatter.result({
  "duration": 29800200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusername\u003e",
      "offset": 11
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 28
    }
  ],
  "location": "Login_step.enter_the_and(String,String)"
});
formatter.result({
  "duration": 8537033199,
  "status": "passed"
});
formatter.match({
  "location": "Login_step.click_the_login_button()"
});
formatter.result({
  "duration": 9725404900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "verify the title",
  "description": "",
  "id": "testing-the-cart-features-for-automation--website;verify-the-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tc_02_verifytitle"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "launch the automation appliction",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "get the title name",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "compare with expected title",
  "keyword": "And "
});
formatter.match({
  "location": "automation_verifytitle_step.launch_the_automation_appliction()"
});
formatter.result({
  "duration": 21866466400,
  "status": "passed"
});
formatter.match({
  "location": "automation_verifytitle_step.get_the_title_name()"
});
formatter.result({
  "duration": 95926700,
  "status": "passed"
});
formatter.match({
  "location": "automation_verifytitle_step.compare_with_expected_title()"
});
formatter.result({
  "duration": 6210169500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To know the stock and add to the cart",
  "description": "",
  "id": "testing-the-cart-features-for-automation--website;to-know-the-stock-and-add-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tc_03_stockandcart"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "launch the automation page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "open the product",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "verify whether product is in stock or not",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "add product to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "automation_stockandadd_step.launch_the_automation_page()"
});
formatter.result({
  "duration": 28233462600,
  "status": "passed"
});
formatter.match({
  "location": "automation_stockandadd_step.open_the_product()"
});
formatter.result({
  "duration": 12917342400,
  "status": "passed"
});
formatter.match({
  "location": "automation_stockandadd_step.verify_whether_product_is_in_stock_or_not()"
});
formatter.result({
  "duration": 142996300,
  "status": "passed"
});
formatter.match({
  "location": "automation_stockandadd_step.add_product_to_the_cart()"
});
formatter.result({
  "duration": 7166797400,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "To remove item from cart",
  "description": "",
  "id": "testing-the-cart-features-for-automation--website;to-remove-item-from-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@tc_04_deleteitem"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "launch the automation practice page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "add item to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "open the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "delete the item from cart",
  "keyword": "And "
});
formatter.match({
  "location": "automation_deleteitemincart_step.launch_the_automation_practice_page()"
});
formatter.result({
  "duration": 24573223701,
  "status": "passed"
});
formatter.match({
  "location": "automation_deleteitemincart_step.add_item_to_the_cart()"
});
formatter.result({
  "duration": 8800843800,
  "status": "passed"
});
formatter.match({
  "location": "automation_deleteitemincart_step.open_the_cart()"
});
formatter.result({
  "duration": 6534675000,
  "status": "passed"
});
formatter.match({
  "location": "automation_deleteitemincart_step.delete_the_item_from_cart()"
});
formatter.result({
  "duration": 7834183601,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "To checkout the cart",
  "description": "",
  "id": "testing-the-cart-features-for-automation--website;to-checkout-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@tc_05_checkout"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "launch the automation practice website",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "open cart",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "click on proceed",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "enter delivery details and payment type",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "place order",
  "keyword": "Then "
});
formatter.match({
  "location": "automation_checkout_step.launch_the_automation_practice_website()"
});
formatter.result({
  "duration": 25236520600,
  "status": "passed"
});
formatter.match({
  "location": "automation_checkout_step.open_cart()"
});
formatter.result({
  "duration": 13364501800,
  "status": "passed"
});
formatter.match({
  "location": "automation_checkout_step.click_on_proceed()"
});
formatter.result({
  "duration": 4766139400,
  "status": "passed"
});
formatter.match({
  "location": "automation_checkout_step.enter_delivery_details_and_payment_type()"
});
formatter.result({
  "duration": 3631169000,
  "status": "passed"
});
formatter.match({
  "location": "automation_checkout_step.place_order()"
});
formatter.result({
  "duration": 398474900,
  "status": "passed"
});
formatter.uri("testcase_demo.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the demosite features for Automationtesting Website",
  "description": "",
  "id": "testing-the-demosite-features-for-automationtesting-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Register the website",
  "description": "",
  "id": "testing-the-demosite-features-for-automationtesting-website;register-the-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch the browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Register page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter \"\u003cemailid\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click the register button",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "testing-the-demosite-features-for-automationtesting-website;register-the-website;",
  "rows": [
    {
      "cells": [
        "emailid",
        "",
        "password"
      ],
      "line": 11,
      "id": "testing-the-demosite-features-for-automationtesting-website;register-the-website;;1"
    },
    {
      "cells": [
        "madhu@gmail.com",
        "",
        "madhu@123"
      ],
      "line": 12,
      "id": "testing-the-demosite-features-for-automationtesting-website;register-the-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Register the website",
  "description": "",
  "id": "testing-the-demosite-features-for-automationtesting-website;register-the-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch the browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Register page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter \"madhu@gmail.com\" and \"madhu@123\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click the register button",
  "keyword": "And "
});
formatter.match({
  "location": "automation_register_stepdef.launch_the_browser_and_enter_url()"
});
formatter.result({
  "duration": 39197833399,
  "status": "passed"
});
formatter.match({
  "location": "automation_register_stepdef.register_page_is_opened()"
});
formatter.result({
  "duration": 8365105100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madhu@gmail.com",
      "offset": 7
    },
    {
      "val": "madhu@123",
      "offset": 29
    }
  ],
  "location": "automation_register_stepdef.enter_and(String,String)"
});
formatter.result({
  "duration": 441341800,
  "status": "passed"
});
formatter.match({
  "location": "automation_register_stepdef.click_the_register_button()"
});
formatter.result({
  "duration": 10178332099,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#@tc_02_login"
    },
    {
      "line": 15,
      "value": "# Scenario: Validate the login fuctionality"
    },
    {
      "line": 16,
      "value": "#  Given Launch the browser and enter url"
    },
    {
      "line": 17,
      "value": "# When opened the login page"
    },
    {
      "line": 18,
      "value": "# Then Enter the username and password"
    },
    {
      "line": 19,
      "value": "# And Click the login button"
    }
  ],
  "line": 22,
  "name": "To register the demosite giving Invalid details",
  "description": "",
  "id": "testing-the-demosite-features-for-automationtesting-website;to-register-the-demosite-giving-invalid-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tc_03_Demosite_UserRegister"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "the user launch the browser and url",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "opens the Practice automation website and click_the Demo site button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "enter invalid details",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "automation_invaliddetails_stepdef.the_user_launch_the_browser_and_url()"
});
formatter.result({
  "duration": 24590912500,
  "status": "passed"
});
formatter.match({
  "location": "automation_invaliddetails_stepdef.opens_the_Practice_automation_website_and_click_the_Demo_site_button()"
});
formatter.result({
  "duration": 7416214700,
  "status": "passed"
});
formatter.match({
  "location": "automation_invaliddetails_stepdef.enter_invalid_details()"
});
formatter.result({
  "duration": 2140777801,
  "status": "passed"
});
formatter.match({
  "location": "automation_invaliddetails_stepdef.click_on_submit_button()"
});
formatter.result({
  "duration": 11820459701,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Download the file in the demosite-Filedownload",
  "description": "",
  "id": "testing-the-demosite-features-for-automationtesting-website;download-the-file-in-the-demosite-filedownload",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@tc_04_Demosite_filedownload"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "Open url in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Automation site is opened",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Click on more and click filedownload",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "download the file",
  "keyword": "Then "
});
formatter.match({
  "location": "automation_filedownload_stepdef.open_url_in_the_browser()"
});
formatter.result({
  "duration": 29116640000,
  "status": "passed"
});
formatter.match({
  "location": "automation_filedownload_stepdef.automation_site_is_opened()"
});
formatter.result({
  "duration": 8784418600,
  "status": "passed"
});
formatter.match({
  "location": "automation_filedownload_stepdef.click_on_more_and_click_filedownload()"
});
formatter.result({
  "duration": 666637601,
  "status": "passed"
});
formatter.match({
  "location": "automation_filedownload_stepdef.download_the_file()"
});
formatter.result({
  "duration": 2121293999,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: Element \u003ca id\u003d\"link-to-download\"\u003e could not be scrolled into view\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HEMAN-1997\u0027, ip: \u0027192.168.43.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 75.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200403170909, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 25240, moz:profile: C:\\Users\\Hemanth\\AppData\\Lo..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ee23c892-31c6-446d-9e1a-07f22af8d2da\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.automation_pages.automation_filedownload_page.filedownload(automation_filedownload_page.java:38)\r\n\tat com.automation_stepdefinition.automation_filedownload_stepdef.download_the_file(automation_filedownload_stepdef.java:40)\r\n\tat ✽.Then download the file(testcase_demo.feature:33)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 36,
  "name": "Get the dynamic data in the demosite-DynamicData",
  "description": "",
  "id": "testing-the-demosite-features-for-automationtesting-website;get-the-dynamic-data-in-the-demosite-dynamicdata",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@tc_05_Demosite_Dynamicdata"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "Open the url in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "Automation site is opened and click demosite",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Click on more and click dynamic data",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Click on Dynamic data and get the data",
  "keyword": "Then "
});
formatter.match({
  "location": "automation_dynamicdata_stepdef.open_the_url_in_the_browser()"
});
formatter.result({
  "duration": 25887262500,
  "status": "passed"
});
formatter.match({
  "location": "automation_dynamicdata_stepdef.automation_site_is_opened_and_click_demosite()"
});
formatter.result({
  "duration": 9101456500,
  "status": "passed"
});
formatter.match({
  "location": "automation_dynamicdata_stepdef.click_on_more_and_click_dynamic_data()"
});
formatter.result({
  "duration": 709101500,
  "status": "passed"
});
formatter.match({
  "location": "automation_dynamicdata_stepdef.click_on_Dynamic_data_and_get_the_data()"
});
formatter.result({
  "duration": 11615159000,
  "status": "passed"
});
formatter.uri("testcase_demosite.feature");
formatter.feature({
  "line": 1,
  "name": "to verify the demosite feature on_Practice_Automation",
  "description": "",
  "id": "to-verify-the-demosite-feature-on-practice-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#@TC_01"
    },
    {
      "line": 5,
      "value": "#Scenario: Validate the login fuctionality"
    },
    {
      "line": 6,
      "value": "#Given Launch the browser and enter the url"
    },
    {
      "line": 7,
      "value": "#When Login page is opened"
    },
    {
      "line": 8,
      "value": "#When Enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\""
    },
    {
      "line": 9,
      "value": "#Then Click the login button"
    }
  ],
  "line": 11,
  "name": "Upload file and Remove the uploaded file",
  "description": "",
  "id": "to-verify-the-demosite-feature-on-practice-automation;upload-file-and-remove-the-uploaded-file",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@TC_02"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "the url is opened in the website",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the more is mouse overed and click on the File Upload",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "File is Selected",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "remove the uploaded file",
  "keyword": "Then "
});
formatter.match({
  "location": "RemoveFile_step.the_url_is_opened_in_the_website()"
});
formatter.result({
  "duration": 29677127500,
  "status": "passed"
});
formatter.match({
  "location": "RemoveFile_step.the_more_is_mouse_overed_and_click_on_the_File_Upload()"
});
formatter.result({
  "duration": 14077655500,
  "status": "passed"
});
formatter.match({
  "location": "RemoveFile_step.file_is_Selected()"
});
formatter.result({
  "duration": 5560610201,
  "status": "passed"
});
formatter.match({
  "location": "RemoveFile_step.remove_the_uploaded_file()"
});
formatter.result({
  "duration": 7899186700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Leave mandatory fields and click on register",
  "description": "",
  "id": "to-verify-the-demosite-feature-on-practice-automation;leave-mandatory-fields-and-click-on-register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@TC_03"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "the url is open in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the demosite is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the details are given and leaving the mandatory fields",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click on submit and take screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "Leavemandatory_step.the_url_is_open_in_the_browser()"
});
formatter.result({
  "duration": 28424262200,
  "status": "passed"
});
formatter.match({
  "location": "Leavemandatory_step.the_demosite_is_clicked()"
});
formatter.result({
  "duration": 7230563600,
  "status": "passed"
});
formatter.match({
  "location": "Leavemandatory_step.the_details_are_given_and_leaving_the_mandatory_fields()"
});
formatter.result({
  "duration": 7212698099,
  "status": "passed"
});
formatter.match({
  "location": "Leavemandatory_step.click_on_submit_and_take_screenshot()"
});
formatter.result({
  "duration": 11539950599,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Play the Video in demosite",
  "description": "",
  "id": "to-verify-the-demosite-feature-on-practice-automation;play-the-video-in-demosite",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@TC_04"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "the url is opened in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "the url is launched click on demosite",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "mouseover to the video and click on youtube",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "play the video",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "tap on escape key and quit",
  "keyword": "Then "
});
formatter.match({
  "location": "Videoplay_step.the_url_is_opened_in_the_browser()"
});
formatter.result({
  "duration": 31907926399,
  "status": "passed"
});
formatter.match({
  "location": "Videoplay_step.the_url_is_launched_click_on_demosite()"
});
formatter.result({
  "duration": 10053057800,
  "status": "passed"
});
formatter.match({
  "location": "Videoplay_step.mouseover_to_the_video_and_click_on_youtube()"
});
formatter.result({
  "duration": 4148205300,
  "status": "passed"
});
formatter.match({
  "location": "Videoplay_step.play_the_video()"
});
formatter.result({
  "duration": 62800,
  "status": "passed"
});
formatter.match({
  "location": "Videoplay_step.tap_on_escape_key_and_quit()"
});
formatter.result({
  "duration": 13280347900,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Get Alert message in demosite",
  "description": "",
  "id": "to-verify-the-demosite-feature-on-practice-automation;get-alert-message-in-demosite",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@TC_05"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Opens url in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "automation site is opens",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Click on SwitchTo and alerts",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "get the alert text",
  "keyword": "Then "
});
formatter.match({
  "location": "Alerts_Step.opens_url_in_the_browser()"
});
formatter.result({
  "duration": 25834562500,
  "status": "passed"
});
formatter.match({
  "location": "Alerts_Step.automation_site_is_opens()"
});
formatter.result({
  "duration": 7005703401,
  "status": "passed"
});
formatter.match({
  "location": "Alerts_Step.click_on_SwitchTo_and_alerts()"
});
formatter.result({
  "duration": 525234701,
  "status": "passed"
});
formatter.match({
  "location": "Alerts_Step.get_the_alert_text()"
});
formatter.result({
  "duration": 13605281700,
  "status": "passed"
});
});