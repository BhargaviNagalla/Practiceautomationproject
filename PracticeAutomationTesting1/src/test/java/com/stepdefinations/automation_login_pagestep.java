package com.stepdefinations;

import com.pages.automation_login_page;


import baseclass.library;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumutil.selenium_util;

public class automation_login_pagestep extends library {
	automation_login_page login;

	  selenium_util util;
	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		launchApp();
		
	}
	@When("^Login page is opened$")
	public void login_page_is_opened()  {
	    // Write code here that turns the phrase above into concrete actions
		util = new selenium_util(driver);
		
	}
	
	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//login page is called
		login = new  automation_login_page(driver);
		login.clickMyAccount();         //myaccount is clicked
		login.automation_username(arg1);//username is called
		login.automation_password(arg2);//password ia called

	}
	@Then("^Click the login button$")
	public void click_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login = new  automation_login_page(driver);
		login.automation_loginbtn();//login button is clickde
		driver.close();//To close driver
	   
	}
	
}
