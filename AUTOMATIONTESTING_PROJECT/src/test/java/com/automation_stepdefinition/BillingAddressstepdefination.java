package com.automation_stepdefinition;

import java.io.IOException;

import com.automation_pages.EditBillingAddressPage;
import com.automation_pages.automation_acc_login_page;

import com.baseclass.LibraryClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BillingAddressstepdefination extends LibraryClass {
	EditBillingAddressPage Ebillpage = new EditBillingAddressPage(driver);
	automation_acc_login_page login;
	//To launch chrome browser
	@Given("^open url in a browser(\\d+)$")
	public void open_url_in_a_browser(int arg1) throws IOException {
		launchApp();
	
	}
	@When("^login into application with\"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_into_application_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login =new automation_acc_login_page(driver);
		login.clickMyAccount();
		login.automation_username(arg1);
		login.automation_password(arg2);
		 login.automation_loginbtn();
	 
	}

	
	
	//To click on address
	@When("^click on the addresses$")
	public void click_on_the_addresses() {
		EditBillingAddressPage Ebillpage = new EditBillingAddressPage(driver);
		Ebillpage.clickAddresses();
	}
	//To edit billing address
	@When("^click edit billing address$")
	public void click_edit_billing_address() {
		EditBillingAddressPage Ebillpage = new EditBillingAddressPage(driver);
		Ebillpage.editBilling();
	}
	//To fill billing details
	@When("^fill the billing details$")
	public void fill_the_billing_details() {
		EditBillingAddressPage Ebillpage = new EditBillingAddressPage(driver);
		Ebillpage.fillDetails();
	}
	//To save address
	@When("^click save Addresses$")
	public void click_save_Addresses() {
		EditBillingAddressPage Ebillpage = new EditBillingAddressPage(driver);
	   Ebillpage.clickSaveAddresses();
	}
	//Assert
	@Then("^Assert Billing addresses changes successfully$")
	public void assert_Billing_addresses_changes_successfully() throws Exception {
		EditBillingAddressPage Ebillpage = new EditBillingAddressPage(driver);
		Ebillpage.AssertBilling();
		Ebillpage.Screenshot();
		Ebillpage.quit();
	}


}
