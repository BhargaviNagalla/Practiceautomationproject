package com.automation_stepdefinition;

import java.io.IOException;

import com.automation_pages.EditShippingAddressPage;
import com.automation_pages.automation_acc_login_page;

import com.baseclass.LibraryClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShippingAddressstepdefination extends LibraryClass {
	EditShippingAddressPage Edspage = new EditShippingAddressPage(driver);
	automation_acc_login_page login;
	//To launch chrome browser
	@Given("^open url in a browser_(\\d+)$")
	public void open_url_in_a_browser_(int arg1) throws IOException {
		launchApp();
	}
	//To enter login credentials
	@When("^login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login=new automation_acc_login_page(driver);
		login.clickMyAccount();
		login.automation_username(arg1);
		login.automation_password(arg2);
		login.automation_loginbtn();
		
	}

	
	//To click on address
	@When("^click on the addresses tab$")
	public void click_on_the_addresses_tab() {
		EditShippingAddressPage Edspage = new EditShippingAddressPage(driver);
		Edspage.clickAddresses();
	}
	//To edit shipping address
	@When("^click on edit shipping addresses$")
	public void click_on_edit_shipping_addresses() {
		EditShippingAddressPage Edspage = new EditShippingAddressPage(driver);
		Edspage.editShipping();
	}
	//To fill shipping details
	@When("^fill the shipping details$")
	public void fill_the_shipping_details() {
		EditShippingAddressPage Edspage = new EditShippingAddressPage(driver);
		Edspage.fillShippingDetails();
	}
	//To save address
	@When("^click on save addresses button$")
	public void click_on_save_addresses_button() {
		EditShippingAddressPage Edspage = new EditShippingAddressPage(driver);
		Edspage.clickSaveAddress();
	}
	//Assert
	@Then("^Assert shipping addresses changed successfully$")
	public void assert_shipping_addresses_changed_successfully() throws Exception {
		EditShippingAddressPage Edspage = new EditShippingAddressPage(driver);
		Edspage.AssertShipping();
		Edspage.Screenshot();
		Edspage.quit();
	}


}
