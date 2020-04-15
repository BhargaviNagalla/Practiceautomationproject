package com.stepdefinations;

import java.io.IOException;

import com.pages.UpdatePassword;
import com.pages.automation_login_page;

import baseclass.library;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UpdatePasswordstepdefination extends library{
	UpdatePassword udpage=new UpdatePassword(driver);
	automation_login_page login;
	
	//To launch chrome browser
	@Given("^open the url in the browser_(\\d+)$")
	public void open_the_url_in_the_browser_(int arg1) throws IOException {
		launchApp();
	}
	//To login to the project automation application
	@When("^login with the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_the_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//login page is called
		login=new automation_login_page(driver);
		login.clickMyAccount();//Myaccount is clicked
		login.automation_username(arg1);//username is given
		login.automation_password(arg2);//password is given
		login.automation_loginbtn();//login button is clicked
	}
	//To check account details
	@When("^click on the account details$")
	public void click_on_the_account_details() {
		UpdatePassword udpage=new UpdatePassword(driver);
		udpage.clickAccountDetails();//account details is clicked
	}
	//To fill change password
	@When("^upadte details with new password$")
	public void upadte_details_with_new_password() throws Exception {
		UpdatePassword udpage=new UpdatePassword(driver);
		udpage.fillChangePassword();//changed password is given
		Thread.sleep(30);
	}
	//To save changes
	@Then("^click save changes button$")
	public void click_save_changes_button() throws Exception {
		UpdatePassword udpage=new UpdatePassword(driver);
		udpage.Screenshot();//screenshot is taken
		udpage.clickSaveChanges();//click on save changes
	}
	
}
