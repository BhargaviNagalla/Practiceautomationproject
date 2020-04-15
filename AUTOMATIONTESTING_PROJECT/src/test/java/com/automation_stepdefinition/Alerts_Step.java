package com.automation_stepdefinition;

import java.io.IOException;

import com.automation_pages.Alerts;
import com.baseclass.LibraryClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Alerts_Step extends LibraryClass{
	 // Creating a variable for the Alerts class to use the declared methods

	@Given("^Opens url in the browser$")
	public void opens_url_in_the_browser() throws IOException {
		launchApp();
	}

	@When("^automation site is opens$")
	public void automation_site_is_opens() { // Calling the LoginPage Method
		Alerts st = new Alerts(driver);
		    st.demosite();
	}

	@Then("^Click on SwitchTo and alerts$")
	public void click_on_SwitchTo_and_alerts() throws InterruptedException {
		Alerts st = new Alerts(driver);
		st.alertoperation();; // Calling the alertoperation method

	}

	@Then("^get the alert text$")
	public void get_the_alert_text() throws InterruptedException, IOException {
		Alerts st = new Alerts(driver);
		 // Calling the quit method
		st.gettext(); // Calling the getext method
		

	}

}