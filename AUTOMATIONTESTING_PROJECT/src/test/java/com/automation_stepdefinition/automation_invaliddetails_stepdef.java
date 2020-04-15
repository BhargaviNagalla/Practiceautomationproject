package com.automation_stepdefinition;

import com.automation_pages.automation_invaliddetails_page;
import com.baseclass.LibraryClass;
import com.seleniumutil.selenium_util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class automation_invaliddetails_stepdef extends LibraryClass
{

automation_invaliddetails_page id;
selenium_util util;

@Given("^the user launch the browser and url$")
public void the_user_launch_the_browser_and_url() throws Throwable 
{
	launchApp();
}

@When("^opens the Practice automation website and click_the Demo site button$")
public void opens_the_Practice_automation_website_and_click_the_Demo_site_button() throws Throwable {
	 id = new automation_invaliddetails_page(driver);
	   id.click_demosite();
}

@Then("^enter invalid details$")
public void enter_invalid_details() throws Throwable 
{
	id = new automation_invaliddetails_page(driver);
	id.invaliddetails_register();
}


@Then("^click on submit button$")
public void click_on_submit_button() throws Throwable 
{
	id = new automation_invaliddetails_page(driver);
	id.Submit();
	util = new selenium_util(driver);
	util.takeSnapShot("C:\\Users\\Hemanth\\Desktop\\AUTOMATIONTESTING_COMBINED_PROJECT\\AUTOMATIONTESTING_COMBINED_PROJECT\\Screenshots\\practice_automation_invaliduser_reg.png");
	id.quit();
}
}
