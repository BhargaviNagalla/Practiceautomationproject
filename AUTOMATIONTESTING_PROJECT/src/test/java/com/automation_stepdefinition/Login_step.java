package com.automation_stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.automation_pages.Login;
import com.baseclass.LibraryClass;
import com.seleniumutil.selenium_util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_step extends LibraryClass{

	Login lg;
	selenium_util util;
	//= new Login(driver); // Creating instance of the Logout class using the construc
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
		lg = new  Login(driver);
		lg.clickMyAccount();
		lg.automation_username(arg1);
		lg.automation_password(arg2);

	}
	@Then("^Click the login button$")
	public void click_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		lg = new  Login(driver);
		lg.automation_loginbtn();
		driver.close();
	   
	}
}