package com.automation_stepdefinition;


import com.automation_pages.automation_acc_login_page;
import com.automation_pages.automation_verify_title_page;
import com.baseclass.LibraryClass;
import com.seleniumutil.selenium_util;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class automation_verifytitle_step extends LibraryClass {

	automation_acc_login_page login;
	automation_verify_title_page verify;
	
	  selenium_util util;
	  
	
	@Given("^launch the automation appliction$")
	public void launch_the_automation_appliction() throws Throwable {
		launchApp();
	}

	@Then("^get the title name$")
	public void get_the_title_name() throws Throwable {
	    verify = new automation_verify_title_page(driver);
	    verify.automation_getacttitle();
	    
	}

	@Then("^compare with expected title$")
	public void compare_with_expected_title() throws Throwable {
		 verify = new automation_verify_title_page(driver);
		 verify.automation_verifytitle();
		 driver.close();
	}

}
