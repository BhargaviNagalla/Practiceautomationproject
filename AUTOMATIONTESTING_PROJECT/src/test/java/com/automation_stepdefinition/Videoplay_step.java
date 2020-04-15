package com.automation_stepdefinition;
import java.io.IOException;
import com.automation_pages.Videoplay;
import com.baseclass.LibraryClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Videoplay_step extends LibraryClass {
	
	 // Creating the instance for the class Videoplay

	@Given("^the url is opened in the browser$")
	public void the_url_is_opened_in_the_browser() throws IOException {
		launchApp(); // Calling the loginpage method
	}

	@When("^the url is launched click on demosite$")
	public void the_url_is_launched_click_on_demosite() throws InterruptedException {
		Videoplay vp = new Videoplay(driver);
		vp.demosite(); // Calling the vplay method
	}

	@When("^mouseover to the video and click on youtube$")
	public void mouseover_to_the_video_and_click_on_youtube() throws IOException, InterruptedException {
		Videoplay vp = new Videoplay(driver);
		vp.vplay();
		vp.screenshot("Screenshots//play.png"); // Calling the screenshot method
	}

	@When("^play the video$")
	public void play_the_video() throws InterruptedException {
		Videoplay vp = new Videoplay(driver);
	

	}

	@Then("^tap on escape key and quit$")
	public void tap_on_escape_key_and_quit() {
		Videoplay vp = new Videoplay(driver);
		vp.quit(); // Calling the quit method
	}
}