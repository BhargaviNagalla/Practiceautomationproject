package com.stepdefinations;

import com.pages.DemoValidRegPage;

import baseclass.library;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoValidRegstepdefination extends library{

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
	
	vregpage.ClickDemosite();//demo site is clicked
}
	//To fill valid details
@When("^fill all the valid details$")
public void fill_all_the_valid_details() throws Exception  {
	DemoValidRegPage vregpage =new DemoValidRegPage(driver);
	vregpage.fillValiddetails();//valid details are filled
}
	//To click on submit
@When("^click submit button$")
public void click_submit_button() {
	DemoValidRegPage vregpage =new DemoValidRegPage(driver);
	vregpage.clickSubmit();//click on submit
}
	//Assert
@Then("^Assert if it is move to next page$")
public void assert_if_it_is_move_to_next_page() throws Exception  {
	DemoValidRegPage vregpage =new DemoValidRegPage(driver);
	vregpage.AssertValidreg();//assert valid registration
	vregpage.Screenshot();//take screenshot
	vregpage.quit();//To quit browser
}

}
