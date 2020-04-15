package com.automation_stepdefinition;

import com.automation_pages.automation_register_page;
import com.baseclass.LibraryClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class automation_register_stepdef extends LibraryClass
{
	automation_register_page register;
	
	@Given("^Launch the browser and enter url$")
	public void launch_the_browser_and_enter_url() throws Throwable
	{
		launchApp();
	}

	@When("^Register page is opened$") 
	public void register_page_is_opened() throws Throwable
	{
		 register = new automation_register_page(driver);
		 register.automation_registerpage();
	}

	@Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String emailid, String password) 
	{
		 register = new automation_register_page(driver);
		 register.automation_email(emailid);
		 register.automation_password(password);
	}

	@Then("^Click the register button$")
	public void click_the_register_button() 
	{
		 register = new automation_register_page(driver);
		 register.click_registerbtn();
		 register.quit();
	}
}
