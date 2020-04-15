package com.automation_stepdefinition;

import com.automation_pages.automation_deleteitemincart_page;

import com.automation_pages.automation_seeingstock_addtocart_page;
import com.automation_pages.automation_verify_title_page;
import com.baseclass.LibraryClass;
import com.seleniumutil.selenium_util;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class automation_deleteitemincart_step extends LibraryClass {
	
	
	
	  selenium_util util;
	  
	  automation_deleteitemincart_page remove;
	  @Given("^launch the automation practice page$")
	  public void launch_the_automation_practice_page() throws Throwable {
		  launchApp();
	  }

	
	@Then("^add item to the cart$")
	public void add_item_to_the_cart() throws Throwable {
		
		 remove =  new automation_deleteitemincart_page(driver);
		 remove.automation_addtocart();
	}

	@Then("^open the cart$")
	public void open_the_cart() throws Throwable {
	    remove =  new automation_deleteitemincart_page(driver);
	    remove.automation_cartopen();
	}

	@Then("^delete the item from cart$")
	public void delete_the_item_from_cart() throws Throwable {
		   remove =  new automation_deleteitemincart_page(driver);
		    remove.automation_removeitem();
		    driver.quit();
	}

	
}
