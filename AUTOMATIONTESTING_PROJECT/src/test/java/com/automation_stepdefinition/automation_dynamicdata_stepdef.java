package com.automation_stepdefinition;

import com.automation_pages.automation_dynamicdata_page;
import com.baseclass.LibraryClass;
import com.seleniumutil.selenium_util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class automation_dynamicdata_stepdef extends LibraryClass
{
	automation_dynamicdata_page dynamicdata;
	selenium_util util;
	@Given("^Open the url in the browser$")
	public void open_the_url_in_the_browser() throws Throwable 
	{
	   launchApp();
	}
	
	@When("^Automation site is opened and click demosite$")
	public void automation_site_is_opened_and_click_demosite() throws Throwable 
	{
		dynamicdata = new automation_dynamicdata_page(driver);
		dynamicdata.demosite();
	}

	@Then("^Click on more and click dynamic data$")
	public void click_on_more_and_click_dynamic_data() throws Throwable 
	{
		dynamicdata = new automation_dynamicdata_page(driver);
		dynamicdata.dynamicdata_attributes();
	}

	@Then("^Click on Dynamic data and get the data$")
	public void click_on_Dynamic_data_and_get_the_data() throws Throwable 
	{
		dynamicdata = new automation_dynamicdata_page(driver);
		dynamicdata.dynamicdata();
		util = new selenium_util(driver);
		util.takeSnapShot("C:\\Users\\Surya Tja\\Desktop\\selenium\\surya\\AUTOMATIONTESTING_COMBINED_PROJECT\\src\\test\\resources\\screenshots\\practice_automation_cart.png");
		dynamicdata.quit();
	}

}
