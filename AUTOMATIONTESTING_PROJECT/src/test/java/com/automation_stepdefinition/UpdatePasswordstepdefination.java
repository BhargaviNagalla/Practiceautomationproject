package com.automation_stepdefinition;

import java.io.IOException;

import com.automation_pages.UpdatePassword;
import com.automation_pages.automation_acc_login_page;
import com.baseclass.LibraryClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UpdatePasswordstepdefination extends LibraryClass{
	UpdatePassword udpage=new UpdatePassword(driver);
	automation_acc_login_page login;
	
	//To launch chrome browser
	@Given("^open the url in the browser_(\\d+)$")
	public void open_the_url_in_the_browser_(int arg1) throws IOException {
		launchApp();
	}
	//To login to the project automation application
	@When("^login with the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_the_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login=new automation_acc_login_page(driver);
		login.clickMyAccount();
		login.automation_username(arg1);
		login.automation_password(arg2);
		login.automation_loginbtn();
	}
	//To check account details
	@When("^click on the account details$")
	public void click_on_the_account_details() {
		UpdatePassword udpage=new UpdatePassword(driver);
		udpage.clickAccountDetails();
	}
	//To fill change password
	@When("^upadte details with new password$")
	public void upadte_details_with_new_password() throws Exception {
		UpdatePassword udpage=new UpdatePassword(driver);
		udpage.fillChangePassword();
		Thread.sleep(30);
	}
	//To save changes
	@Then("^click save changes button$")
	public void click_save_changes_button() throws Exception {
		UpdatePassword udpage=new UpdatePassword(driver);
		
		udpage.clickSaveChanges();
		udpage.Screenshot();
		udpage.quit();
	}
	
}
