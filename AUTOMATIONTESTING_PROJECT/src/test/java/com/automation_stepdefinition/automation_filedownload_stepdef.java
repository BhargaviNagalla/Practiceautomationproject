package com.automation_stepdefinition;

import com.automation_pages.automation_filedownload_page;
import com.baseclass.LibraryClass;
import com.seleniumutil.selenium_util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class automation_filedownload_stepdef extends LibraryClass

{
	automation_filedownload_page filedownload;
	selenium_util util;
	@Given("^Open url in the browser$")
	public void open_url_in_the_browser() throws Throwable 
	{
		launchApp();
	}

	@When("^Automation site is opened$")
	public void automation_site_is_opened() throws Throwable 
	{
	    filedownload = new automation_filedownload_page(driver);
	    filedownload.demosite();
	}

	@Then("^Click on more and click filedownload$")
	public void click_on_more_and_click_filedownload() throws Throwable 
	{
	    filedownload = new automation_filedownload_page(driver);
	    filedownload.filedownload_attributes();
	}

	@Then("^download the file$")
	public void download_the_file() throws Throwable 
	{
	   filedownload = new automation_filedownload_page(driver);
	   filedownload.filedownload();
	   util = new selenium_util(driver);
		util.takeSnapShot("C:\\Users\\Hemanth\\Desktop\\AUTOMATIONTESTING_COMBINED_PROJECT\\AUTOMATIONTESTING_COMBINED_PROJECT\\Screenshots\\practice_automation_filedownload.png");
	   filedownload.quit();
	}
}
