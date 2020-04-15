package com.automation_stepdefinition;

import java.io.IOException;

import com.automation_pages.Leavemandatory;
import com.baseclass.LibraryClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Leavemandatory_step extends LibraryClass{
	
 // Creating the reference variable for the Leavemandatory class
													// through the constructor

	@Given("^the url is open in the browser$")
	public void the_url_is_open_in_the_browser() throws IOException {
		launchApp();
		// Calling the login page method
	}

	@When("^the demosite is clicked$")
	public void the_demosite_is_clicked() {
		Leavemandatory lm = new Leavemandatory(driver);
		lm.demo(); // Calling the demo method
	}

	@When("^the details are given and leaving the mandatory fields$")
	public void the_details_are_given_and_leaving_the_mandatory_fields() throws InterruptedException {
		Leavemandatory lm = new Leavemandatory(driver);
		lm.Attributes(); // Calling the attributes method
	}

	@Then("^click on submit and take screenshot$")
	public void click_on_submit_and_take_screenshot() throws InterruptedException, IOException {
		Leavemandatory lm = new Leavemandatory(driver);
		lm.submit(); // Calling the submit method
		lm.screenshot("Screenshots//leavemandatory.png"); // Calling the screenshot method
		lm.quit(); // Calling the quit method
	}

}