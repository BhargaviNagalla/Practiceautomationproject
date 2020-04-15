package com.automation_stepdefinition;

import com.automation_pages.DemoValidRegPage;
import com.baseclass.LibraryClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoValidRegstepdefination extends LibraryClass{

	DemoValidRegPage vregpage =new DemoValidRegPage(driver);
	//To launch chrome browser
@Given("^open the url in the browser(\\d+)$")
public void open_the_url_in_the_browser(int arg1) throws Throwable {
	launchApp();
}

	//To click on demosite
@When("^click demosite- register menu$")
public void click_demosite_register_menu()  {
	DemoValidRegPage vregpage =new DemoValidRegPage(driver);
	
	vregpage.ClickDemosite();
}
	//To fill valid details
@When("^fill all the valid details$")
public void fill_all_the_valid_details() throws Exception  {
	DemoValidRegPage vregpage =new DemoValidRegPage(driver);
	vregpage.fillValiddetails();
}
	//To click on submit
@Then("^click submit button$")
public void click_submit_button() throws Exception {
	DemoValidRegPage vregpage =new DemoValidRegPage(driver);
	vregpage.clickSubmit();
	vregpage.Screenshot();
	vregpage.quit();
}


}
